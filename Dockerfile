# ---------- Build Stage ----------
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -B -ntp -DskipTests clean package

# ---------- Run Stage ----------
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/target/task-manager-*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]