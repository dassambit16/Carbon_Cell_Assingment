# CarbonCell User Management System

The **CarbonCell User Management System** is a RESTful API for managing users in a web application. It provides endpoints for user authentication, creation, retrieval, and deletion, interacting with the database through the `UserService` and `UserRepository`. JWT authentication is implemented to secure the API endpoints.

## Features

- User authentication with email and password
- User creation with basic information
- Retrieval of user details by ID
- Retrieval of all users
- Deletion of users by ID

## Technologies Used

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Lombok
- PostgreSQL (for database)
- JSON Web Token (JWT) for authentication

## Dependencies Used

- **Spring Boot Starter Security**: Provides security features for the Spring Boot application.
- **Spring Security Config**: Configuration for Spring Security.
- **Spring Boot Starter**: Core dependencies for Spring Boot application.
- **JJWT (Java JWT)**: Library for JSON Web Tokens (JWT) creation and verification.
- **SLF4J API**: Simple Logging Facade for Java (SLF4J) API.
- **SLF4J Simple**: Simple implementation of SLF4J.
- **Java Servlet API**: Provides interfaces and classes for writing servlets.
- **SpringDoc OpenAPI Starter WebMVC UI**: Integration for OpenAPI (Swagger) documentation with Spring Boot.
- **Spring Boot Starter Data JPA**: Spring Boot starter for using Spring Data JPA.
- **Spring Boot Starter Web**: Starter for building web, including RESTful, applications using Spring MVC.
