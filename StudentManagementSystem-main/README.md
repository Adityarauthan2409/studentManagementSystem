# StudentManagementSystem

Simple App (contain one entity "Student") using Springboot MVC. this App make CRUD operation on Student table, which we define in MySQL server

## Requirments to run App:
* create DB (mySQL) with name (students) using mysql server (I use XAMMP) note: in "application.properties" we define url to connect DB 
if you have another port number or password etc, you can change it in this file
* JavaSE-17 (JDK)
* Eclipse STS

# Dependencies, which I use when I create Spring boot Application:
* Spring web: to configure web files (ex: spring-boot-starter-parent)
* MySQL driver: to configure Mysql driver (embeded Tomcat)
* Spring Data JPA: to configure Database connection
* Spring boot Devtools: useful tool when we develop web App (ex: live server)
* Thymeleaf: (library to help us to make view layer)
