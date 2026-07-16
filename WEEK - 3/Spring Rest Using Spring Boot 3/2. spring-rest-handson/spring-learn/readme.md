# Spring REST Using Spring Boot

## Overview

This project is a part of the Cognizant Java FSE Deep Skilling Program (Week 3 Hands-on). The application demonstrates the implementation of RESTful Web Services using Spring Boot, XML Bean Configuration, Dependency Injection, Exception Handling, and Unit Testing.

## Technologies Used

- Java JDK 21
- Spring Boot 4.1.0 (Can also use 3.x versions, but they are no longer available on Intellij)
- Spring MVC
- Maven
- IntelliJ IDEA 2026.1.4
- JUnit
- SLF4J Logging

## Features Implemented

### Exercise 1 - Hello World REST Service

- Created a Spring Boot REST application.
- Implemented a simple REST endpoint.

**Endpoint**

```
GET /hello
```

**Output**

```
Hello World!!
```

---

### Exercise 2 - Country Bean

- Created Country POJO.
- Configured Country Bean using XML.
- Retrieved Country object through REST API.

**Endpoint**

```
GET /country
```

---

### Exercise 3 - Country List

- Configured multiple Country Beans.
- Returned all countries using REST API.

**Endpoint**

```
GET /countries
```

---

### Exercise 4 - Search Country by Code

- Implemented search functionality using Country Code.

**Endpoint**

```
GET /countries/{code}
```

Example:

```
GET /countries/IN
```

---

### Exercise 5 - Exception Handling

- Implemented custom exception handling.
- Returned appropriate response for invalid country codes.

Example:

```
GET /countries/az
```

---

### Exercise 6 - Testing

Implemented Spring Boot Test Cases for

- Application Context
- REST API Validation
- Country Endpoint

---

## Project Structure

```
spring-learn
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   └── test
│
├── pom.xml
├── README.md
└── screenshots
```

---

## Build

```
mvn clean install
```

## Run

```
mvn spring-boot:run
```

or simply execute

```
SpringLearnApplication.java
```

---


## Author

**Shubham Sangram Bej**