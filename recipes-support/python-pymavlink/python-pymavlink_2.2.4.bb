SUMMARY = "A high-level Python efficient arrays of booleans -- C extension"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"
SECTION = "devel/python"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=5f2b5916a5ba209599b05caf27ce7dc4"
DEPENDS = "python-future-native python-pyserial"
SRCNAME = "pymavlink"

#SRC_URI = "https://pypi.python.org/packages/source/p/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"
#SRC_URI = "https://pypi.python.org/packages/56/70/30b38df88549b7277d5fb1e16b559a23e3aa870bb7fe9a6837a46b10fb0f/pymavlink-2.2.4.tar.gz"

SRC_URI[md5sum] = "102205d177931ee1e53facc2f1bba288"
SRC_URI[sha256sum] = "a7a825271b1fd26dc5ef64a1238a3faf83188264c3c9a7adf23921f855813997"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit pypi setuptools
PYPI_PACKAGE = "pymavlink"

FILES_${PN} += "${datadir}/pymavlink"

BBCLASSEXTEND = "nativesdk"
