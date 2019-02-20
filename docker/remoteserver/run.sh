#!/bin/sh

# clone repo
cd
git clone "$1" repo

# build and start server
cd repo
mvn clean package exec:java
