FROM amazoncorretto:17

WORKDIR /app

# Copy the built JAR file from the previous stage
COPY target/Calculator-1.0-SNAPSHOT.jar /app/calculator.jar

# Start up cmd to run the application
ENTRYPOINT ["java", "-jar", "calculator.jar"]