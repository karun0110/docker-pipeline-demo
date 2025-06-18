FROM openjdk:21
EXPOSE 8080
ADD target/docker-pipeline-demo.jar docker-pipeline-demo.jar
ENTRYPOINT ["java", "-jar", "/docker-pipeline-demo.jar"]