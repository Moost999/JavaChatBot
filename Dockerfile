FROM ubuntu:latest AS build

RUN apt-get update 

RUN apt-get install openjdk-17-jdk -y

COPY . . 

RUN apt-get install maven -y
RUN mvn clean install -DskipTests 

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /target/chatbot.jar app.jar

ENV GROQ_API_KEY=${GROQ_API_KEY}

ENTRYPOINT ["java", "-jar", "app.jar"]