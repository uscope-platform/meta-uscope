SUMMARY = "uScope Image"
DESCRIPTION = "Custom image for uscope"

require uscope.inc

#THIS PACKAGE NEEDS TO BE REMOVED AS IT CONFLICTS WITH OPENSSH
COMMON_FEATURES_remove = "ssh-server-dropbear"

IMAGE_INSTALL_append = "docker python3-docker-compose python3-jsonschema python3-pip kernel-modules vim lrzsz git openssh"

LICENSE="CLOSED"
LIC_FILES_CHKSUM=""

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://uscope_kernel.cfg"

