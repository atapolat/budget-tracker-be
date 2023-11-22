FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar budget-tracker-be.jar
ENTRYPOINT ["java","-jar","/budget-tracker-be.jar"]
EXPOSE 8080