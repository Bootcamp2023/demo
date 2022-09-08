#Download a base image which is having Java
FROM rightctrl/java

#Copy the application artifact
COPY target/*.jar app.jar

#Mention which port the application listens
#Springboot port
EXPOSE 8080

#Run the java process as root user
USER root

#Start java as a starting process with the application jar as a parameter
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar”,”target/app.jar"]
