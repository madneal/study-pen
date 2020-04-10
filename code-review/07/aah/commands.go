// Copyright (c) Jeevanandam M (https://github.com/jeevatkm)
// Source code and usage is governed by a MIT style
// license that can be found in the LICENSE file.

package aah

import (
	"fmt"
	"os"
	"os/signal"
	"path/filepath"
	"regexp"
	"syscall"
	"time"

	"aahframe.work/aruntime/diagnosis"
	"aahframe.work/config"
	"aahframe.work/console"
	"aahframe.work/essentials"
)

func (a *Application) initCli() {
	bi := a.BuildInfo()
	a.cli.Name = bi.BinaryName
	a.cli.Usage = a.Config().StringDefault("usage", "")
	a.cli.Description = a.Desc()
	if ts, err := time.Parse(time.RFC3339, bi.Timestamp); err == nil {
		a.cli.Compiled = ts
	}
	a.cli.Version = bi.Version
	a.cli.Copyright = a.Config().StringDefault("copyright", "")
	a.cli.Metadata["BuildTimestamp"] = bi.Timestamp
	a.cli.Commands = append([]console.Command{a.cliCmdRun(), a.cliCmdVfs()}, a.cli.Commands...)
	a.cli.Commands = append(a.cli.Commands, a.cliCmdHelp())
	a.cli.HideHelp = true
	a.cli.Flags = []console.Flag{
		console.BoolFlag{
			Name:  "help, h",
			Usage: "Shows app help",
		},
	}
	a.cli.Action = func(c *console.Context) error {
		if c.GlobalBool("help") || c.Bool("h") {
			return console.ShowAppHelp(c)
		}
		args := c.Args()
		if args.Present() {
			return console.ShowCommandHelp(c, args.First())
		}
		return console.ShowAppHelp(c)
	}
	console.VersionFlagDesc("Print app build information")
	console.VersionPrinter(func(c *console.Context) {
		fmt.Fprintf(c.App.Writer, "App Build Info\n")
		fmt.Fprintf(c.App.Writer, "--------------\n")
		fmt.Fprintf(c.App.Writer, "%-12s: %s\n", "Binary Name", bi.BinaryName)
		fmt.Fprintf(c.App.Writer, "%-12s: %s\n", "Version", bi.Version)
		fmt.Fprintf(c.App.Writer, "%-12s: %s\n", "Timestamp", bi.Timestamp)
		fmt.Fprintf(c.App.Writer, "%-12s: %s\n", "aah Version", bi.AahVersion)
		fmt.Fprintf(c.App.Writer, "%-12s: %s\n", "Go Version", bi.GoVersion)
	})
}

func (a *Application) cliCmdHelp() console.Command {
	return console.Command{
		Name:      "help",
		Aliases:   []string{"h"},
		Usage:     "Shows a list of commands or help for one command",
		ArgsUsage: "[command]",
		Action: func(c *console.Context) error {
			args := c.Args()
			if args.Present() {
				return console.ShowCommandHelp(c, args.First())
			}
			return console.ShowAppHelp(c)
		},
	}
}

func (a *Application) cliCmdRun() console.Command {
	return console.Command{
		Name:        "run",
		Aliases:     []string{"r"},
		Usage:       "Runs application server",
		Description: `Runs application server.`,
		Flags: []console.Flag{
			console.StringFlag{
				Name:  "envprofile, e",
				Value: "dev",
				Usage: "Environment profile name to activate (e.g: dev, qa, prod)",
			},
			console.StringFlag{
				Name:  "config, c",
				Usage: "External config `FILE` for adding or overriding 'config/**/*.conf' values",
			},
			console.StringFlag{Name: "importpath", Hidden: true}, // For aah CLI purpose
			console.StringFlag{Name: "proxyport", Hidden: true},  // For aah CLI purpose
		},
		Action: func(c *console.Context) error {
			a.Log().Infof("aah framework v%s, requires >= go1.11", a.BuildInfo().AahVersion)

			// External config file
			extCfgFile := c.String("config")
			if !ess.IsStrEmpty(extCfgFile) {
				cpath, err := filepath.Abs(extCfgFile)
				if err != nil {
					return fmt.Errorf("Unable to resolve external config: %s", extCfgFile)
				}
				extCfg, err := config.LoadFile(cpath)
				if err != nil {
					return fmt.Errorf("Unable to load external config, error: %s", err)
				}
				if err = a.Config().Merge(extCfg); err != nil {
					return fmt.Errorf("Unable to merge external config into aah application[%s]: %s", a.Name(), err)
				}
			}

			envProfile := c.String("envprofile")
			if !ess.IsStrEmpty(envProfile) {
				a.Config().SetString("env.active", envProfile)
			}
			proxyPort := c.String("proxyport")
			if !ess.IsStrEmpty(proxyPort) {
				a.Config().SetString("server.proxyport", proxyPort)
			}

			if err := a.initApp(); err != nil {
				return err
			}

			// Diagnosis and Profiling
			if a.Config().BoolDefault("runtime.diagnosis.enable", false) {
				var err error
				a.diagnosis, err = diagnosis.New(a.Name(), a.Config(), a.Log())
				if err != nil {
					return err
				}
				go a.diagnosis.Run()
			}

			go a.Start()

			// Listen to OS signal's SIGINT & SIGTERM for aah server Shutdown
			sc := make(chan os.Signal, 1)
			signal.Notify(sc, os.Interrupt, syscall.SIGTERM)
			sig := <-sc
			switch sig {
			case os.Interrupt:
				a.Log().Warn("Interrupt signal (SIGINT) received")
			case syscall.SIGTERM:
				a.Log().Warn("Termination signal (SIGTERM) received")
			}

			// aah server shutdown
			if a.diagnosis != nil {
				a.diagnosis.Stop()
			}
			a.Shutdown()
			return nil
		},
	}
}

func (a *Application) cliCmdVfs() console.Command {
	return console.Command{
		Name:    "vfs",
		Aliases: []string{"v"},
		Usage:   "Provides access to app VFS instance to interact with it",
		Description: `Provides access to app VFS instance to interact with it.
	To know more about available 'vfs' sub commands:
		<app-binary> help vfs

	To know more about individual sub-commands details:
		<app-binary> vfs help find`,
		Subcommands: []console.Command{
			{
				Name:    "find",
				Aliases: []string{"f"},
				Usage:   "Finds the embedded file/directory path that matches the given regex pattern",
				Description: `Finds the embedded file/directory path that matches the given regex pattern.
	
		Example:
			<app-binary> vfs find --pattern "conf$"`,
				Flags: []console.Flag{
					console.StringFlag{
						Name:  "pattern, p",
						Usage: "Regex pattern to find the files in the app VFS instance",
					},
				},
				Action: func(c *console.Context) error {
					if !a.VFS().IsEmbeddedMode() {
						fmt.Fprintf(c.App.Writer, "'%s' binary does not have embedded files or not a single binary build.\n",
							a.BuildInfo().BinaryName)
						return nil
					}
					regex, err := regexp.Compile(c.String("pattern"))
					if err != nil {
						return err
					}
					return a.VFS().Walk(a.VirtualBaseDir(), func(fpath string, info os.FileInfo, err error) error {
						if err != nil {
							return err
						}
						if regex.MatchString(fpath) {
							fmt.Fprintf(c.App.Writer, "%10s %7v %15s %s\n",
								info.Mode(), ess.BytesToStr(info.Size()), info.ModTime().Format(time.Stamp), fpath)
						}
						return nil
					})
				},
			},
		},
	}
}
