FROM eclipse-temurin:17
WORKDIR /app
COPY /target/aws-deploy-demo-0.0.1-SNAPSHOT.jar /app/demo-aws.jar
EXPOSE 8080
CMD ["java", "-jar", "demo-aws.jar"]