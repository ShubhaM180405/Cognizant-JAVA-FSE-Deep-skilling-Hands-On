# Week 2 - Spring Data JPA and Hibernate

## Overview

This folder contains the implementation and documentation for **HandsOn 1 to HandsOn 9** of the Spring Data JPA and Hibernate module.

> **Note:**  
> **Only one Spring Boot project has been used for HandsOn 1 to HandsOn 9.**
> The complete project source code is available inside:
>
> **HandsOn01SpringDataJpaQuickExample**

As each subsequent hands-on builds upon the previous one, the same project has been enhanced by adding new features instead of creating separate projects.

---

# HandsOns Included

## HandsOn 1
Spring Data JPA Quick Example

- Configure Spring Boot
- Configure Spring Data JPA
- Connect MySQL
- Create Country Entity
- Create Repository
- Create Service
- Fetch all countries

---

## HandsOn 2
Hibernate XML Configuration Walkthrough

- Studied Hibernate XML Configuration
- SessionFactory
- Session
- Transaction
- CRUD Operations using Hibernate XML

---

## HandsOn 3
Hibernate Annotation Configuration Walkthrough

- Entity Mapping using Annotations
- @Entity
- @Table
- @Id
- @GeneratedValue
- @Column
- Hibernate Configuration

---

## HandsOn 4
Difference Between JPA, Hibernate and Spring Data JPA

- Java Persistence API (JPA)
- Hibernate
- Spring Data JPA
- Comparison of Hibernate and Spring Data JPA

---

## HandsOn 5
Implement Services for Managing Country

Implemented service methods for:

- Find Country
- Add Country
- Update Country
- Delete Country
- Search Country

Configured Hibernate validation and populated Country table.

---

## HandsOn 6
Find Country Based on Country Code

Implemented:

- CountryNotFoundException
- findCountryByCode()
- Exception Handling
- Transaction Management

---

## HandsOn 7
Add New Country

Implemented:

- addCountry()
- save()

---

## HandsOn 8
Update Country Based on Code

Implemented:

- updateCountry()
- save()

---

## HandsOn 9
Delete Country Based on Code

Implemented:

- deleteCountry()
- deleteById()

---

# Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL 8
- Maven
- IntelliJ IDEA
- Git
- GitHub

---

# Database

Database Name

```
ormlearn
```

Table

```
country
```

---

# Folder Structure

```
Spring Data JPA and Hibernate
│
├── HandsOn01SpringDataJpaQuickExample
│      ├── Spring Boot Project
│      ├── Report
│      └── Screenshots
│
├── HandsOn02HibernateXmlConfigurationWalkthrough
│      └── Report
│
├── HandsOn03HibernateAnnotationConfigurationWalkthrough
│      └── Report
│
├── HandsOn04DifferenceBetweenJpaHibernateAndSpringDataJpa
│      └── Report
│
├── HandsOn05ImplementServicesForManagingCountry
│      └── Report
│
├── HandsOn06FindCountryByCountryCode
│      ├── Report
│      └── Screenshots
│
├── HandsOn07AddNewCountry
│      ├── Report
│      └── Screenshots
│
├── HandsOn08UpdateCountryByCode
│      ├── Report
│      └── Screenshots
│
└── HandsOn09DeleteCountryByCode
       ├── Report
       └── Screenshots
```

---

# Note

Since every hands-on after HandsOn 1 extends the same Spring Boot application, a single project has been maintained throughout HandsOn 1–9 to avoid duplication and to preserve continuity of implementation.

---

# Author

**Shubham Sangram Bej**
