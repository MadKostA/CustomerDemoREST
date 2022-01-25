# CustomerDemoREST

This app is based on video https://www.youtube.com/watch?v=GOtoXLvg_IQ

Databse configuration

    Create database customerdemo Predefined username - root Predefined password - pass

Change in properties if required

spring.datasource.url=jdbc:mysql://localhost:3306/customerdemorest - database name spring.datasource.username=root - username spring.datasource.password=123456 - password spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver - driver spring.jpa.database=mysql - database type spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect - dialect

    git clone https://github.com/proselytear/customerdemo

    cd customerdemo

    mvn spring-boot:run

    Access CustomerService using next REST requests:

GET: localhost:9966/api/v1/customers/ - get all customers GET: localhost:9966/api/v1/customers/1 - get customer with ID 1

POST: localhost:9966/api/v1/customers/ Request body: { "firstName": "Kolya", "lastName": "Nikolaev", "address": "Test address", "budget": "100500" }

PUT: localhost:9966/api/v1/customers/ Request body: { "id": 2, "firstName": "Kolya", "lastName": "Nikolaev", "address": "Test address", "budget": "200800" }

DELETE: localhost:9966/api/v1/customers/2 - delete customer with ID 2
