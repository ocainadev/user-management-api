![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.x-green)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![License](https://img.shields.io/badge/License-MIT-blue)
# User Management API


A RESTful API built with Java and Spring Boot for managing users and tasks. This project demonstrates core backend development concepts such as layered architecture, data persistence with JPA, database versioning with Flyway, DTO mapping, and RESTful service design.

## Features

### User Management

* Create users
* Retrieve users by ID
* List all users
* Update user information
* Delete users

### Task Management

* Create tasks
* Retrieve tasks by ID
* List all tasks
* Delete tasks

## Tech Stack

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* H2 Database
* Flyway
* Lombok
* Maven

## Architecture

The project follows a layered architecture pattern:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

Project structure:

```text
src/main/java/dev/ocaina/usercontroller

├── Users
│   ├── UserController
│   ├── UserService
│   ├── UserRepository
│   ├── UserDTO
│   ├── UserMapper
│   └── UserModel
│
├── Tasks
│   ├── TaskController
│   ├── TaskService
│   ├── TaskRepository
│   └── TaskModel
│
└── UserManagementApplication
```

## Database

The application uses H2 Database for development and testing.

Database versioning is managed using Flyway migrations.

Example:

```text
src/main/resources/db/migration
└── V2__Add_rank_tb_users.sql
```

## API Endpoints

### Users

| Method | Endpoint                |
| ------ | ----------------------- |
| GET    | `/api/user/all`         |
| GET    | `/api/user/{id}`        |
| POST   | `/api/user/create`      |
| PUT    | `/api/user/update/{id}` |
| DELETE | `/api/user/delete/{id}` |

### Tasks

| Method | Endpoint                |
| ------ | ----------------------- |
| GET    | `/api/task/all`         |
| GET    | `/api/task/{id}`        |
| POST   | `/api/task/create`      |
| DELETE | `/api/task/delete/{id}` |

## Getting Started

### Prerequisites

* Java 17+
* Maven 3.9+

### Clone the Repository

```bash
git clone https://github.com/ocainadev/user-management-api.git
cd user-management-api
```

### Run the Application

```bash
mvn spring-boot:run
```

Or build the application:

```bash
mvn clean package
```

Then run:

```bash
java -jar target/UserManagement-0.0.1-SNAPSHOT.jar
```

## Running Tests

```bash
mvn test
```

## Concepts Demonstrated

* RESTful API Design
* Layered Architecture
* Dependency Injection
* Spring Data JPA
* DTO Pattern
* Mapper Pattern
* Database Migrations with Flyway
* CRUD Operations
* Object-Oriented Programming

## Future Improvements

* Bean Validation
* Global Exception Handling
* Swagger/OpenAPI Documentation
* Unit Tests
* Integration Tests
* Docker Support
* PostgreSQL Support
* Pagination and Sorting
* Search Filters

## Author

Cainã Santos

GitHub: https://github.com/ocainadev

## License

This project is licensed under the MIT License.
