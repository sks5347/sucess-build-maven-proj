# Spring boot sample project

## Introduction

Welcome to this sample project

## Instructions - Getting started
The application contains 1 endpoints:
- `GET /hi` - where you get a plain text response welcoming you.

#### Try installing the application

`mvn clean install` if you have installed Maven in your local machine

`./mvnw clean install` if you want to use the self-contained maven wrapper already in the project

#### You can try to run/test the application and consume the endpoint

`mvn spring-boot:run -pl :web` or `./mvnw spring-boot:run -pl :web` to start the application

Then in a terminal, with curl we can hit the `hi` endpoint

`curl -k http://localhost:8443/hi`
 
