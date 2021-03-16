# download the image to run java, alpine is the bare minimum version
FROM openjdk:8-jdk-alpine

#change the working directory
WORKDIR /opt/app

ARG JAR_FILE=./target/springboot-docker-compose.jar

#copy jar file from our target folder to the container
COPY ${JAR_FILE} app.jar

#specify initial command to run
ENTRYPOINT ["java", "-jar", "app.jar"]