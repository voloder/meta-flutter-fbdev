DESCRIPTION = "Flutter fbdev"
SECTION = "graphics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4f8184c3eaddcdcf4a59cd59cca033e0"

DEPENDS = "flutter-engine"

SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
SRC_URI = "git://github.com/voloder/flutter-fbdev.git;protocol=https;branch=main"

S = "${WORKDIR}/git"

inherit cmake

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/build/flutter_fbdev ${D}${bindir}
}

EXTRA_OECMAKE += "-DCMAKE_SKIP_RPATH=TRUE"

FILES:${PN} += "${bindir}/*"