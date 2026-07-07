# 👨‍💼 Employee Management System

A modern **Employee Management System** built using **Spring Boot**, **Spring MVC**, **Spring Data JPA**, **Hibernate**, **MySQL**, **Thymeleaf**, **HTML**, **CSS**, and **JavaScript**.

This application allows users to **Create, Read, Update, and Delete (CRUD)** employee records with a clean and responsive user interface.

---

## 🚀 Features

- ➕ Add Employee
- 📋 View Employee List
- ✏️ Edit Employee Details
- ❌ Delete Employee
- 🔍 Search Employees
- 💾 MySQL Database Integration
- 🎨 Responsive UI
- ⚡ Spring Boot MVC Architecture

---

## 🛠️ Tech Stack

### Backend
- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

### Frontend
- HTML5
- CSS3
- JavaScript
- Thymeleaf

### Database
- MySQL

### Build Tool
- Maven

### IDE
- Spring Tool Suite (STS)

---

# 📂 Project Structure

```
employee-management-system
│
├── src
│   ├── main
│   │
│   ├── java
│   │   └── com.vinod.ems
│   │       ├── controller
│   │       │     └── EmployeeController.java
│   │       │
│   │       ├── entity
│   │       │     └── EmployeeEntity.java
│   │       │
│   │       ├── repository
│   │       │     └── EmployeeRepository.java
│   │       │
│   │       ├── service
│   │       │     └── EmployeeService.java
│   │       │
│   │       └── EmployeeManagementSystemApplication.java
│   │
│   └── resources
│       ├── templates
│       │     ├── index.html
│       │     ├── add.html
│       │     └── edit.html
│       │
│       ├── static
│       │     ├── style.css
│       │     └── script.js
│       │
│       └── application.properties
│
└── pom.xml
```

---

# 🏗️ Project Architecture

```
Browser
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository (JPA)
   │
   ▼
Hibernate ORM
   │
   ▼
MySQL Database
```

---

# 📸 Screenshots

## 🏠 Home Page

<img width="1918" height="896" alt="image" src="https://github.com/user-attachments/assets/08a08af8-907d-4c87-b7af-d6f34e52fb18" />


```
screenshots/home.png
```

---

## ➕ Add Employee

<img width="1162" height="763" alt="image" src="https://github.com/user-attachments/assets/73eaee27-2bb7-484a-a491-3a6bf4cf1e40" />



```
screenshots/add.png
```

---

## ✏️ Edit Employee

> <img width="1890" height="857" alt="image" src="https://github.com/user-attachments/assets/dbd3ca53-3399-4f25-9ff2-faf506de7a86" />![Uploading Screenshot 2026-07-06 110130.png…]()



```
screenshots/edit.png
```

---

## ❌ Delete Employee

><img width="1901" height="826" alt="image" src="https://github.com/user-attachments/assets/c1e3bd1f-8451-4b26-9428-35041b5583d5" />


```
screenshots/delete.png
```

---

# 🗄️ Database Schema

```sql
CREATE TABLE employee(

id BIGINT PRIMARY KEY AUTO_INCREMENT,

name VARCHAR(100),

email VARCHAR(100),

phone VARCHAR(20),

department VARCHAR(50),

salary DOUBLE

);
```

---

# ⚙️ Installation

### Clone Repository

```bash
git clone https://github.com/vinod65/employee-management-system.git
```

---

### Open Project

Open in

```
Spring Tool Suite (STS)
```

or

```
IntelliJ IDEA
```

---

### Configure MySQL

Create a database

```sql
CREATE DATABASE employee_db;
```

---

### Update

application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db

spring.datasource.username=root

spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true
```

---

### Run Project

Run

```
EmployeeManagementSystemApplication.java
```

---

Open Browser

```
http://localhost:8080
```

---

# 📌 CRUD Operations

| Method | URL | Description |
|---------|-----|-------------|
| GET | / | View Employees |
| GET | /add | Open Add Employee |
| POST | /save | Save Employee |
| GET | /edit/{id} | Edit Employee |
| POST | /update | Update Employee |
| GET | /delete/{id} | Delete Employee |

---

# 🎯 Learning Outcomes

- Spring Boot MVC Architecture
- Spring Data JPA
- Hibernate ORM
- CRUD Operations
- MySQL Integration
- Thymeleaf Templates
- Dependency Injection
- Layered Architecture
- Git & GitHub

---

# 🚀 Future Enhancements

- Login Authentication
- Role Based Access
- Pagination
- Sorting
- Search using Database
- Export to Excel
- Export to PDF
- Dashboard Analytics
- REST API Version
- Docker Deployment

---

# 👨‍💻 Author

## Vinod T R

🎓 B.Tech - Computer Science Engineering

💻 Full Stack Java Developer

📊 Data Analyst

🤖 AI & ML Enthusiast

---

## Connect with Me

GitHub

https://github.com/vinod65

LinkedIn

(Add your LinkedIn Profile)

Email

(Add your Email)

---

## ⭐ If you like this project

Please give this repository a ⭐ Star.
