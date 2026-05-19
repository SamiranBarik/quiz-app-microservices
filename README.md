# Quiz App Microservices

A Quiz Application built using Microservices Architecture with Spring Boot and Spring Cloud.

## 🚀 Tech Stack

- Java 17
- Spring Boot
- Spring Cloud
- Spring Data JPA
- MySQL
- Eureka Server
- API Gateway
- OpenFeign
- Maven

## 📌 Microservices Included

### 1. Question Service
- Manage quiz questions
- CRUD operations for questions
- Connects with database using JPA

### 2. Quiz Service
- Create quizzes
- Fetch random questions
- Calculate score

### 3. Service Registry (Eureka Server)
- Registers all microservices
- Enables service discovery

### 4. API Gateway
- Single entry point for all APIs
- Routes requests to respective services

---

## 🔄 Microservice Communication

- Implemented using OpenFeign Client
- Services communicate using REST APIs

---

## ⚙️ Features

- Service Discovery using Eureka
- API Gateway Routing
- Load Balancing
- RESTful APIs
- Database Integration
- Independent Deployable Services

---

## 📂 Project Structure

```
quiz-app-microservices
│
├── api-gateway
├── question-services
├── quiz-services
└── services-registry
```

---

## ▶️ Run the Project

### Step 1: Start Eureka Server
```bash
cd services-registry
mvn spring-boot:run
```

### Step 2: Start Question Service
```bash
cd question-services
mvn spring-boot:run
```

### Step 3: Start Quiz Service
```bash
cd quiz-services
mvn spring-boot:run
```

### Step 4: Start API Gateway
```bash
cd api-gateway
mvn spring-boot:run
```

---

## 📡 API Endpoints

### Question Service
- GET /question/allQuestions
- POST /question/add

### Quiz Service
- POST /quiz/create
- GET /quiz/get/{id}

---

## 📖 Learning Outcome

This project helped me understand:
- Microservices Architecture
- Service Discovery
- API Gateway
- Inter-service Communication
- Distributed Systems Basics

---

## 👨‍💻 Author

Samiran Barik
