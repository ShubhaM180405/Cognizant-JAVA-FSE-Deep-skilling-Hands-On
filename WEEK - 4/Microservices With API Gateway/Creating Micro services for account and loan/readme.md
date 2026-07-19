# Creating Microservices for Account and Loan

## Overview

This project is a part of the **Cognizant Java FSE Deep Skilling Program - Week 4**. The objective of this hands-on is to understand the basics of Microservices architecture by developing two independent Spring Boot RESTful web services.

The application consists of two standalone microservices:

- **Account Microservice**
- **Loan Microservice**

Each microservice is developed as an independent Maven project with its own configuration, dependencies, and execution environment.

---

## Technologies Used

- Java JDK 21
- Spring Boot 4.1.0
- Spring Web
- Spring Boot DevTools
- Maven
- IntelliJ IDEA 2026.1.4
- REST APIs
- Git & GitHub

---

## Project Structure

```
Creating Microservices for Account and Loan
│
├── account
│   ├── src
│   ├── pom.xml
│   └── application.properties
│
├── loan
│   ├── src
│   ├── pom.xml
│   └── application.properties
│
├── README.md
├── Report.docx
└── screenshots
```

---

## Account Microservice

The Account Microservice exposes a REST endpoint to retrieve account information based on the account number.

### Endpoint

```
GET /accounts/{number}
```

### Sample Request

```
http://localhost:8080/accounts/180405
```

### Sample Response

```json
{
  "number": "180405",
  "type": "Savings",
  "balance": 696914.0
}
```

---

## Loan Microservice

The Loan Microservice exposes a REST endpoint to retrieve loan details based on the loan account number.

### Endpoint

```
GET /loans/{number}
```

### Sample Request

```
http://localhost:8081/loans/SHUBH108
```

### Sample Response

```json
{
  "number": "SHUBH108",
  "type": "Car",
  "loan": 700000.0,
  "emi": 3060.0,
  "tenure": 24
}
```

---

## Ports Used

| Microservice | Port |
|--------------|------|
| Account Service | 8080 |
| Loan Service | 8081 |

---

## Features Implemented

- Created two independent Spring Boot Microservices.
- Developed RESTful APIs using Spring Web.
- Returned dummy JSON responses without database connectivity.
- Configured independent application properties.
- Executed both services simultaneously using different ports.
- Tested REST endpoints successfully.

---

## How to Run

### Account Microservice

Run the `AccountApplication.java` class.

Access:

```
http://localhost:8080/accounts/180405
```

### Loan Microservice

Run the `LoanApplication.java` class.

Access:

```
http://localhost:8081/loans/SHUBH108
```

---


## Author

**Shubham Sangram Bej**