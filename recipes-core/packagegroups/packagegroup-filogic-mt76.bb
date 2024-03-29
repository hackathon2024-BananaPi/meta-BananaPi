SUMMARY = "Custom wifi driver mt76 image package group for filogic boards"

LICENSE = "MIT"

inherit packagegroup


PACKAGES = " \
	  packagegroup-filogic-mt76 \
	"

RDEPENDS_packagegroup-filogic-mt76 = " \
    packagegroup-core-boot \
    wireless-tools \
    hostapd \
    wpa-supplicant \
    wireless-regdb-static \
    linux-mac80211 \
    linux-mt76 \
    iw \
    ubus  \
    ubusd \
    usteer \
    uci \
    mt76-vendor \
    atenl \
    mt76-test \
    iwinfo \
    "
