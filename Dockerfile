FROM openjdk:8
MAINTAINER Mohit Bansal mohit.bansal@iiitb.org
COPY ./target/calculator-devops-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculator-devops-1.0-SNAPSHOT.jar"]