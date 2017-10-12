SUMMARY = "MAVLINK GNURADIo interface code"
HOMEPAGE = "https://github.com/deptofdefense/gr-uaslink"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "gnuradio log4cpp swig-native python-pymavlink"

inherit setuptools cmake

export BUILD_SYS
export HOST_SYS="${MULTIMACH_TARGET_SYS}"

FILES_SOLIBSDEV = ""
FILES_${PN} += "${datadir}/gnuradio/grc/blocks/* ${libdir}/*.so"

PV = "1.0.1+git${SRCPV}"

SRC_URI = "git://github.com/deptofdefense/gr-uaslink;branch=master;protocol=https \
          "
S = "${WORKDIR}/git"


SRCREV = "6434477871d098c94dd8e67d190dc11b530696b4"
