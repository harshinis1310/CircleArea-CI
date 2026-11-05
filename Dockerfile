FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/circle-area-ci-1.0.0.jar app.jar

CMD ["java", "-cp", "app.jar", "com.example.CircleArea"]