FROM openjdk:17-jdk-alpine

EXPOSE 8080

COPY target/reactivespringtest-0.0.1-SNAPSHOT.jar java-app.jar

ENTRYPOINT ["java","-jar","java-app.jar"]