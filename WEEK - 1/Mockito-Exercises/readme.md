# Mockito Exercises

## Description

This project demonstrates the use of **Mockito** with **JUnit 5** for unit testing in Java. The exercises cover mocking, stubbing, verifying interactions, argument matchers, handling void methods, multiple return values, interaction order verification, and exception handling.

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
Mockito-Exercises
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
    │               ├── ExternalApi.java
    │               ├── Logger.java
    │               └── MyService.java
    │
    └── test
        └── java
            └── com
                └── shubham
                    ├── MockingTest.java
                    ├── VerifyInteractionTest.java
                    ├── ArgumentMatcherTest.java
                    ├── VoidMethodTest.java
                    ├── MultipleReturnsTest.java
                    ├── InteractionOrderTest.java
                    └── VoidExceptionTest.java
```

---

## Exercises Implemented

### Exercise 1 – Mocking and Stubbing

- Created mock objects.
- Stubbed methods using `when().thenReturn()`.

### Exercise 2 – Verifying Interactions

- Verified method invocation using `verify()`.

### Exercise 3 – Argument Matching

- Used `anyString()` matcher.

### Exercise 4 – Handling Void Methods

- Used `doNothing()` for void methods.

### Exercise 5 – Multiple Return Values

- Returned different values using chained `thenReturn()`.

### Exercise 6 – Interaction Order

- Verified execution order using `InOrder`.

### Exercise 7 – Void Methods with Exceptions

- Used `doThrow()` to simulate exceptions.

---

## How to Run

1. Open the project in IntelliJ IDEA.
2. Load Maven dependencies.
3. Run individual test classes or all tests.
4. Verify that all tests pass successfully.

---

## Author

**Shubham Sangram Bej**