<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=0:4facfe,100:00f2fe&height=250&section=header&text=🏦Bank%20,%20ManagementSystem&fontSize=50&fontColor=ffffff&animation=fadeIn&fontAlignY=35"/>

# 🏦 Bank Management System

A **Spring Boot** based backend application that performs **CRUD (Create, Read, Update, Delete)** operations for managing bank accounts and customer records, using a simple **DAO/Repository-based architecture**.

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Maven](https://img.shields.io/badge/Build-Maven-blue)
![License](https://img.shields.io/badge/License-MIT-yellow)

## 📌 Description

Bank Management System is a backend project that simulates core banking operations like account creation, viewing account details, updating information, and deleting accounts. It follows a lightweight layered structure without a separate Service layer — the Controller directly interacts with the Repository (DAO) layer for simplicity.

## 🔑 Features

- ➕ Create new bank account
- 📄 View account details (by ID / all accounts)
- ✏️ Update existing account information
- ❌ Delete an account
- 💰 Deposit and withdraw operations with balance checks

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Core language |
| Spring Boot | Application framework |
| Spring Data JPA | Repository/DAO layer |
| PostgreSQL | Database |
| Lombok | Reduce boilerplate code (Getters/Setters, Constructors) |
| Maven | Dependency management |
| Postman | API testing |

## ⚙️ application.properties (sample)

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/BankManagementSystem
spring.datasource.username=postgres
spring.datasource.password=vignesh
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 🚀 API Endpoints

| Method | Endpoint | Description |
|--------|----------|--------------|
| POST | `/save` | Create new account |
| GET | `/get` | Get all accounts |
| GET | `/get/{id}` | Get account by ID |
| POST | `/update/{id}` | Update account |
| DELETE | `/delete/{id}` | Delete account |

## ▶️ How to Run

1. Clone the repository
2. Open the project in Eclipse IDE
3. Configure `application.properties` with your PostgreSQL credentials
4. Run the application as a **Spring Boot App**
5. Test APIs using **Postman**

## 👤 Author

**Vignesh** -[GitHub](https://github.com/vignes016-prog)
