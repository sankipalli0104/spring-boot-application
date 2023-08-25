# Use an official OpenJDK runtime as a parent image
FROM openjdk
# Set the working directory
WORKDIR /app
VOLUME /tmp
# Copy the packaged JAR file into the container at the specified path
COPY target/*.jar /app/app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the JAR file
CMD ["java", "-jar", "app.jar"]