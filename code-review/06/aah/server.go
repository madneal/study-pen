// Copyright (c) Jeevanandam M. (https://github.com/jeevatkm)
// Source code and usage is governed by a MIT style
// license that can be found in the LICENSE file.

package aah

import (
	"context"
	"crypto/tls"
	"fmt"
	"io/ioutil"
	"net"
	"net/http"
	"os"
	"path/filepath"
	"strconv"
	"strings"

	"aahframe.work/ahttp"
	"aahframe.work/essentials"
	"aahframe.work/internal/settings"
)

//‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
// Application methods
//______________________________________________________________________________

// Start method starts the Go HTTP server based on aah config "server.*".
func (a *Application) Start() {
	defer a.aahRecover()

	if !a.settings.Initialized {
		a.Log().Fatal("aah application is not initialized, call `aah.Init` before the `aah.Start`.")
	}

	sessionMode := "stateless"
	if a.SessionManager().IsStateful() {
		sessionMode = "stateful"
	}

	a.Log().Infof("App Base Directory: %s", a.BaseDir())
	a.Log().Infof("App Virtual Base Directory: %s", a.VirtualBaseDir())
	a.Log().Infof("App Name: %s", a.Name())
	a.Log().Infof("App Build Version: %s", a.BuildInfo().Version)
	a.Log().Infof("App Build Timestamp: %s", a.BuildInfo().Timestamp)
	a.Log().Infof("App Single Binary Mode: %v", a.VFS().IsEmbeddedMode())
	a.Log().Infof("App Profile: %s", a.EnvProfile())
	a.Log().Infof("App TLS/SSL Enabled: %t", a.IsSSLEnabled())
	if a.diagnosis != nil {
		a.Log().Infof("App Diagnosis Enabled: true, mode: %s", a.diagnosis.Mode)
	}
	if a.viewMgr != nil {
		a.Log().Infof("App View Engine: %s", a.viewMgr.engineName)
	}

	a.Log().Infof("App Session Mode: %s", sessionMode)

	if a.Type() == "web" || a.viewMgr != nil {
		a.Log().Infof("App Anti-CSRF Enabled: %t", a.SecurityManager().AntiCSRF.Enabled)
	}

	var routeDomains []string
	for _, d := range a.Router().Domains {
		routeDomains = append(routeDomains, d.Key)
	}
	a.Log().Info("App Route Domains: ", strings.Join(routeDomains, ", "))

	redirectEnabled := a.Config().BoolDefault("server.redirect.enable", false)
	if redirectEnabled {
		a.Log().Infof("App Redirect(%s) Enabled: true", inferRedirectMode(a.Config().StringDefault("server.redirect.to", nonwww)))
	}

	if a.I18n() != nil {
		a.Log().Infof("App i18n Locales: %s", strings.Join(a.I18n().Locales(), ", "))
	}

	if !a.IsEnvProfile(settings.DefaultEnvProfile) {
		a.Log().Infof("App Config Hot-Reload Enabled: %v", a.settings.HotReloadEnabled)
		if a.settings.HotReloadEnabled {
			a.Log().Infof("App Config Hot-Reload Signal: %s", a.settings.HotReloadSignalStr)
		}
	}
	a.Log().Infof("App Shutdown Grace Timeout: %s", a.settings.ShutdownGraceTimeStr)

	if a.Log().IsLevelDebug() {
		a.Log().Debug("Subscribed event callbacks")
		for _, event := range []string{EventOnInit, EventOnStart, EventOnPreShutdown, EventOnPostShutdown, EventOnConfigHotReload} {
			for _, c := range a.EventStore().subscribers[event] {
				a.Log().Debugf("Event: %s (callback=%s priority=%v)", event, ess.GetFunctionInfo(c.Callback).QualifiedName, c.priority)
			}
		}
	}

	// Publish `OnStart` event
	a.EventStore().sortAndPublishSync(&Event{Name: EventOnStart})

	hl := a.Log().ToGoLogger()
	hl.SetOutput(ioutil.Discard)

	a.server = &http.Server{
		Handler:        a,
		ReadTimeout:    a.settings.HTTPReadTimeout,
		WriteTimeout:   a.settings.HTTPWriteTimeout,
		MaxHeaderBytes: a.settings.HTTPMaxHdrBytes,
		ErrorLog:       hl,
	}

	a.server.SetKeepAlivesEnabled(a.Config().BoolDefault("server.keep_alive", true))
	a.writePID()

	go a.listenForHotReload()

	// Unix Socket
	if strings.HasPrefix(a.HTTPAddress(), "unix") {
		a.startUnix()
		return
	}
	if a.diagnosis != nil && a.diagnosis.IsHTTPMode() {
		a.Log().Infof("aah go diagnosis server running on %s",
			a.diagnosis.Config.StringDefault("runtime.diagnosis.http.address", ":7070"))
	}
	a.server.Addr = fmt.Sprintf("%s:%s", a.HTTPAddress(), a.HTTPPort())

	// HTTPS
	if a.IsSSLEnabled() {
		a.startHTTPS()
		return
	}

	// HTTP
	a.startHTTP()
}

// Shutdown method allows aah server to shutdown gracefully with given timeout
// in seconds. It's invoked on OS signal `SIGINT` and `SIGTERM`.
//
// Method performs:
//    - Graceful server shutdown with timeout by `server.timeout.grace_shutdown`
//    - Publishes `OnPostShutdown` event
//    - Exits program with code 0
func (a *Application) Shutdown() {
	// Publish `OnPreShutdown` event
	a.EventStore().sortAndPublishSync(&Event{Name: EventOnPreShutdown})

	ctx, cancel := context.WithTimeout(context.Background(), a.settings.ShutdownGraceTimeout)
	defer cancel()

	a.Log().Warn("aah go server graceful shutdown triggered with timeout of ", a.settings.ShutdownGraceTimeStr)
	if err := a.server.Shutdown(ctx); err != nil && err != http.ErrServerClosed {
		a.Log().Error(err)
	}
	a.shutdownRedirectServer()
	a.Log().Info("aah go server shutdown successfully")

	// Publish `OnPostShutdown` event
	a.EventStore().sortAndPublishSync(&Event{Name: EventOnPostShutdown})
}

//‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
// app Unexported methods
//______________________________________________________________________________

func (a *Application) writePID() {
	// Get the application PID
	a.settings.Pid = os.Getpid()

	pidFile := a.Config().StringDefault("pid_file", "")
	if ess.IsStrEmpty(pidFile) {
		pidFile = filepath.Join(a.BaseDir(), a.binaryFilename())
	}

	if !strings.HasSuffix(pidFile, ".pid") {
		pidFile += ".pid"
	}

	if err := ioutil.WriteFile(pidFile, []byte(strconv.Itoa(a.settings.Pid)), 0644); err != nil {
		a.Log().Error(err)
	}
}

func (a *Application) startUnix() {
	sockFile := a.HTTPAddress()[5:]
	if err := os.Remove(sockFile); !os.IsNotExist(err) {
		a.Log().Fatal(err)
	}

	listener, err := net.Listen("unix", sockFile)
	if err != nil {
		a.Log().Fatal(err)
		return
	}

	a.server.Addr = a.HTTPAddress()
	a.Log().Infof("aah go server running on %v", a.server.Addr)
	if err := a.server.Serve(listener); err != nil && err != http.ErrServerClosed {
		a.Log().Error(err)
	}
}

func (a *Application) startHTTPS() {
	// Add cert, if let's encrypt enabled
	if a.IsLetsEncryptEnabled() {
		a.Log().Infof("Let's Encypyt CA Cert enabled")
		a.server.TLSConfig = a.settings.Autocert.TLSConfig()
		a.settings.SSLCert, a.settings.SSLKey = "", ""
	} else {
		if a.tlsCfg != nil {
			a.Log().Info("Adding user provided TLS Config")
			a.server.TLSConfig = a.tlsCfg
		}
		a.Log().Infof("SSLCert: %s, SSLKey: %s", a.settings.SSLCert, a.settings.SSLKey)
	}

	// Disable HTTP/2, if configured
	if a.Config().BoolDefault("server.ssl.disable_http2", false) {
		// To disable HTTP/2 is-
		//  - Don't add "h2" to TLSConfig.NextProtos
		//  - Initialize TLSNextProto with empty map
		// Otherwise Go will enable HTTP/2 by default. It's not gonna listen to you :)
		if a.server.TLSConfig != nil {
			var nextProtos []string
			for _, p := range a.server.TLSConfig.NextProtos {
				if p != "h2" {
					nextProtos = append(nextProtos, p)
				}
			}
			a.server.TLSConfig.NextProtos = nextProtos
		}
		a.server.TLSNextProto = make(map[string]func(*http.Server, *tls.Conn, http.Handler))
	}

	// start HTTP redirect server if enabled
	go a.startHTTPRedirect()

	a.printStartupNote()
	if err := a.server.ListenAndServeTLS(a.settings.SSLCert, a.settings.SSLKey); err != nil && err != http.ErrServerClosed {
		a.Log().Error(err)
	}
}

func (a *Application) startHTTP() {
	a.printStartupNote()
	if err := a.server.ListenAndServe(); err != nil && err != http.ErrServerClosed {
		a.Log().Error(err)
	}
}

func (a *Application) startHTTPRedirect() {
	cfg := a.Config()
	keyPrefix := "server.ssl.redirect_http"
	if !cfg.BoolDefault(keyPrefix+".enable", false) {
		if a.IsLetsEncryptEnabled() {
			a.Log().Fatalf("Enable HTTP => HTTPS redirect (server.ssl.redirect_http), its required by Let's Encrypt. " +
				" Read more https://community.letsencrypt.org/t/important-what-you-need-to-know-about-tls-sni-validation-issues/50811, " +
				"https://github.com/golang/go/issues/21890")
		}
		return
	}

	address := a.HTTPAddress()
	toPort := a.parsePort(cfg.StringDefault("server.port", settings.DefaultHTTPPort))
	fromPort, found := cfg.String(keyPrefix + ".port")
	if !found {
		a.Log().Errorf("'%s.port' is required value, unable to start redirect server", keyPrefix)
		return
	}
	redirectCode := cfg.IntDefault(keyPrefix+".code", http.StatusTemporaryRedirect)

	a.Log().Infof("aah go redirect server running on %s:%s", address, fromPort)
	a.redirectServer = &http.Server{
		Addr: address + ":" + fromPort,
		Handler: http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {
			if r.Method != ahttp.MethodGet && r.Method != ahttp.MethodHead {
				http.Error(w, "Use HTTPS", http.StatusBadRequest)
				return
			}
			target := "https://" + parseHost(r.Host, toPort) + r.URL.RequestURI()
			http.Redirect(w, r, target, redirectCode)
		}),
	}

	if err := a.redirectServer.ListenAndServe(); err != nil && err != http.ErrServerClosed {
		a.Log().Error(err)
	}
}

func (a *Application) shutdownRedirectServer() {
	if a.redirectServer != nil {
		_ = a.redirectServer.Close()
	}
}

func (a *Application) printStartupNote() {
	port := firstNonZeroString(
		a.Config().StringDefault("server.port", settings.DefaultHTTPPort),
		a.Config().StringDefault("server.proxyport", ""))
	a.Log().Infof("aah go server running on %s:%s", a.HTTPAddress(), a.parsePort(port))
}

func parseHost(address, toPort string) string {
	host, _, err := net.SplitHostPort(address)
	if err != nil {
		return address
	}

	if ess.IsStrEmpty(toPort) {
		return host
	}
	return host + ":" + toPort
}

func firstNonZeroString(values ...string) string {
	for _, v := range values {
		v = strings.TrimSpace(v)
		if len(v) > 0 {
			return v
		}
	}
	return ""
}

func inferRedirectMode(redirectTo string) string {
	if redirectTo == www {
		return nonwww + " ==> " + www
	}
	return www + " ==> " + nonwww
}
