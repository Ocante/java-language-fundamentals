
# Java Language Fundamentals

A hands-on Java Software Engineering learning project focused on
core language concepts, clean code, automated testing, and
professional development practices.

## Project Overview

This repository documents a progressive learning journey in Java
Software Engineering.

Each module combines theoretical concepts, practical exercises,
input validation, and automated tests.

## Technology Stack

- Java 25
- Maven 3.9.x
- JUnit Jupiter 5
- Maven Surefire Plugin
- IntelliJ IDEA
- GitHub Actions

## Learning Modules

### Lesson 01 — Java Development Environment

- JDK installation and configuration
- IntelliJ IDEA project setup
- Maven project structure
- Java classes and methods
- First Java application
- Unit testing with JUnit
- Continuous Integration with GitHub Actions

### Lesson 02 — Variables, Operators and Input

- Variables and primitive data types
- Numeric ranges and integer overflow
- Arithmetic operators
- Relational and logical operators
- Implicit and explicit type casting
- Console input using Scanner
- Input validation and exception handling
- Separation of responsibilities
- Unit tests and integration tests

## Project Structure

```text
src/
├── main/java/com/ocante/fundamentals/
│   ├── casting/
│   ├── input/
│   ├── operators/
│   ├── validation/
│   └── variables/
│
└── test/java/com/ocante/fundamentals/
    ├── casting/
    ├── input/
    ├── operators/
    └── validation/
```

## Automated Testing

The project currently includes 47 automated tests covering:

- Basic arithmetic operations
- Access validation rules
- Numeric type conversions
- Employee input validation
- Console application integration

Run all tests:

```bash
mvn clean test
```

Run the complete Maven verification lifecycle:

```bash
mvn clean verify
```

## Continuous Integration

GitHub Actions is configured to execute the Maven verification
lifecycle on supported repository events.

The CI workflow helps detect compilation errors and test failures
before changes are integrated.

## Engineering Practices

- Descriptive class and method names
- Separation of responsibilities
- Input validation
- Automated unit testing
- Integration testing
- Reproducible Maven builds
- Continuous Integration
- Incremental documentation

## Roadmap

- [x] Java environment and Maven
- [x] Variables and primitive types
- [x] Arithmetic, relational, and logical operators
- [x] Type casting
- [x] Scanner and input validation
- [x] JUnit unit and integration tests
- [ ] Control flow and loops
- [ ] Methods and method overloading
- [ ] Object-Oriented Programming
- [ ] Collections and Generics
- [ ] Exception handling in depth
- [ ] File handling and serialization
- [ ] JDBC and relational databases
- [ ] Spring Boot and REST APIs

## Author

Ocante

GitHub: https://github.com/Ocante

## Learning Objective

Build a strong foundation in Java and progressively develop
the skills required for professional backend software engineering
and software architecture.
