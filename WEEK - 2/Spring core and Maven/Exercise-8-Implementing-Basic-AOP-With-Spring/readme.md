# Exercise 8 - Implementing Basic AOP with Spring

## Aim

To implement basic Aspect-Oriented Programming (AOP) in a Spring application for handling cross-cutting concerns such as logging.

---

## Scenario

The Library Management application requires basic AOP functionality to separate cross-cutting concerns like logging and transaction management from the core business logic.

---

## Technologies Used

- Java 21
- Spring Framework 5.3.39
- Spring AOP
- AspectJ Weaver
- Maven
- IntelliJ IDEA

---

## Project Structure

```
Exercise-8-Implementing-Basic-AOP-With-Spring
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.shubham
│   │   │       ├── aspect
│   │   │       │      LoggingAspect.java
│   │   │       ├── repository
│   │   │       │      BookRepository.java
│   │   │       ├── service
│   │   │       │      BookService.java
│   │   │       └── main
│   │   │              LibraryManagementApplication.java
│   │   └── resources
│   │          applicationContext.xml
│
├── Screenshots
├── pom.xml
├── README.md
└── Exercise-8-Implementing-Basic-AOP-With-Spring-Report.docx
```

---

## Features

- Spring AOP
- Aspect-Oriented Programming
- Before Advice
- After Advice
- XML-Based Aspect Configuration
- AspectJ Auto Proxy

---

## Expected Output

```
========================================
 Library Management System
========================================
[LOG] Before executing : displayBookInformation
Book Repository accessed successfully!!..
Book Service executed successfully!!..
[LOG] After executing : displayBookInformation
========================================
```

---

## Author

**Shubham Sangram Bej**
