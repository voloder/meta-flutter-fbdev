DESCRIPTION = "Flutter fbdev"
SECTION = "graphics"

DEPENDS = "flutter-engine"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "fd5a194e1b4e9b2d366309b1a2250b7a05e1a2ec"
SRC_URI = "git://github.com/voloder/flutter-fbdev.git"

S = "${WORKDIR}/git"

inherit cmake

