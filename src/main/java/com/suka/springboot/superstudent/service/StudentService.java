package com.suka.springboot.superstudent.service;

import com.suka.springboot.superstudent.dao.StudentRepository;
import com.suka.springboot.superstudent.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> findAllUser() {
        return studentRepository.findAll();
    }

    public Student findById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public void save(Student student) {
        studentRepository.save(student);
    }

    public void update(int id, Student student) {
        Student studentFound = studentRepository.findById(id).orElseThrow() =>
    }

    public void delete(int id) {
        studentRepository.deleteById(id);
    }
}
