// Copyright (c) Jeevanandam M. (https://github.com/jeevatkm)
// Source code and usage is governed by a MIT style
// license that can be found in the LICENSE file.

package view

import (
	"html/template"
	"os"
	"path"
	"path/filepath"
	"strings"
	"testing"

	"aahframe.work/vfs"
	"github.com/stretchr/testify/assert"
)

func TestViewAddTemplateFunc(t *testing.T) {
	AddTemplateFunc(template.FuncMap{
		"join":     strings.Join,
		"safeHTML": strings.Join, // for duplicate test, don't mind
	})

	_, found := TemplateFuncMap["join"]
	assert.True(t, found)
}

func TestViewStore(t *testing.T) {
	err := AddEngine("go", &GoViewEngine{})
	assert.NotNil(t, err)
	assert.Equal(t, "view: engine name 'go' is already added, skip it", err.Error())

	err = AddEngine("custom", nil)
	assert.NotNil(t, err)
	assert.Equal(t, "view: engine value is nil", err.Error())

	engine, found := GetEngine("go")
	assert.NotNil(t, engine)
	assert.True(t, found)

	engine, found = GetEngine("myengine")
	assert.Nil(t, engine)
	assert.False(t, found)
}

func TestViewTemplates(t *testing.T) {
	tmpls := &Templates{}

	err := tmpls.Add("views/layouts/master.html", &template.Template{})
	assert.Nil(t, err)

	err = tmpls.Add("views/pages/app/index.html", &template.Template{})
	assert.Nil(t, err)

	keys := tmpls.Keys()
	assert.True(t, len(keys) == 2)

	err = tmpls.Add("views/pages/app/index.html", &template.Template{})
	assert.NotNil(t, err)
	assert.Equal(t, "view: template key exists", err.Error())

	assert.False(t, tmpls.IsExists("not-exixts"))
}

func testdataBaseDir() string {
	wd, _ := os.Getwd()
	return filepath.Join(wd, "testdata")
}

func newVFS() *vfs.VFS {
	fs := new(vfs.VFS)
	_ = fs.AddMount("/testdata", testdataBaseDir())
	return fs
}

func join(s ...string) string {
	return "/" + path.Join(s...)
}
