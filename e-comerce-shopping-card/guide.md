https://www.javaguides.net/2019/01/spring-boot-microsoft-sql-server-jpa-hibernate-crud-restful-api-tutorial.html?fbclid=IwAR26WZyvju4qFbEg9uFUjFmkmFZoZuNb8jXHlRx1a8XMFZ44xcCBGGQ0Gds#:~:text=Spring%20Boot%20%2B%20Microsoft%20SQL%20Server%20%2B%20JPA%2FHibernate,Configure%20the%20MS-SQL%20Server%20in%20an%20application.properties%20file

# Step 1: Create spring project
     <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
		</dependency>

		<dependency>
			<groupId>com.microsoft.sqlserver</groupId>
			<artifactId>mssql-jdbc</artifactId>
			<scope>runtime</scope>
		</dependency>
# Step 2: Create package model, service, repository, controller, serviceImpl, exception

# Step 3: Configuring MS-SQL Server Database
* file pat resources/applications.properties
# Step 4: Create JPA Entity - Employee.java
@Entity: This anotation mark the class is an entity on database system and represent the employee table on database.
@Table: Define the name of table on database from Employee class
@Id: Define the id of entity on database
@Generatevalue: Define the generated value for id on database.
Example: @GeneratedValue(strategy = GenerationType.IDENTITY): 
* GenerationType.IDENTITY that means identity id is automatically increased.
# Step 5: Create Spring Data Repository - EmployeeRepository.java
