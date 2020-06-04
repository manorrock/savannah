#!/bin/sh

#
# Set JAGORNET_DHCP_HOME
#

JAGORNET_DHCP_HOME=/usr/local/savannah

cd $JAGORNET_DHCP_HOME

java -cp "conf:lib/*" -Djava.awt.headless=true -Djagornet.dhcp.home="$JAGORNET_DHCP_HOME" com.jagornet.dhcp.server.JagornetDhcpServer