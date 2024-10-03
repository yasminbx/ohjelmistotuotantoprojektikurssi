# Use the latest Maven image to build the project
FROM maven:latest AS build

# Set the working directory inside the container
WORKDIR /app


COPY pom.xml /app/
COPY src /app/src/

RUN mvn clean package

FROM openjdk:17-jdk-alpine

WORKDIR /app


COPY --from=build /app/target/assingments-1.0-SNAPSHOT.jar /app/assingments-1.0-SNAPSHOT.jar


CMD ["java", "-jar", "assingments-1.0-SNAPSHOT.jar"]
