SUMMARY = "A console-only image with a development/debug \
environment suitable for building GNURadio out of tree blocks installed."

EXTRA_IMAGE_FEATURES += "tools-debug tools-profile tools-sdk dev-pkgs dbg-pkgs\
                  "
LICENSE = "MIT"

EXTRA_IMAGE_FEATURES_remove_ettus-e1xx = "tools-profile"

require recipes-images/images/native-sdk.inc
require recipes-images/images/gnuradio-image.bb

CORE_IMAGE_EXTRA_INSTALL += "\
    packagegroup-sdr-gnuradio-extended \
    python-future \
    python-pymavlink \
    gnuradio-pmt \
    gnuradio-dev \
    gnuradio-dbg \
    gr-uaslink \
    gr-mapper \
    gr-burst \
    gr-eventstream \
    python-pyserial \
    "
