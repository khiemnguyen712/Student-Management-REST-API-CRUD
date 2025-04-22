package com.suka.springboot.superstudent.dao;

import com.suka.springboot.superstudent.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
