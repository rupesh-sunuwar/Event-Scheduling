# Use the official OpenJDK base image
FROM openjdk:20

ADD build/libs/event-scheduling-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["Java","-jar","app.jar"]
