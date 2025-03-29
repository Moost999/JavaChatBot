FROM ubuntu:latest AS build

RUN apt-get update 
RUN apt-install openjdk-17 -y

COPY . . 

RUN mvn clean install -DSkipTests

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /target/chatbot.jar app.jar

ENV GROQ_API_KEY=${GROQ_API_KEY}

ENTRYPOINT ["java", "-jar", "app.jar"]