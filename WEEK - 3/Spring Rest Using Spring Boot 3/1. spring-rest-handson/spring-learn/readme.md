# Spring REST Using Spring Boot 3 Hands-on

## Project Overview
This repository contains a consolidated Spring Boot project (`spring-learn`) that demonstrates fundamental Spring Core and Spring Web concepts as per the Cognizant Spring REST Hands-on exercises. Instead of creating multiple projects, all 6 hands-on exercises are modularized within this single application for better maintainability and demonstration.

## Hands-on Covered
1. **Hands-on 1**: Spring Web Project Creation using Maven & Spring Initializr.
2. **Hands-on 2**: Loading `SimpleDateFormat` bean from Spring XML Configuration.
3. **Hands-on 3**: Incorporating SLF4J Logging with custom console patterns (No `System.out.println`).
4. **Hands-on 4**: Loading a `Country` POJO bean from Spring XML Configuration with constructor/setter logging.
5. **Hands-on 5**: Demonstration of **Singleton** vs **Prototype** bean scopes via repeated `getBean()` calls.
6. **Hands-on 6**: Loading a `List` of Country beans using `<list>` and `<ref>` tags in XML.

## Tech Stack
- Java 21
- Spring Boot (Spring Web, Spring Core)
- Maven
- SLF4J / Logback
- IntelliJ IDEA

## Project Structure

```text
SpringLearn/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── cognizant/
│   │   │           └── springlearn/
│   │   │               ├── Country.java
│   │   │               └── SpringLearnApplication.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── country.xml
│   │       └── date-format.xml
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── cognizant/
│                   └── springlearn/
│                       └── SpringLearnApplicationTests.java
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## How to Run
1. Clone the repository: `git clone <your-repo-url>`
2. Open in IntelliJ IDEA and let Maven import dependencies.
3. Run `SpringLearnApplication.java` as a Java Application.
4. Observe the console output to verify logging, bean creation, and scope behavior.

## Git Workflow
```bash
git add .
git commit -m "Hands-on 1 to 6: Spring Rest using Spring Boot 3"
git push origin main
```
## Author
**Shubham Sangram Bej**