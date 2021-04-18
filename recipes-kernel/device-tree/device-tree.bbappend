FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
 
SYSTEM_USER_DTSI ?= "uscope_module.dtsi"
 
SRC_URI_append = " file://${SYSTEM_USER_DTSI}"
 
do_configure_append() {
        cp ${WORKDIR}/${SYSTEM_USER_DTSI} ${B}/device-tree
        echo "/include/ \"${SYSTEM_USER_DTSI}\"" >> ${B}/device-tree/system-top.dts
}