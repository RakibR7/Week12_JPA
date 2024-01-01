FROM eclipse-temurin:17-alpine

WORKDIR /app

COPY target/Week_8_Springboot_Validation-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "Week_8_Springboot_Validation-0.0.1-SNAPSHOT.jar", "spring.profiles.active=docker"]
