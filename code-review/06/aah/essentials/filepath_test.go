// Copyright (c) Jeevanandam M. (https://github.com/jeevatkm)
// Source code and usage is governed by a MIT style
// license that can be found in the LICENSE file.

package ess

import (
	"io/ioutil"
	"os"
	"runtime"
	"strings"
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestIsFileExists(t *testing.T) {
	testdataPath := getTestdataPath()

	assert.Equal(t, true, IsFileExists(join(testdataPath, "sample.txt")))
	assert.Equal(t, false, IsFileExists(join(testdataPath, "sample-not-exists.txt")))

	assert.Equal(t, true, IsFileExists(testdataPath))
	assert.Equal(t, false, IsFileExists("testdata-not-exists"))
}

func TestIsDirEmpty(t *testing.T) {
	testdataPath := getTestdataPath()

	assert.Equal(t, false, IsDirEmpty(testdataPath))
	assert.Equal(t, true, IsDirEmpty("testdata-not-exists.txt"))

	dirPath := join(testdataPath, "path", "isdirempty")
	_ = MkDirAll(dirPath, 0755)
	assert.Equal(t, true, IsDirEmpty(dirPath))
}

func TestIsDir(t *testing.T) {
	testdataPath := getTestdataPath()

	result := IsDir(testdataPath)
	assert.True(t, result)

	result = IsDir(join(testdataPath, "sample.txt"))
	assert.False(t, result)

	result = IsDir(join(testdataPath, "not-exists.txt"))
	assert.False(t, result)
}

func TestLineCntByFilePath(t *testing.T) {
	count := LineCnt(join(getTestdataPath(), "sample.txt"))
	assert.Equal(t, 20, count)

	count = LineCnt(join(getTestdataPath(), "sample-not.txt"))
	assert.Equal(t, 0, count)
}

func TestLineCntByReader(t *testing.T) {
	file, err := os.Open(join(getTestdataPath(), "sample.txt"))
	assert.Nil(t, err, "unable to open file")
	defer CloseQuietly(file)

	assert.Equal(t, 20, LineCntr(file))
}

func TestExcludes(t *testing.T) {
	errExcludes := Excludes{
		".*",
		"DS_Store.bak",
		"[^",
		"[]a]",
	}
	assert.Equal(t, true, errExcludes.Validate() != nil)

	excludes := Excludes{
		".*",
		"*.bak",
		"*.tmp",
		"tmp",
	}
	assert.Equal(t, nil, excludes.Validate())
}

func TestCopyFile(t *testing.T) {
	testdataPath := getTestdataPath()

	_, err := CopyFile(
		join(testdataPath, "file-found.txt"),
		join(testdataPath, "file-not-exists.txt"),
	)
	assert.NotNil(t, err)

	_, err = CopyFile(
		join(testdataPath, "sample.txt"),
		join(testdataPath, "sample.txt"),
	)
	assert.NotNil(t, err)

	if runtime.GOOS != "windows" {
		_, err = CopyFile(
			"/var/you-will-not-be-able-to-create.txt",
			join(testdataPath, "sample.txt"),
		)
		assert.NotNil(t, err)
	}
}

func TestCopyDir(t *testing.T) {
	testdataPath := getTestdataPath()
	tmpDir := os.TempDir()

	defer DeleteFiles(join(tmpDir, "test1"))

	err1 := CopyDir(
		join(tmpDir, "target"),
		join(testdataPath, "not-exists-dir"),
		Excludes{},
	)
	assert.NotNil(t, err1)

	err2 := CopyDir(
		join(tmpDir, "target"),
		join(testdataPath, "sample.txt"),
		Excludes{},
	)
	assert.NotNil(t, err2)

	// err3 := CopyDir(tmpDir, testdataPath, Excludes{})
	// assert.True(t, strings.HasPrefix(err3.Error(), "destination dir already exists"))

	err4 := CopyDir(join(tmpDir, "target"), testdataPath, Excludes{"[]a]"})
	assert.NotNil(t, err4)

	pwd, _ := os.Getwd()
	err5 := CopyDir(join(tmpDir, "test1"), pwd, Excludes{"test*", "*conf", ".*"})
	assert.Nil(t, err5, "copy directory failed")
}

func TestStripExt(t *testing.T) {
	name1 := StripExt("/sample/path/to/file/working.txt")
	assert.Equal(t, "/sample/path/to/file/working", name1)

	name2 := StripExt("woriking-fine.pdf")
	assert.Equal(t, "woriking-fine", name2)

	name3 := StripExt("")
	assert.Equal(t, "", name3)

	name4 := StripExt("myname")
	assert.Equal(t, "myname", name4)
}

func TestDirPaths(t *testing.T) {
	testdataPath := getTestdataPath()
	path1 := join(testdataPath, "dirpaths", "level1", "level2", "level3")
	path11 := join(testdataPath, "dirpaths", "level1", "level1-1")
	path12 := join(testdataPath, "dirpaths", "level1", "level1-2")
	path21 := join(testdataPath, "dirpaths", "level1", "level2", "level2-1")
	path22 := join(testdataPath, "dirpaths", "level1", "level2", "level2-2")
	defer DeleteFiles(join(testdataPath, "dirpaths"))

	_ = MkDirAll(path1, 0755)
	_ = MkDirAll(path11, 0755)
	_ = MkDirAll(path12, 0755)
	_ = MkDirAll(path21, 0755)
	_ = MkDirAll(path22, 0755)

	dirs, err := DirsPath(join(testdataPath, "dirpaths"), true)
	assert.Nil(t, err, "unable to get directory list")
	assert.True(t, IsSliceContainsString(dirs, path1))
	assert.True(t, IsSliceContainsString(dirs, path11))
	assert.True(t, IsSliceContainsString(dirs, path12))
	assert.True(t, IsSliceContainsString(dirs, path21))
	assert.True(t, IsSliceContainsString(dirs, path22))
	assert.False(t, IsSliceContainsString(dirs, join(path22, "not-exists")))

	dirs, err = DirsPath(join(testdataPath, "dirpaths", "level1"), false)
	assert.Nil(t, err, "unable to get directory list")
	assert.True(t, IsSliceContainsString(dirs, path11))
	assert.True(t, IsSliceContainsString(dirs, path12))
	assert.False(t, IsSliceContainsString(dirs, join(path22, "not-exists")))

	dirs, err = DirsPathExcludes(
		join(testdataPath, "dirpaths"),
		true,
		Excludes{"./level1/level1-2", "level1/level2/level2-2"},
	)
	assert.Nil(t, err, "unable to get directory list")
	assert.True(t, len(dirs) == 6)
}

func TestFilesPath(t *testing.T) {
	testdataPath := getTestdataPath()
	path1 := join(testdataPath, "dirpaths", "level1", "level2", "level3")
	path11 := join(testdataPath, "dirpaths", "level1", "level1-1")
	path12 := join(testdataPath, "dirpaths", "level1", "level1-2")
	path21 := join(testdataPath, "dirpaths", "level1", "level2", "level2-1")
	path22 := join(testdataPath, "dirpaths", "level1", "level2", "level2-2")
	defer DeleteFiles(join(testdataPath, "dirpaths"))

	_ = MkDirAll(path1, 0755)
	_ = MkDirAll(path11, 0755)
	_ = MkDirAll(path12, 0755)
	_ = MkDirAll(path21, 0755)
	_ = MkDirAll(path22, 0755)

	_ = ioutil.WriteFile(join(path1, "file1.txt"), []byte("file1.txt"), 0600)
	_ = ioutil.WriteFile(join(path11, "file11.txt"), []byte("file11.txt"), 0600)
	_ = ioutil.WriteFile(join(path12, "file12.txt"), []byte("file12.txt"), 0600)
	_ = ioutil.WriteFile(join(path21, "file21.txt"), []byte("file21.txt"), 0600)
	_ = ioutil.WriteFile(join(path22, "file22.txt"), []byte("file22.txt"), 0600)

	files, err := FilesPath(join(testdataPath, "dirpaths"), true)
	assert.Nil(t, err)
	assert.True(t, strings.HasSuffix(files[0], "file11.txt"))
	assert.True(t, strings.HasSuffix(files[1], "file12.txt"))
	assert.True(t, strings.HasSuffix(files[2], "file21.txt"))
	assert.True(t, strings.HasSuffix(files[3], "file22.txt"))
	assert.True(t, strings.HasSuffix(files[4], "file1.txt"))

	files, err = FilesPath(path11, false)
	assert.Nil(t, err)
	assert.True(t, strings.HasSuffix(files[0], "file11.txt"))

	files, err = FilesPathExcludes(
		join(testdataPath, "dirpaths"),
		true,
		Excludes{"./level1/level1-2/file12.txt", "level1/level2/level2-2/file22.txt"},
	)
	assert.Nil(t, err)
	assert.True(t, len(files) == 3)
}
