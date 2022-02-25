FROM openjdk:8
EXPOSE 8080
ADD target/k8demo-0.0.1-SNAPSHOT.jar k8demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/k8demo-0.0.1-SNAPSHOT.jar"]