# Mockito Advanced Exercises

## Description

This project demonstrates advanced Mockito concepts using **JUnit 5** and **Maven**. The exercises cover mocking repositories, REST clients, file operations, network interactions, and multiple return values while testing application logic independently of external dependencies.

---

## Technologies Used

- Java 21
- Maven
- JUnit 5
- Mockito
- IntelliJ IDEA

---

## Project Structure

```
Mockito-Advanced-Exercises
│
├── pom.xml
├── README.md
├── screenshots
│
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── shubham
    │               ├── Repository.java
    │               ├── Service.java
    │               ├── RestClient.java
    │               ├── ApiService.java
    │               ├── FileReader.java
    │               ├── FileWriter.java
    │               ├── FileService.java
    │               ├── NetworkClient.java
    │               └── NetworkService.java
    │
    └── test
        └── java
            └── com
                └── shubham
                    ├── ServiceTest.java
                    ├── ApiServiceTest.java
                    ├── FileServiceTest.java
                    ├── NetworkServiceTest.java
                    └── MultiReturnServiceTest.java
```

---

## Exercises Implemented

### Exercise 1 – Mocking Databases and Repositories

- Mocked a repository.
- Stubbed repository methods.
- Verified service logic.

### Exercise 2 – Mocking REST APIs

- Mocked REST client.
- Stubbed API responses.
- Tested service layer.

### Exercise 3 – Mocking File I/O

- Mocked file reader and writer.
- Simulated file operations.
- Verified write interaction.

### Exercise 4 – Mocking Network Interactions

- Mocked network client.
- Simulated server connection.
- Verified service response.

### Exercise 5 – Multiple Return Values

- Used chained `thenReturn()` calls.
- Verified sequential responses.

---

## Features

- Mockito-based mocking
- JUnit 5 testing
- Repository mocking
- REST API mocking
- File I/O mocking
- Network interaction mocking
- Multiple return value stubbing
- Maven project structure

---

## How to Run

1. Open the project in IntelliJ IDEA.
2. Load Maven dependencies.
3. Run the individual test classes.
4. Verify all tests pass successfully.

---

## Author

**Shubham Sangram Bej**