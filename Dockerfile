FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY . .
RUN ./gradlew build -x test || gradle build -x test
CMD ["java", "-jar", "build/libs/*.jar"]
