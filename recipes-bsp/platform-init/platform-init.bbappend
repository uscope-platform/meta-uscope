
COMPATIBLE_MACHINE:microzed-zynq7 = "microzed-zynq7"
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

do_install:append() {
    install -m 06444 ${THISDIR}/files/ps7_init_gpl.c ${D}${PLATFORM_INIT_DIR}/
    install -m 06444 ${THISDIR}/files/ps7_init_gpl.h ${D}${PLATFORM_INIT_DIR}/
}
