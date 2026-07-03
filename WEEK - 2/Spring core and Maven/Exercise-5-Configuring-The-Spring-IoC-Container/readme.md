# Exercise 5 - Configuring the Spring IoC Container

## Aim

To configure the Spring IoC Container using an XML configuration file and manage the dependency between BookService and BookRepository.

---

## Scenario

The library management application requires a central configuration for beans and dependencies.

---

## Technologies Used

- Java 21
- Spring Framework 5.3.39
- Maven
- IntelliJ IDEA

---

## Project Structure

```
Exercise-5-Configuring-The-Spring-IoC-Container
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.shubham
│   │   │       ├── repository
│   │   │       │      BookRepository.java
│   │   │       ├── service
│   │   │       │      BookService.java
│   │   │       └── main
│   │   │              LibraryApplication.java
│   │   └── resources
│   │          applicationContext.xml
│   │
├── Screenshots
├── pom.xml
├── README.md
└── Exercise-5-Configuring-The-Spring-IoC-Container-Report.docx
```

---

## Features

- Spring IoC Container
- XML Bean Configuration
- Setter Dependency Injection
- BookService and BookRepository Beans
- Spring Context Loading

---

## Expected Output

```
====================================
 Library Management System
====================================
Book Repository initialized successfully!!..
Book Service initialized successfully!!..
Spring IoC Container configured successfully!!..
====================================
```

---

## Author

**Shubham Sangram Bej**