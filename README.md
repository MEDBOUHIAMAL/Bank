#  Bank Kata (Technical Test for Skypay)

This project is my solution for the Bank Kata technical test as part of my application for the **QA and Test Automation Engineer position at Skypay**.
The goal was to implement a simple bank account system while applying **Mockist principles** and **acceptance testing with Cucumber**.

---

## Objectives and Constraints

This implementation adheres to the following requirements:

### 🔹 Implement a class Account that conforms to the given interface
### 🔹 Use Mockist approach to drive the architecture and validate interactions with dependencies.
### 🔹 Simulate bank statement printing via a mocked StatementPrinter class.
### 🔹 Write JUnit and Cucumber tests to validate functionality and ensure non-regression.



---


## Technologies Used

- **Java 17**
- **Spring Boot** for application framework
- **Maven for dependency management**
- **JUnit 5 for unit testing**
- **Mockito for mocking dependencies**
- **Cucumber for BDD-style acceptance testing**
- **IntelliJ IDEA for development and test execution**

---

## 📂 Project Structure

```plaintext
src/main/java/com/example/Bank/
-- BankApplication.java       # Spring Boot main application class
-- Account/Account.java       # Implements AccountService
-- Account/AccountService.java # Service interface for account operations
-- Transaction/Transaction.java # Represents a transaction
-- Printer/StatementPrinter.java # Interface for statement printing
-- Printer/StatementPrinterImpl.java # Implements statement printing logic
```
```plaintext
src/test/java/com/example/Bank/
-- AccountTest.java              # Unit tests using Mockito
-- BankAccountCucumberSteps.java # Step definitions for Cucumber tests
-- RunCucumberTest.java          # Runs acceptance tests


```
```plaintext
src/test/resources/features/
--bank_kata.feature          # define Cucumber scenarios using Gherkin syntax ,  test case requirements




```

---

## Running the Tests


### Run Unit Tests

```bash
mvn test
```
### Run Acceptance Tests with Cucumber

```bash
mvn verify
```

---

