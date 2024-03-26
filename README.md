# User Management API

This project provides a RESTful API for managing user accounts.

## Technologies Used
- Java
- Spring Boot
- Spring Data JDBC
- Swagger (for API documentation)

## Getting Started
1. Clone the repository: git clone https://github.com/aniketbgadhave/indovationTest.git
2. Navigate to the project directory: cd user-management-api
3. Build the project: mvn clean package

## Configuration
- Configure the database connection in application.properties file.

## Running the Application
1. Run the application: java -jar target/user-management-api.jar
2. The application will start running at http://localhost:8080.

## API Documentation
- Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)


## API Endpoints
- Signup: *POST* /api/users/signup
- Login: *POST* /api/users/login
- Get User Details: *GET* /api/users/{id}
- Delete User: *DELETE* /api/users/{id}

##CONTRIBUTOR
aniketgadhave0809@gmail.com


