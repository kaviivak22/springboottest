# latest oracle openjdk is the basis
FROM openjdk:11.0

# copy jar file into container image under app directory
#COPY target/*.jar app.jar
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# expose server port accept connections
EXPOSE 8080

# start application
ENTRYPOINT ["java","-jar","/app.jar"]