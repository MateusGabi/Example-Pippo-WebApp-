web: echo "Post-building script starting..."

web: echo "Maven packaging"
web: mvn clean package

web: echo "unzipping dist file"
web: gunzip target/AppPippo-1.0.0.zip

web: echo "starting app"
web: java -jar target/AppPippo-1.0.0/AppPippo-1.0.0.jar