// Copyright (c) Jeevanandam M. (https://github.com/jeevatkm)
// Source code and usage is governed by a MIT style
// license that can be found in the LICENSE file.

package view

import (
	"html/template"
	"path"
	"path/filepath"
	"strings"

	"aahframe.work/config"
	"aahframe.work/log"
	"aahframe.work/vfs"
)

const noLayout = "nolayout"

var (
	commonTemplates *Templates
)

//‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
// type GoViewEngine and its method
//______________________________________________________________________________

// GoViewEngine implements the partial inheritance support with Go templates.
type GoViewEngine struct {
	*EngineBase
}

// Init method initialize a template engine with given aah application config
// and application views base path.
func (e *GoViewEngine) Init(fs *vfs.VFS, appCfg *config.Config, baseDir string) error {
	if e.EngineBase == nil {
		e.EngineBase = new(EngineBase)
	}

	if err := e.EngineBase.Init(fs, appCfg, baseDir, "go", ".html"); err != nil {
		return err
	}

	// Add template func
	AddTemplateFunc(template.FuncMap{
		"safeHTML": e.tmplSafeHTML,
		"import":   e.tmplInclude,
		"include":  e.tmplInclude, // alias for import
	})

	// load common templates
	if err := e.loadCommonTemplates(); err != nil {
		return err
	}

	// collect all layouts
	layouts, err := e.LayoutFiles()
	if err != nil {
		return err
	}

	// load layout templates
	if err = e.loadLayoutTemplates(layouts); err != nil {
		return err
	}

	if !e.IsLayoutEnabled {
		// since pages directory processed above, no error expected here
		_ = e.loadNonLayoutTemplates("pages")
	}

	if e.VFS.IsExists(filepath.Join(e.BaseDir, "errors")) {
		if err = e.loadNonLayoutTemplates("errors"); err != nil {
			return err
		}
	}

	return nil
}

//‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
// GoViewEngine unexported methods
//______________________________________________________________________________

func (e *GoViewEngine) loadCommonTemplates() error {
	commons, err := e.FilesPath("common")
	if err != nil {
		return err
	}

	commonTemplates = &Templates{}
	prefix := path.Dir(e.BaseDir)
	for _, file := range commons {
		if !strings.HasSuffix(file, e.FileExt) {
			log.Warnf("goviewengine: not a valid template extension[%s]: %s", e.FileExt, TrimPathPrefix(prefix, file))
			continue
		}

		log.Tracef("Parsing file: %s", TrimPathPrefix(prefix, file))
		tmpl, err := e.ParseFile(file)
		if err != nil {
			return err
		}
		if err = commonTemplates.Add(tmpl.Name(), tmpl); err != nil {
			return err
		}
	}

	return nil
}

func (e *GoViewEngine) loadLayoutTemplates(layouts []string) error {
	dirs, err := e.DirsPath("pages")
	if err != nil {
		return err
	}

	prefix := path.Dir(e.BaseDir)
	var errs []error
	for _, layout := range layouts {
		layoutKey := strings.ToLower(path.Base(layout))

		for _, dir := range dirs {
			files, err := e.VFS.Glob(path.Join(dir, "*"+e.FileExt))
			if err != nil {
				errs = append(errs, err)
				continue
			}

			for _, file := range files {
				tmplKey := StripPathPrefixAt(filepath.ToSlash(file), "views/")
				tmpl := e.NewTemplate(tmplKey)
				tfiles := []string{layout, file}

				log.Tracef("Parsing files: %s", TrimPathPrefix(prefix, tfiles...))
				if _, err = e.ParseFiles(tmpl, tfiles...); err != nil {
					errs = append(errs, err)
					continue
				}
				if err = e.AddTemplate(layoutKey, tmplKey, tmpl); err != nil {
					errs = append(errs, err)
					continue
				}
			}
		}
	}

	return e.ParseErrors(errs)
}

func (e *GoViewEngine) loadNonLayoutTemplates(scope string) error {
	dirs, err := e.DirsPath(scope)
	if err != nil {
		return err
	}

	prefix := path.Dir(e.BaseDir)
	var errs []error
	for _, dir := range dirs {
		files, err := e.VFS.Glob(path.Join(dir, "*"+e.FileExt))
		if err != nil {
			errs = append(errs, err)
			continue
		}

		for _, file := range files {
			tmplKey := noLayout + "-" + StripPathPrefixAt(filepath.ToSlash(file), "views/")
			tmpl := e.NewTemplate(tmplKey)

			log.Tracef("Parsing file: %s", TrimPathPrefix(prefix, file))
			tstr, err := e.Open(file)
			if err != nil {
				return err
			}
			if tmpl, err = tmpl.Parse(tstr); err != nil {
				errs = append(errs, err)
				continue
			}

			if err = e.AddTemplate(noLayout, tmplKey, tmpl); err != nil {
				errs = append(errs, err)
				continue
			}
		}
	}

	return e.ParseErrors(errs)
}

func init() {
	_ = AddEngine("go", &GoViewEngine{})
}
