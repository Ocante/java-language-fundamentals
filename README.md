
[![Java CI](https://github.com/Ocante/java-language-fundamentals/actions/workflows/ci.yml/badge.svg)](https://github.com/Ocante/java-language-fundamentals/actions/workflows/ci.yml)

# Java Language Fundamentals

A hands-on Java learning project focused on programming fundamentals, clean code, automated testing, and professional software development practices.

## Overview

This repository is part of a progressive Java Software Engineering learning path, from core language concepts to enterprise application architecture.

The current implementation includes a console application, a simple calculator, and automated unit tests.

## Technology Stack

- Java 25 LTS
- Apache Maven 3.9.16
- JUnit Jupiter 5.12.2
- Maven Surefire Plugin 3.5.3
- IntelliJ IDEA
- Git

## Project Structure

```text
java-language-fundamentals/
├── src/
│   ├── main/java/com/ocante/fundamentals/
│   │   ├── Main.java
│   │   └── Calculator.java
│   └── test/java/com/ocante/fundamentals/
│       └── CalculatorTest.java
├── .gitignore
├── pom.xml
└── README.md
```

## Implemented Features

### Console Application

The `Main` class demonstrates the traditional Java application entry point and console output using `System.out.println()`.

### Calculator

The `Calculator` class currently implements integer addition through the `add()` method.

### Automated Testing

The `CalculatorTest` class uses JUnit Jupiter to verify the expected result of an addition operation.

## Getting Started

### Prerequisites

- JDK 25
- Apache Maven 3.9.x
- Git

### Clone the Repository

Once the repository is published, use its GitHub URL:

```bash
git clone <repository-url>
cd java-language-fundamentals
```

### Compile the Project

```bash
mvn clean compile
```

### Run the Application

```bash
Open the project in IntelliJ IDEA.

1. Navigate to `src/main/java/com/ocante/fundamentals/Main.java`.
2. Click the green Run icon next to the `main` method.
3. Select `Run 'Main.main()'`.
4. Check the output in the Run console.
```

This command requires the Maven Exec Plugin to be available. Alternatively, run `Main.java` directly through IntelliJ IDEA.

### Run Automated Tests

```bash
mvn clean test
```

Expected result:

```text
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

## Learning Objectives

This project is designed to develop practical understanding of:

- Java syntax and program structure
- Classes and methods
- Primitive data types
- Method parameters and return values
- Maven project organization
- Automated testing with JUnit
- Git version control
- Technical documentation

## Development Roadmap

- [x] Configure Java and Maven
- [x] Create the initial Java application
- [x] Implement a calculator
- [x] Add the first JUnit test
- [x] Initialize Git version control
- [ ] Expand Java language fundamentals
- [ ] Add conditional statements and loops
- [ ] Implement input validation
- [ ] Expand automated test coverage
- [ ] Add continuous integration


## Continuous Integration (CI)

This project uses GitHub Actions to automate
the build and testing process.

### CI Workflow

The pipeline is defined in:

`.github/workflows/ci.yml`

### Pipeline Execution

The workflow runs automatically when:

- Code is pushed to the `main` branch.
- A pull request targets the `main` branch.

### Automated Steps

1. Checkout the repository.
2. Configure Java 25 using Eclipse Temurin.
3. Cache Maven dependencies.
4. Compile the application.
5. Execute automated JUnit tests.
6. Verify the Maven build.

### Build Command

```bash
mvn --batch-mode clean verify
```

### CI Status

The latest successful workflow execution confirms
that the project builds and passes its configured
automated checks in the GitHub Actions environment.

## Engineering Practices

The project follows an incremental development approach with descriptive commit messages, reproducible Maven builds, and automated tests.

Additional engineering practices will be introduced as the project evolves.

## Author

Ocante

Java Software Engineering Learning Portfolio
