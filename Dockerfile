# Step 1: Use Java image
FROM openjdk:22-jdk-slim

# Step 2: Add jar file
ARG JAR_FILE=target/Course-Registration-System-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Step 3: Run the jar
ENTRYPOINT ["java","-jar","/app.jar"]

# Expose port 8080
EXPOSE 8080