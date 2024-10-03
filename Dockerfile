FROM maven:latest
WORKDIR /app
COPY pom.xml /app/
COPY src /app/
RUN mvn package
CMD ["java", "-jar", "target/TemperatureConverter1"]
