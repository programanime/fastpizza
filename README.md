# Project
this is a demo project to order some pizza

# Requirements
- Java 17
- Node 20
- Apache Maven 3.9.0

# Deploy
To deploy the application you need to run this command: 
```
mvn spring-boot:run
```
Then you need to open this url [http://localhost:8080](http://localhost:8080)

# Demo
![](doc/demo.gif)

# Arquitecture
## MVC
This application generally employs the MVC (Model-View-Controller) pattern. The View component is implemented using a React application, while both the Controller and Model components are represented by a Spring Boot API.
![](doc/mvc.svg)

## React
<img src="doc/react.png" alt="React Logo" style="max-width: 200px;max-height:200px;"><br/>
The React application utilizes Core UI as the boilerplate for the project. It leverages Axios for API communication, React Router for page navigation, and Redux for state management.

## SpringBoot
<img src="doc/springboot.png" alt="React Logo" style="max-width: 200px;max-height:200px;"><br/>
The Spring Boot API relies heavily on Spring Data REST to construct endpoints based on repositories. Information is stored in an in-memory database known as [H2](https://www.h2database.com/html/main.html). JPA is utilized for creating entities, and Swagger has been integrated to provide the API documentation.