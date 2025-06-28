

### ✅ Complete `README.md` for `employee-project`


# 🧑‍💼 Employee Management System

A full-stack Employee Management application with a **React frontend**, **Spring Boot backend**, **MySQL database**, and **Dockerized microservices architecture**. Integrated with **GitHub Actions** for CI/CD automation.

---

## 📌 Overview

This project allows users to manage employee records with functionalities to:

- Create, Read, Update, and Delete (CRUD) employee data
- View employee list in a modern UI
- API-first development using REST principles
- Dockerized development & deployment

---

## ⚙️ Tech Stack

| Layer         | Technology                  |
|---------------|------------------------------|
| Frontend      | React                        |
| Backend       | Spring Boot (Java)           |
| Database      | MySQL                        |
| DevOps        | Docker, Docker Compose       |
| CI/CD         | GitHub Actions               |

---

## 🖼️ Application Architecture

```txt
📦 employee-project
├── backend/                # Spring Boot REST API
│   ├── Dockerfile
│   └── src/
├── frontend/               # React frontend
│   ├── Dockerfile
│   └── src/
├── docker-compose.yml      # Docker Orchestration
└── .github/workflows/      # GitHub Actions workflows
````

---

## 🚀 Getting Started

### ✅ Prerequisites

* Docker & Docker Compose installed
* Java 17+ (for backend standalone run)
* Node.js & npm (for frontend standalone run)

---

## 🐳 Run with Docker Compose (Recommended)

```bash
git clone https://github.com/Akash-Adak/employee-project.git
cd employee-project
docker-compose up --build
```

🚀 The services will start at:

* Frontend: [http://localhost:3000](http://localhost:3000)
* Backend: [http://localhost:8080/api/employees](http://localhost:8080/api/employees)
* MySQL: localhost:3306 (default user: `root`, password: `root`)

---



## 🔧 Run Manually Without Docker (Optional)

### Backend (Spring Boot)

```bash
cd backend
./mvnw spring-boot:run
```

### Frontend (React)

```bash
cd frontend
npm install
npm start
```

---

## 🧪 API Endpoints

| Method | Endpoint            | Description         |
| ------ | ------------------- | ------------------- |
| GET    | /api/employees      | Get all employees   |
| GET    | /api/employees/{id} | Get employee by ID  |
| POST   | /api/employees      | Create new employee |
| PUT    | /api/employees/{id} | Update employee     |
| DELETE | /api/employees/{id} | Delete employee     |

---

## ✅ GitHub Actions CI/CD

* Automatically runs Maven tests and builds backend on push
* Frontend build validation
* Docker build and deploy steps
* Defined in `.github/workflows/ci.yml`

---

## 🧑 Author

**Akash Adak**
📧 [akashadak@example.com](mailto:akashadak@example.com)
🌐 [GitHub](https://github.com/Akash-Adak)

---

## 📄 License

This project is licensed under the MIT License.

---

## 🙌 Contribution

Feel free to fork this repository and submit pull requests. All contributions are welcome!



