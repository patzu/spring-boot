In command prompt enter below mentiond command to create a Java Key Store file:

keytool -genkey -alias davoud-specific -storetype JKS -keyalg RSA -keysize 2048 -validity 365 -keystore https-example.jks

All the parameters provided in command must be the same as properties in application.properties file.

Afterall we can run our web application in browser to test whether we can see our self-signed certificate or not. 


https://localhost:9005/hello
