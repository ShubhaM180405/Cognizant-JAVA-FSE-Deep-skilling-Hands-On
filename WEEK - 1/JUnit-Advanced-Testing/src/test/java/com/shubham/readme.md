# JUnit Advanced Testing Exercises

## 📌 Description

This project demonstrates advanced unit testing concepts using **JUnit 5 (JUnit Jupiter)** and **Maven**. It includes parameterized tests, test suites, test execution order, exception testing, and performance testing based on the Cognizant Java FSE Deep Skilling hands-on exercises.

---

## 🛠️ Technologies Used

- Java 21
- Maven
- JUnit 5 (JUnit Jupiter)
- IntelliJ IDEA

---

## 📂 Project Structure

```
JUnit-Advanced-Testing
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
    │               ├── EvenChecker.java
    │               ├── ExceptionThrower.java
    │               └── PerformanceTester.java
    │
    └── test
        └── java
            └── com
                └── shubham
                    ├── EvenCheckerTest.java
                    ├── OrderedTests.java
                    ├── ExceptionThrowerTest.java
                    ├── PerformanceTesterTest.java
                    └── AllTests.java
```

---

# Exercises Implemented

## Exercise 1 – Parameterized Tests

### Objective
Verify whether a number is even using parameterized testing.

### Concepts Used
- `@ParameterizedTest`
- `@ValueSource`
- `assertTrue()`

---

## Exercise 2 – Test Suites

### Objective
Group multiple test classes into a single test suite.

### Concepts Used
- `@Suite`
- `@SelectClasses`

---

## Exercise 3 – Test Execution Order

### Objective
Execute test methods in a predefined order.

### Concepts Used
- `@TestMethodOrder`
- `@Order`

---

## Exercise 4 – Exception Testing

### Objective
Verify that a method throws the expected exception.

### Concepts Used
- `assertThrows()`

---

## Exercise 5 – Timeout and Performance Testing

### Objective
Ensure that a method completes execution within a specified time limit.

### Concepts Used
- `assertTimeout()`
- `Duration`

---

# Features

- Maven-based project
- JUnit 5 implementation
- Parameterized testing
- Test suites
- Ordered test execution
- Exception validation
- Performance and timeout testing
- Clean project structure
- Easy to build and execute

---

# How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Load Maven dependencies.
4. Navigate to the `test` folder.
5. Run any individual test class or execute `AllTests` to run all tests together.

---

# Expected Output

- All parameterized tests should pass.
- Ordered tests execute in the specified sequence.
- Exception tests validate the expected exception.
- Performance tests complete within the specified timeout.
- Test suite executes all included test classes successfully.

---

# Author

**Shubham Sangram Bej**

---
