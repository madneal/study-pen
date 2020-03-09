// Copyright (c) Jeevanandam M. (https://github.com/jeevatkm)
// Source code and usage is governed by a MIT style
// license that can be found in the LICENSE file.

package ess

import (
	"fmt"
	"regexp"
	"strconv"
	"strings"
)

// Byte unit value
const (
	ByteSize     = 1.0
	KiloByteSize = 1024 * ByteSize
	MegaByteSize = 1024 * KiloByteSize
	GigaByteSize = 1024 * MegaByteSize
	TeraByteSize = 1024 * GigaByteSize
)

var sizePattern = regexp.MustCompile(`(?i)^(\d+)([kmgt]?[i]?[b?|b])$`)

// StrToBytes method returns bytes value for given string value.
//    For e.g.:
//      2mb ==> 2097152 bytes
//      2MB ==> 2097152 bytes
//      2MiB ==> 2097152 bytes
func StrToBytes(value string) (int64, error) {
	segments := sizePattern.FindStringSubmatch(strings.TrimSpace(value))
	if len(segments) < 3 {
		return 0, fmt.Errorf("format: invalid input '%s'", value)
	}

	unitValue, err := strconv.ParseInt(segments[1], 10, 0)
	if err != nil {
		return 0, fmt.Errorf("format: unable to parse '%d'", unitValue)
	}

	var bytes int64
	unit := strings.ToLower(segments[2])
	switch unit[:1] {
	case "t":
		bytes = unitValue * TeraByteSize
	case "g":
		bytes = unitValue * GigaByteSize
	case "m":
		bytes = unitValue * MegaByteSize
	case "k":
		bytes = unitValue * KiloByteSize
	case "b":
		bytes = unitValue * ByteSize
	}

	return bytes, nil
}

// BytesToStr method return given bytes size into readable string format.
//    For e.g.:
//      2097152 bytes ==> 2MB
func BytesToStr(value int64) string {
	var rs string
	switch {
	case value > TeraByteSize:
		m := value / TeraByteSize
		r := value % TeraByteSize
		rs = fmt.Sprintf("%.1fTB", float64(m)+float64(r)/float64(TeraByteSize))
	case value > GigaByteSize:
		m := value / GigaByteSize
		r := value % GigaByteSize
		rs = fmt.Sprintf("%.1fGB", float64(m)+float64(r)/float64(GigaByteSize))
	case value > MegaByteSize:
		m := value / MegaByteSize
		r := value % MegaByteSize
		rs = fmt.Sprintf("%.1fMB", float64(m)+float64(r)/float64(MegaByteSize))
	case value > KiloByteSize:
		m := value / KiloByteSize
		r := value % KiloByteSize
		rs = fmt.Sprintf("%.1fKB", float64(m)+float64(r)/float64(KiloByteSize))
	default:
		rs = fmt.Sprintf("%dB", value)
	}
	return strings.Replace(rs, ".0", "", -1)
}
