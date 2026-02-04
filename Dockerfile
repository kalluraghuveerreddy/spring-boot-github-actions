FROM eclipse-temurin:21
LABEL authors="raghuveer"
EXPOSE 8080
ADD target/spring-boot-github-actions.jar spring-boot-github-actions.jar
ENTRYPOINT ["java", "-jar","spring-boot-github-actions.jar"]