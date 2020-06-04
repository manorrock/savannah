#
# Use Debian
#
FROM debian

#
# Update Debian and install curl, gnupg2, gzip, software-properties-common and 
# tar.
#
RUN apt-get update && \
    apt-get upgrade -y && \
    apt-get install -y curl gnupg2 gzip software-properties-common tar && \
    rm -rf /var/lib/apt/lists/*

#
# Install AdoptOpenJDK 11.
#
RUN cd /usr/local && \
    curl --insecure -L -O https://github.com/AdoptOpenJDK/openjdk11-binaries/releases/download/jdk-11.0.7%2B10/OpenJDK11U-jdk_x64_linux_hotspot_11.0.7_10.tar.gz && \
    tar xfvz OpenJDK11U-jdk_x64_linux_hotspot_11.0.7_10.tar.gz && \
    mv jdk-11.0.7+10 jdk && \
    rm OpenJDK11U-jdk_x64_linux_hotspot_11.0.7_10.tar.gz

#
# Setup PATH
#
ENV PATH=$PATH:/usr/local/jdk/bin

#
# Add the Manorrock Savannah distribution.
#
ADD target/savannah.tar.gz /usr/local

#
# Set the WORKDIR
#
WORKDIR /usr/local/savannah/bin

#
# Start Manorrock Savannah
#
CMD "/usr/local/savannah/bin/start.sh"
