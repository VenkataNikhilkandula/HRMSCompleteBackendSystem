# 🚀 HRMS Complete Backend System

A **Spring Boot-based Human Resource Management System (HRMS)** designed to manage employees, departments, attendance, leave workflows, and payroll in a clean, scalable architecture.

---

## 📌 Project Overview

This project provides a backend system for managing core HR operations:

* 👨‍💼 Employee Management
* 🏢 Department Management
* 🗓️ Leave Management Workflow
* ⏱️ Attendance Tracking
* 💰 Payroll Calculation
* 🔐 Role-based Security (extendable)

Built using **Spring Boot**, **Spring Data JPA**, and **MySQL** with a layered architecture.

---

## 🏗️ Architecture

The project follows a clean layered structure:

```
Controller → Service → Repository → Database
```

### 📂 Package Structure

```
com.stackly
│
├── config          # Security & Swagger configuration
├── controller      # REST APIs
├── dto             # Request & Response objects (recommended upgrade)
├── entity          # JPA Entities
├── repository      # JPA Repositories
├── service         # Service interfaces
├── serviceimpl     # Business logic implementations
└── exception       # Global exception handling
```

---

## ⚙️ Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* Spring Security
* MySQL
* Lombok
* Maven

---

## 🛠️ Setup & Installation

### 🔹 1. Clone Repository

```bash
git clone https://github.com/<your-username>/<repo-name>.git
cd HRMSCompleteBackendSystem
```

---

### 🔹 2. Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hrms_db
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

### 🔹 3. Run Application

```bash
mvn clean install
mvn spring-boot:run
```

---

## 📡 API Endpoints (Sample)

### 👨‍💼 Employee

| Method | Endpoint              | Description        |
| ------ | --------------------- | ------------------ |
| POST   | `/api/employees`      | Create employee    |
| GET    | `/api/employees`      | Get all employees  |
| GET    | `/api/employees/{id}` | Get employee by ID |
| PUT    | `/api/employees/{id}` | Update employee    |
| DELETE | `/api/employees/{id}` | Delete employee    |

---

### 🏢 Department

| Method | Endpoint           |
| ------ | ------------------ |
| POST   | `/api/departments` |
| GET    | `/api/departments` |

---

### 🏖️ Leave

| Method | Endpoint                   |
| ------ | -------------------------- |
| POST   | `/api/leaves`              |
| PUT    | `/api/leaves/approve/{id}` |
| GET    | `/api/leaves`              |

---

### ⏱️ Attendance

| Method | Endpoint                        |
| ------ | ------------------------------- |
| POST   | `/api/attendance`               |
| GET    | `/api/attendance/employee/{id}` |

---

### 💰 Payroll

| Method | Endpoint       |
| ------ | -------------- |
| POST   | `/api/payroll` |
| GET    | `/api/payroll` |

---

## 🧪 Testing

Use Postman to test APIs:

* Base URL:

```
http://localhost:8080
```

---

## 🚀 Future Enhancements

* ✅ JWT Authentication & Authorization
* ✅ Role-based Access Control (Admin / Employee)
* ✅ DTO Layer Implementation
* ✅ Global Exception Handling
* ✅ Swagger API Documentation
* ✅ Pagination & Filtering
---

