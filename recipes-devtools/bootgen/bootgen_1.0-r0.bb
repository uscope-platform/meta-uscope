SUMMARY = "Xilinx bootgen image creation tool "
DESCRIPTION = "tool that allows creation and conversion of image formats for use with xilinx FPGA and SoCs"
HOMEPAGE = "https://github.com/pyca/pynacl"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d526b6d0807bf263b97da1da876f39b1"


COMPATIBLE_MACHINE = "microzed-zynq7"

SRCREV = "34c4313a09dd75cf6ff5b188136e1a077c5b0aa2"

S = "${WORKDIR}/git"

SRC_URI = "git://github.com/Xilinx/bootgen.git;branch=xlnx-rel-v2021.1"

do_install() {
    install -d ${D}${bindir}
	install -m 644 ${WORKDIR}/git/bootgen ${D}${bindir}
}

do_compile[progress] = "percent"