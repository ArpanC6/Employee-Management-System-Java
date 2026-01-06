# Employee Management System (Java + MySQL)

A **console-based Employee Management System** developed using **Core Java** and **MySQL**, designed to demonstrate real-world backend development concepts such as layered architecture, JDBC connectivity, validation, and secure configuration handling.


## Project Overview

This project helps manage employee records using a MySQL database.  
It is built to practice **Core Java**, **OOPs**, **JDBC**, and **clean coding practices** while simulating how backend systems work in real companies.


## Features

- Add new employee  
- View all employees  
- Input validation  
- Custom exception handling  
- Secure database configuration using properties file  
- Clean package structure  
- Layered architecture (Model – DAO – Service)  


## Tech Stack

- **Language:** Java (Core Java)
- **Concepts Used:** OOPs, Exception Handling, File Handling
- **Database:** MySQL
- **Connectivity:** JDBC
- **IDE:** IntelliJ IDEA
- **Version Control:** Git & GitHub


## How the Project Works (Internal Flow)

1. User runs the application from `MainApp.java`
2. User selects an option (Add Employee / View Employees)
3. Input is validated using `ValidationUtil`
4. Business logic is handled by `EmployeeService`
5. Database operations are performed using `EmployeeDAO`
6. JDBC connects Java with MySQL via `DBConnection`
7. Errors are handled using custom exceptions


## Architecture Explanation

### Model Layer
- Represents the employee entity
- `Employee.java` stores id, name, email, salary

### DAO Layer
- Handles all SQL queries
- `EmployeeDAO.java` interacts directly with MySQL using JDBC

### Service Layer
- Contains business logic
- Validates data before sending it to DAO

### Utility Layer
- `DBConnection.java` → Creates MySQL connection
- `ValidationUtil.java` → Checks input correctness
- `FileLogger.java` → Logs important actions

### Exception Layer
- Custom exception `InvalidInputException`
- Prevents application crash due to wrong input


## Database Details

### Database Name
employee_db

### Table Creation Query
```sql
CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    salary DOUBLE
);

Database Properties Configuration
For security reasons, actual database credentials are not pushed to GitHub.

GitHub contains:
src/db.properties.example

You must create your own file:
src/db.properties

db.properties content:
db.url=jdbc:mysql://localhost:3306/employee_db
db.username=your_mysql_username
db.password=your_mysql_password

Notes:
db.properties is ignored using .gitignore
Only db.properties.example is pushed to GitHub

 MySQL Connector Setup (JDBC)
1) Download MySQL Connector/J
2) Add the JAR file to IntelliJ IDEA project libraries
3) This enables Java to communicate with MySQL using JDBC

How Database Connection Works
1) DBConnection.java reads configuration from db.properties
2) Uses DriverManager.getConnection()
3) Establishes a secure connection with MySQL
4) The same connection is reused by DAO classes

How to Run the Project
Clone the repository:
git clone https://github.com/your-username/Employee-Management-System-Java.git

1) Open the project in IntelliJ IDEA
2) Ensure MySQL server is running
3) Create db.properties inside the src folder
4) Right-click on MainApp.java
5) Click Run

Application Flow After Run
1) Console menu is displayed
2) User selects an option
3) Input validation is performed
4) Business logic is executed
5) Data is stored or fetched from MySQL
6) Output is displayed in the console
