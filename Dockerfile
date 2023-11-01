#define base docker image
FROM openjdk:17
#LABEL maintainer ="javaguides.net"
#WORKDIR /devops_Test
COPY ./demo/target/demo-0.0.1-SNAPSHOT.jar  /app/app.jar
#EXPOSE 8080
CMD ["java", "-jar", "/app.jar"]

