# Student Management RESTful API

Built using **Spring Boot**, providing Create, Read, Update, Delete (CRUD) functionalities. The APP interacts with a MySQL database using Spring Data JPA and exposes endpoints using Spring Web. Errors are handled gracefully and thoroughly.

---

## Technologies Used

- Spring Web (REST Controllers)
- Spring Data JPA
- MySQL
- Maven
- Java 17+

---

## Project Structure

```
src/main/java
 └── com/example/studentmanagement
     ├── controller    # Handles REST API endpoints
     ├── entity        # Student entity
     ├── dao           # JPA repository for database access
     ├── service       # Operational logic
     └── StudentManagementApplication.java # Main application class

src/main/resources
 ├── application.properties  # App configuration (DB settings)
 └── student_db_setup.sql    # SQL script to create and populate the student table
```

---

## API Endpoints

| HTTP Method | Endpoint             | Description                  |
|-------------|----------------------|------------------------------|
| GET         | `/api/students`      | Get all students             |
| GET         | `/api/students/{id}` | Get a student by ID          |
| POST        | `/api/students`      | Create a new student         |
| PUT         | `/api/students/{id}` | Update an existing student   |
| DELETE      | `/api/students/{id}` | Delete a student             |

---

## Database Schema

**(Included in `student_db_setup.sql`)**

```sql
CREATE DATABASE IF NOT EXISTS student_repository;
USE student_repository;

DROP TABLE IF EXISTS student;

CREATE TABLE student (
  id INT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(45) DEFAULT NULL,
  last_name VARCHAR(45) DEFAULT NULL,
  email VARCHAR(45) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO student (first_name, last_name, email) VALUES
('Peppa', 'Pig', 'peppa@suka.com'),
('Suzy', 'Sheep', 'suzy@suka.com'),
('Danny', 'Dog', 'danny@suka.com'),
('Benny', 'Bull', 'benny@suka.com'),
('Candy', 'Cat', 'candy@suka.com');
```

---

## Example JSON Payloads

**POST /api/students**

```json
{
  "firstName": "George",
  "lastName": "Pig",
  "email": "george@suka.com"
}
```

**CUSTOM STUDENT_NOT_FOUND Exception**

```json
{
  "timeStamp": 172633,
  "error": STUDENT_NOT_FOUND,
  "message": "Student with ID 7 not found"
}
```
