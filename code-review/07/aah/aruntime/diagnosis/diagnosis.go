// Copyright (c) Jeevanandam M. (https://github.com/jeevatkm)
// Source code and usage is governed by a MIT style
// license that can be found in the LICENSE file.

// Package diagnosis brings feature of aah application profiling to do various diagnosis.
// It support HTTP and File (upcoming) modes.
//
// Documentation and sample config refer to https://docs.aahframework.org/diagnosis.html
package diagnosis

import (
	"errors"
	"fmt"
	"io"
	"net/http"
	"runtime"
	"runtime/pprof"
	"runtime/trace"
	"strings"
	"time"

	"aahframe.work/config"
	"aahframe.work/log"
)

// New method creates new Diagnosis instance to collection various
// insights of application. Such as heap, profile, block, trace
// and mutex.
//
// Basically all capabilities supported by `runtime/pprof` and `runtime/trace`
// brought into HTTP or File mode collection.
func New(appName string, appCfg *config.Config, al log.Loggerer) (*Diagnosis, error) {
	mode := appCfg.StringDefault("runtime.diagnosis.mode", "http")
	d := &Diagnosis{Config: appCfg, Mode: strings.ToLower(mode), appName: appName, log: al}
	if d.IsHTTPMode() {
		d.createHTTPServer()
	} else {
		d.createFiles()
	}
	return d, nil
}

// Diagnosis brings feature of aah application profiling to do various diagnosis.
// It support HTTP and File (upcoming) modes.
//
// Documentation and sample config refer to https://docs.aahframework.org/diagnosis.html
type Diagnosis struct {
	Config             *config.Config
	Mode               string
	appName            string
	server             *http.Server
	log                log.Loggerer
	pathPrefix         string
	serverWriteTimeout time.Duration
}

// IsHTTPMode method returns true if diagnosis enabled in HTTP mode otherwise false.
func (d *Diagnosis) IsHTTPMode() bool {
	return d.Mode == "http"
}

// Run method runs diagnosis solutions on current aah application based on
// given diagnosis configuration on application startup.
func (d *Diagnosis) Run() {
	if d.IsHTTPMode() {
		if err := d.server.ListenAndServe(); err != nil && err != http.ErrServerClosed {
			d.log.Error(err)
		}
		return
	}
	// File Mode upcoming :)

}

// Stop method to stop the diagnosis profiles, server and close file descriptors.
func (d *Diagnosis) Stop() {
	if d.server != nil {
		_ = d.server.Close()
		d.log.Info("aah go diagnosis server shutdown successfully")
	}
	// stop the profilers for file mode and close the file descriptors
}

func (d *Diagnosis) createHTTPServer() {
	d.pathPrefix = "/diagnosis"
	mux := http.NewServeMux()
	mux.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		http.Redirect(w, r, d.pathPrefix, http.StatusMovedPermanently)
	})
	mux.HandleFunc(d.pathPrefix, d.indexHandler)
	mux.HandleFunc(d.pathPrefix+"/", d.indexHandler)
	mux.HandleFunc(d.pathPrefix+"/pprof/", d.dynamicProfileHandler)
	mux.HandleFunc(d.pathPrefix+"/pprof/cmdline", d.cmdlineHandler)
	mux.HandleFunc(d.pathPrefix+"/pprof/profile", d.cpuProfileHandler)
	mux.HandleFunc(d.pathPrefix+"/pprof/symbol", d.symbolHandler)
	mux.HandleFunc(d.pathPrefix+"/pprof/trace", d.traceHandler)
	var err error
	d.serverWriteTimeout, err = time.ParseDuration(d.Config.StringDefault("runtime.diagnosis.http.timeout.write", "2m"))
	if err != nil {
		d.serverWriteTimeout = time.Minute * 2
	}
	d.server = &http.Server{
		Addr:         d.Config.StringDefault("runtime.diagnosis.http.address", ":7070"),
		Handler:      mux,
		WriteTimeout: d.serverWriteTimeout,
	}
}

func (d *Diagnosis) createFiles() {
	// Upcoming feature :)
}

func (d *Diagnosis) cpuProfile(w io.Writer, seconds time.Duration, hz int) error {
	if hz > 0 {
		runtime.SetCPUProfileRate(hz) // https://golang.org/pkg/runtime/#SetCPUProfileRate
	}
	if err := pprof.StartCPUProfile(w); err != nil {
		return fmt.Errorf("diagnosis: could not enable CPU profiling: %s", err)
	}
	if d.IsHTTPMode() {
		d.sleep(w, seconds)
		pprof.StopCPUProfile()
		if hz > 0 {
			runtime.SetCPUProfileRate(0)
		}
	}
	return nil
}

func (d *Diagnosis) trace(w io.Writer, seconds time.Duration) error {
	if err := trace.Start(w); err != nil {
		return fmt.Errorf("diagnosis: could not enable tracing: %s", err)
	}
	if d.IsHTTPMode() {
		d.sleep(w, seconds)
		trace.Stop()
	}
	return nil
}

func (d *Diagnosis) doProfileByName(w io.Writer, name string, gc bool, debug, val int) error {
	p := pprof.Lookup(name)
	if p == nil {
		return errors.New("diagnosis: unknown profile")
	}
	switch name {
	case "heap":
		existingRate := runtime.MemProfileRate
		runtime.MemProfileRate = val // https://golang.org/pkg/runtime/#pkg-variables
		defer func() { runtime.MemProfileRate = existingRate }()
		if gc {
			runtime.GC()
		}
	case "block":
		runtime.SetBlockProfileRate(val) // https://golang.org/pkg/runtime/#SetBlockProfileRate
		defer func() { runtime.SetBlockProfileRate(0) }()
	case "mutex":
		runtime.SetMutexProfileFraction(val) // https://golang.org/pkg/runtime/#SetMutexProfileFraction
		defer func() { runtime.SetMutexProfileFraction(0) }()
	}
	return p.WriteTo(w, debug)
}

func (d *Diagnosis) sleep(w io.Writer, dur time.Duration) {
	var clientGone <-chan bool
	if cn, ok := w.(http.CloseNotifier); ok {
		clientGone = cn.CloseNotify()
	}
	select {
	case <-time.After(dur):
	case <-clientGone:
	}
}
