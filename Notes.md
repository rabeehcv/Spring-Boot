## Spring

"Spring" is a broad term that encompasses the entire ecosystem of projects and tools developed by the Spring community.
Some key projects under the Spring umbrella include:

- Spring Framework: The core framework providing the foundation for dependency injection, AOP (Aspected oriented programming), etc. It is used to build various types of applications, including web applications, microservices, batch processing. Requires a server to be deployed(eg. Tomcat). Dependencies are manually managed.

- Spring Boot: Simplifies the creation of stand-alone, production-grade Spring applications with minimal configuration. It is a tool that makes developing web application and microservices with Spring Framework faster and easier. It is a standalone application with embedded server. Auto configuration based on classpath dependencies. It has built in production ready features(Actuators - to monitor and manage application health,etc). Spring Boot allows spring applications to run as standalone application which will be packaged as executable jars along with embedded server(eg. Tomcat). Spring Boot Starter will provides a set of convenient dependency descriptors to include a bundle of related dependencies(Eg. spring-boot-starter-data-jpa includes dependencies for JPA and Hibernate). It supprots embedded server, so that we dont have to deploy to an external server.

- Spring Data: Simplifies data access, provides repositories, and supports various data stores like JPA, MongoDB, Cassandra, etc.

- Spring Security: Provides comprehensive security services for applications.

- Spring Cloud: Offers tools for building distributed systems and microservices.

- Spring Batch: managing large volumes of records and job scheduling.

### Annotations

- @ComponentScan is a powerful annotation in Spring Framework used to automatically detect and register Spring-managed components (like beans, controllers, services, repositories, etc.) within a specified package or set of packages. @ComponentScan is used to tell Spring which packages to scan for components. Spring searches for classes annotated with @Component, @Service, @Repository, @Controller, or other stereotypes within the specified packages and their subpackages. Found components are automatically registered as beans(a Java object that forms the backbone of a Spring application.) in the Spring application context, making them available for dependency injection.

- @SpringBootApplication is a composite annotation in Spring Boot that simplifies the setup of a Spring application. It's a convenient way to enable auto-configuration, component scanning, and configuration property binding in a single step.
  Internally, @SpringBootApplication is composed of three main annotations:

@Configuration: Marks the class as a configuration class, allowing it to define beans.

@ComponentScan: Enables component scanning to automatically discover and register components (like services, repositories, controllers) as Spring beans.

@EnableAutoConfiguration: Enables Spring Boot's auto-configuration mechanism, which automatically configures beans based on classpath dependencies.

- @RestController is a specialized annotation in Spring Framework primarily used for developing RESTful web services(RESTful Web Service is a type of web service that follows the Representational State Transfer (REST) architectural style). It serves as a convenient shorthand for combining two other annotations:

@Controller: Indicates that the class is a controller, capable of handling web requests.

@ResponseBody: Specifies that the return value of methods should be directly written to the response body, instead of rendering a view.

```
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, World!";
    }
}
```

The GreetingController is annotated with @RestController.

The greeting method is annotated with @GetMapping to handle GET requests to the /greeting endpoint.

The method returns a simple string, which will be converted to JSON and sent as the response body.

- @Autowired - to get instance of the class. While @Autowired can be used to create an instance of a class, it's more accurate to say that it's used to inject an existing instance of a class into another class.
- @Repository - specialization of @Component annotation and is used to indicate that the class provides mechanicsm for storage, retrieval, update, delete and search operation on objects.
- @Entity -  to map domain objects to relational database tables. Marks a class as a database table.
- @Getter - Generates a getter method for a field.
- @Setter - Generates a setter method for a field.
- @Table: Maps a Java class to a database table. Allows customization of table name and schema, essential for complex database structures.
- @Column: Maps a Java field to a database column. Enables precise mapping of fields to columns, including column name, data type, and constraints.
- @Id - marks a field as a primary key of an entity.
- @GeneratedValue: Automatically generates values for primary key fields.
- @PrePersist: used on a method to indicate that it should be called before an entity is persisted to the database.
- @PostMapping("/create"): This annotation defines a POST HTTP method endpoint with the path /create.
- @GetMapping("/findall"): This annotation defines a GET HTTP method endpoint with the path /findall.
- @GetMapping("/findbyid/{id}"): This annotation defines a GET HTTP method endpoint with the path /findbyid/{id}. The {id} part is a path variable.
- @PatchMapping("/update"): This annotation defines a PATCH HTTP method endpoint with the path /update.
- @DeleteMapping("/delete/{id}"): This annotation defines a DELETE HTTP method endpoint with the path /delete/{id}. The {id} part is a path variable.
- @Service - to mark a class as a service provider, in which the class will provide business functionalities.

### Steps to follow

1. Go to Spring Initializr
2. Choose the options of your preference. For Example, Select Project -> Maven , Language -> Java, Spring Boot -> 3.3.2, Group Id -> (to whome this project belogs to, eg. com.personal), Artifact -> (project name), Packaging -> Jar, Version -> 17 , Dependencies (Spring web, spring boot actuator, etc)
3. Click Generate.
4. Extract zip file to the path of your choice.
5. Open IntelliJ and File -> Open -> (choose path)
6. Make sure java version is 17 on your project structure. File -> Project structure -> Project -> SDK -> JDK 17 version
7. Run
8. Go to browser and enter port such as, http://localhost:8080/("ending" such as "user" if you have provided @GetMapping("/user") in the controller component,)(you can view port number on console or can change it on application.properties file on resources by : server.port = 9001)
9. Using actuators, go to browser and search , localhost:8080/actuator/health (for further, paste the code on application.properties: management.endpoints.web.exposure.include=info,health,metrics,loggers,env,beans,mappings and search localhost:8080/actuator/env)

### Dependencies
- Spring web - provides essential components for building web applications, including RESTful services. It simplifies the setup process by automatically including necessary dependencies and configurations.
- Lombok - Java library that helps you reduce boilerplate code. It provides annotations that generate commonly used code snippets like getters, setters, constructors,etc. 
- Spring Data JPA - for using Spring Data JPA in Spring Boot application.
### Spring Boot JPA
- For managing relational data in our java application.
- Allows to access and persist data between java objects/classes and realtional database.
- It follows Object-Relation Mapping(ORM).
- Provides runtime EntityManager API for processing queries and transaction on the object against database.
- Uses JPQL(Java Persistent Query Language).

### Key components of a Spring Boot Application
#### Entities
- Represent data objects that correspond to database tables.
- Annotated with @Entity for JPA to recognize them.
- Examples: User, Product, Order.
#### Repositories
- Provide a mechanism to interact with the database.
- Annotated with @Repository.
- Define methods for CRUD operations (Create, Read, Update, Delete).
- Often use Spring Data JPA for implementation.
- Example: UserRepository, ProductRepository.
##### Note : Optional is a container class in Java that represents a value which may or may not be present. It provides a safe way to handle potential null values.
#### Controllers
- Handle incoming requests and return responses.
- Define endpoints and map HTTP methods (GET, POST, PUT, DELETE).
- Coordinate interactions between the view, service, and repository layers.
- Annotated with @Controller or @RestController.
- Example: UserController, ProductController.
#### Models
- Represent data structures used for transferring data between layers.
- Not strictly required but can improve code organization.
- Example: UserDto, ProductDto.
#### Services
- Contain business logic.
- Annotated with @Service.
- Example: UserService, ProductService.
