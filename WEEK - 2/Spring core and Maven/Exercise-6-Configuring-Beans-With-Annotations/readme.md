# Exercise 6 - Configuring Beans with Annotations

## Aim

To simplify bean configuration in the Library Management application using Spring annotations and component scanning.

---

## Scenario

The library management application requires annotation-based bean configuration to reduce XML configuration and improve maintainability.

---

## Technologies Used

- Java 21
- Spring Framework 5.3.39
- Maven
- IntelliJ IDEA

---

## Project Structure

```
Exercise-6-Configuring-Beans-With-Annotations
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
│   │   │              LibraryManagementApplication.java
│   │   └── resources
│   │          applicationContext.xml
│   │
├── Screenshots
├── pom.xml
├── README.md
└── Exercise-6-Configuring-Beans-With-Annotations-Report.docx
```

---

## Features

- Annotation-Based Bean Configuration
- Component Scanning
- @Repository Annotation
- @Service Annotation
- Automatic Dependency Injection using @Autowired

---

## Expected Output

```
===========================================
 Library Management System
===========================================
Book Repository detected through @Repository annotation!!..
Book Service detected through @Service annotation!!..
Annotation-based bean configuration completed successfully!!..
===========================================
```

---

## Author

**Shubham Sangram Bej**