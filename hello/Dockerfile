#define base docker image
FROM openjdk:11
LABEL maintainer="mounika"
ADD target/hello-0.0.1-SNAPSHOT.jar helloApp.jar
ENTRYPOINT ["java","-jar","helloApp.jar"]