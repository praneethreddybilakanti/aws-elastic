FROM openjdk:8
EXPOSE 9090
ADD target/aws-elastic-0.0.1-SNAPSHOT.jar aws-elastic-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java",".jar","/aws-elastic-0.0.1-SNAPSHOT.jar"]