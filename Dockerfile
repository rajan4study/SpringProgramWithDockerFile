FROM openjdk:8
ADD target/spring-docker-test.jar spring-docker-test.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","spring-docker-test.jar"]
