FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY build/libs/logs-sse-0.0.1-SNAPSHOT.jar app.jar
RUN mkdir -p /logs
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]