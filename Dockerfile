FROM openjdk:8
MAINTAINER Mike Schlosser<schlo201@d.umn.edu>
COPY build/libs/*.jar /app/topic-manager.jar
ENTRYPOINT ["java", "-jar", "/app/topic-manager.jar"]