# API Testing Task

API Test Automation – Cucumber + TestNG

This project contains automated API tests built using Java, Maven, Cucumber, TestNG, and RestAssured.
It is designed to be simple, maintainable, and easy for new contributors to understand.

The current test suite validates the Request Email Change API.

## Big Picture Architecture

```
Feature File
    ↓
Step Definitions (business intent)
    ↓
Support Layer (infrastructure)
    ↓
API / HTTP
```

## Configuration
All environment-level configuration is managed via:
`src/test/resources/config.properties`

## Running the Tests
From the project root, run:
```
mvn test
```

## Test Reports
After execution, Cucumber reports are generated at:

```
target/cucumber-report.html
target/cucumber-report.json
```