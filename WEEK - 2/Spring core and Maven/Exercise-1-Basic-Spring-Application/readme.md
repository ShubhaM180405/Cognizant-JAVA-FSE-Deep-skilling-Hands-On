# Exercise 1 - Basic Spring Application

## Objective
To create a basic Spring application using XML-based configuration and demonstrate the creation and management of Spring beans through the IoC container.

## Technologies Used
- Java 21
- Spring Framework 5
- Maven
- IntelliJ IDEA

## Project Structure

```
Exercise-1-Basic-Spring-Application
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.shubham
│   │   │       ├── repository
│   │   │       ├── service
│   │   │       └── main
│   │   └── resources
│   │       └── applicationContext.xml
│
├── pom.xml
├── README.md
└── Exercise-1-Basic-Spring-Application-Report.docx
```

## Description

This project demonstrates the fundamentals of the Spring Framework by configuring beans using an XML configuration file. The Spring IoC container manages the lifecycle of the objects.

The project consists of:

- BookService
- BookRepository
- applicationContext.xml
- LibraryApplication

## Features

- XML-based Spring configuration
- Bean creation using Spring IoC
- Retrieval of beans from the ApplicationContext
- Console-based execution

## Expected Output

```
BookService: Library service is running...
BookRepository: Retrieving book information...
Spring configuration loaded successfully.
```

## How to Run

1. Open the project in IntelliJ IDEA.
2. Allow Maven to download all dependencies.
3. Run `LibraryApplication.java`.
4. Observe the console output.

## Author

Shubham Sangram Bej