FROM openjdk:21-ea-21-jdk-slim

EXPOSE 8080

ADD ./target/sbAuthorization-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]