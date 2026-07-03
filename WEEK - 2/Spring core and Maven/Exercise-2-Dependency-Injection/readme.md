# Exercise 2 - Dependency Injection

## Objective

To implement Dependency Injection (DI) in the Spring Framework using XML configuration and demonstrate loose coupling between application components.

---

## Technologies Used

- Java 21
- Spring Framework 5
- Maven
- IntelliJ IDEA

---

## Project Structure

```
Exercise-2-Dependency-Injection
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
└── Exercise-2-Dependency-Injection-Report.docx
```

---

## Description

This project demonstrates Setter-Based Dependency Injection using the Spring IoC Container. The `BookRepository` object is injected into the `BookService` class through XML bean configuration.

The application loads the Spring context, retrieves the service bean, and displays the injected book information.

---

## Features

- Spring IoC Container
- XML-based Configuration
- Setter Dependency Injection
- Loose Coupling
- Maven Project

---

## Expected Output

```
Book Name : The Lord Of the Rings - J.R.R Tolkien
Dependency Injection completed successfully!!..
```

---

## How to Run

1. Open the project in IntelliJ IDEA.
2. Load Maven dependencies.
3. Run `LibraryApplication.java`.
4. Verify the console output.

---

## Author

**Shubham Sangram Bej**