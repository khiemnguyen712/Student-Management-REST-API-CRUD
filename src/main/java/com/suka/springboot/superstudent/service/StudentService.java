package com.suka.springboot.superstudent.service;

import com.suka.springboot.superstudent.dao.StudentRepository;
import com.suka.springboot.superstudent.entity.Student;
import com.suka.springboot.superstudent.exception.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    // Find all student
    public List<Student> findAllUser() {
        return studentRepository.findAll();
    }

    // Find student by ID
    public Student findById(int id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student id not found: " + id));
    }

    // Save new student to database
    public void save(Student student) {
        studentRepository.save(student);
    }

    // Update student by id
    public void update(int id, Student newStudent) {
        Student existingStudent = findById(id);

        existingStudent.setFirstName(newStudent.getFirstName());
        existingStudent.setLastName(newStudent.getLastName());
        existingStudent.setEmail(newStudent.getEmail());

        studentRepository.save(newStudent);
    }

    // Delete student by ID
    public void delete(int id) {
        findById(id);

        studentRepository.deleteById(id);

        System.out.println("Successfully deleted student with ID: " + id);
    }
}
