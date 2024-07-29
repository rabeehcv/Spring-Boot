## Spring

"Spring" is a broad term that encompasses the entire ecosystem of projects and tools developed by the Spring community.
Some key projects under the Spring umbrella include:

- Spring Framework: The core framework providing the foundation for dependency injection, AOP (Aspected oriented programming), etc. It is used to build various types of applications, including web applications, microservices, batch processing. Requires a server to be deployed(eg. Tomcat). Dependencies are manually managed.
- Spring Boot: Simplifies the creation of stand-alone, production-grade Spring applications with minimal configuration. It is a tool that makes developing web application and microservices with Spring Framework faster and easier. It is a standalone application with embedded server. Auto configuration based on classpath dependencies. It has built in production ready features. Spring Boot allows spring applications to run as standalone application which will be packaged as executable jars along with embedded server(eg. Tomcat). Spring Boot Starter will provides a set of convenient dependency descriptors to include a bundle of related dependencies(Eg. spring-boot-starter-data-jpa includes dependencies for JPA and Hibernate). It supprots embedded server, so that we dont have to deploy to an external server.
- Spring Data: Simplifies data access, provides repositories, and supports various data stores like JPA, MongoDB, Cassandra, etc.
- Spring Security: Provides comprehensive security services for applications.
- Spring Cloud: Offers tools for building distributed systems and microservices.
- Spring Batch: managing large volumes of records and job scheduling.
