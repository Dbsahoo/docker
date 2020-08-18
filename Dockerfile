FROM openjdk:14
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} SampleDocker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SampleDocker-0.0.1-SNAPSHOT.jar"]
