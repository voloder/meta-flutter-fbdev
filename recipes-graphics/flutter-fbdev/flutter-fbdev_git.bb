DESCRIPTION = "Flutter fbdev"
SECTION = "graphics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2348605ab7c29b1d0aeeeae3d06518e8"

DEPENDS = "flutter-engine"

SRCREV = "fd5a194e1b4e9b2d366309b1a2250b7a05e1a2ec"
SRC_URI = "git://github.com/voloder/flutter-fbdev.git"

S = "${WORKDIR}/git"

inherit cmake

