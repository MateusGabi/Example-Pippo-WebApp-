#!/bin/bash

echo "Post-building script starting..."

echo "checking..."

mvn -v
unzip -v
java -v

echo "Maven packaging"
mvn clean package

echo "unzipping dist file"
unzip target/AppPippo-1.0.0.zip -d dist

echo "starting app"
java -jar dist/AppPippo-1.0.0.jar