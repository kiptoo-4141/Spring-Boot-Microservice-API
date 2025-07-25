# 🌱 Spring-Boot-Microservice-API

Welcome to the **Spring Boot Microservice API** project! 🚀  
This project demonstrates a **microservice architecture** using Spring Boot **v3.5.0**, Java **17**, and **Maven**, with support for **employee and department management**.  
The services are registered with **Netflix Eureka**, and communication is routed through an **API Gateway**. 🎯

---

## 📦 Tech Stack

| Tool/Framework      | Version       | Purpose                            |
|---------------------|---------------|------------------------------------|
| 🧰 Spring Boot       | 3.5.0         | Application framework              |
| ☕ Java              | 17            | Programming language               |
| 🛠️ Maven             | —             | Dependency & build management      |
| 🔍 Eureka Server     | Netflix OSS   | Service discovery                  |
| 🌐 Spring Cloud Gateway | —         | API Gateway for routing            |

---

## 🧩 Microservices Overview

This system consists of the following key components:

1. **🎛️ Service Registry (Eureka Server)**  
   - Manages service discovery and registration.
   
2. **🏢 Department Service**  
   - Add/Search departments  
   - Search employees under a department

3. **👤 Employee Service**  
   - Add/Search employees  
   - Assign employee to a department

4. **🛣️ API Gateway**  
   - Central entry point for all service requests  
   - Handles routing and load balancing

---

## 🧪 Features

✅ Add a new **employee**  
✅ Add a new **department**  
✅ Assign employees to departments  
✅ Retrieve **employee by ID**  
✅ Retrieve **department by ID**  
✅ Retrieve all **employees in a department**  
✅ Microservices registered in **Eureka**  
✅ Requests routed through a central **API Gateway**

---

## 🗂️ Project Structure


Each folder represents a standalone Spring Boot microservice.

---

## 🚀 Getting Started

### 🔧 Prerequisites

Make sure you have the following installed:

- Java 17+
- Maven 3.6+
- IDE (IntelliJ / VSCode / Eclipse)
- Postman or Curl for testing

### ▶️ How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/spring-boot-microservice-api.git
   cd spring-boot-microservice-api

   
**Start the Eureka Server**
```bash
cd service-registry
mvn spring-boot:run

Start the Department Service

cd ../department-service
mvn spring-boot:run


Start the Employee Service

cd ../employee-service
mvn spring-boot:run


Start the API Gateway

cd ../api-gateway
mvn spring-boot:run
