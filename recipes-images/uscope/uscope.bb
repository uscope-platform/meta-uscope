SUMMARY = "uScope Image"
DESCRIPTION = "Custom image for uscope"

require uscope.inc

#THIS PACKAGE NEEDS TO BE REMOVED AS IT CONFLICTS WITH OPENSSH
COMMON_FEATURES:remove = "ssh-server-dropbear"

IMAGE_INSTALL:append = "docker python3-pip python3-pynacl python3-cryptography kernel-modules vim lrzsz git openssh ssh sshd avahi-daemon"
IMAGE_INSTALL:append = " kernel-module-ucube_lkm e2fsprogs parted e2fsprogs-resize2fs"

LICENSE="CLOSED"
LIC_FILES_CHKSUM=""

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://uscope_kernel.cfg"

IMAGE_CLASSES += " xilinx-bootbin"

