# Java Language Fundamentals

[![Java CI](https://github.com/Ocante/java-language-fundamentals/actions/workflows/ci.yml/badge.svg)](https://github.com/Ocante/java-language-fundamentals/actions/workflows/ci.yml)

A hands-on Java learning project focused on programming fundamentals, clean code, automated testing, continuous integration, and professional software engineering practices.

## Overview

This repository is part of a progressive Java Software Engineering learning path, covering core language concepts and preparing for advanced object-oriented programming and enterprise application architecture.

The current implementation includes a console application, a simple calculator, automated unit tests, and a GitHub Actions CI pipeline.

## Technology Stack

| Technology | Version / Purpose |
|---|---|
| Java | 25 LTS |
| Apache Maven | 3.9.16 |
| JUnit Jupiter | 5.12.2 |
| Maven Surefire Plugin | 3.5.3 |
| IntelliJ IDEA | Development environment |
| Git | Version control |
| GitHub | Source code hosting |
| GitHub Actions | Continuous integration |

## Project Structure

```text
java-language-fundamentals/
├── .github/
│   └── workflows/
│       └── ci.yml
├── src/
│   ├── main/
│   │   └── java/com/ocante/fundamentals/
│   │       ├── Main.java
│   │       └── Calculator.java
│   └── test/
│       └── java/com/ocante/fundamentals/
│           └── CalculatorTest.java
├── .gitignore
├── pom.xml
└── README.md
```

## Implemented Features

### Console Application

The `Main` class demonstrates the Java application entry point and console output using `System.out.println()`.

### Calculator

The `Calculator` class currently implements integer addition through the `add()` method.

### Automated Testing

The `CalculatorTest` class uses JUnit Jupiter to verify the expected result of an addition operation.

The tests are executed locally using Maven and automatically through GitHub Actions.

## Getting Started

### Prerequisites

- JDK 25
- Apache Maven 3.9.x
- Git
- IntelliJ IDEA (recommended)

### Clone the Repository

```bash
git clone https://github.com/Ocante/java-language-fundamentals.git
cd java-language-fundamentals
```

### Compile the Project

```bash
mvn clean compile
```

### Run the Application

Open the project in IntelliJ IDEA.

1. Navigate to `src/main/java/com/ocante/fundamentals/Main.java`.
2. Click the green Run icon next to the `main` method.
3. Select `Run 'Main.main()'`.
4. Check the output in the Run console.

### Run Automated Tests

```bash
mvn clean test
```

Expected result for the current test suite:

```text
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

## Continuous Integration (CI)

This project uses GitHub Actions to automate the build and testing process.

### Workflow Configuration

The CI pipeline is defined in:

`.github/workflows/ci.yml`

### Pipeline Triggers

The workflow runs automatically when:

- Code is pushed to the `main` branch.
- A pull request targets the `main` branch.

### Automated Pipeline Steps

1. Check out the repository source code.
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

The workflow status is displayed at the top of this README.

The first successful GitHub Actions execution confirmed that the project builds and passes its configured automated checks in the CI environment.

[View GitHub Actions workflow](https://github.com/Ocante/java-language-fundamentals/actions)

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
- Continuous integration fundamentals

## Development Roadmap

- [x] Configure Java and Maven
- [x] Create the initial Java application
- [x] Implement a calculator
- [x] Add the first JUnit test
- [x] Initialize Git version control
- [x] Publish the project on GitHub
- [x] Implement GitHub Actions continuous integration
- [ ] Expand Java language fundamentals
- [ ] Add conditional statements and loops
- [ ] Implement input validation
- [ ] Expand automated test coverage

## Engineering Practices

The project follows an incremental development approach with:

- Descriptive commit messages following Conventional Commits
- Reproducible Maven builds
- Automated unit testing
- GitHub Actions continuous integration
- Structured source code organization
- Technical documentation in English

Additional engineering practices will be introduced as the project evolves.

## Author

**Ocante**

Java Software Engineering Learning Portfolio
