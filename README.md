# RESTful API

Built using **Spring Boot**, providing Create, Read, Update, Delete (CRUD) functionalities on a MySQL database through the use of Spring Web and Spring Data JPA.

---

## Technologies Used

- Spring Web
- Spring Data JPA
- MySQL

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

| HTTP Method | Endpoint         | Description                  |
|-------------|------------------|------------------------------|
| GET         | `/students`      | Get all students             |
| GET         | `/students/{id}` | Get a student by ID          |
| POST        | `/students`      | Create a new student         |
| PUT         | `/students/{id}` | Update an existing student   |
| DELETE      | `/students/{id}` | Delete a student             |

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
  "error": 404,
  "message": "Student with ID 7 not found"
}
```
