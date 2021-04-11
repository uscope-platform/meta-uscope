DEPENDS = "avahi"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://avahi-daemon.conf"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/avahi
    install ${WORKDIR}/avahi-daemon.conf ${D}${sysconfdir}/avahi
}
