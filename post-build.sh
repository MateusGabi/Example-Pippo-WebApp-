#!/bin/bash

echo "Post-building script starting..."

echo "Maven packaging"
mvn clean package

echo "unzipping dist file"
gunzip target/AppPippo-1.0.0.zip

echo "starting app"
java -jar target/AppPippo-1.0.0/AppPippo-1.0.0.jar