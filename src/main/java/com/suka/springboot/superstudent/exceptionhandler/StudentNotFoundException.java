package com.suka.springboot.superstudent.exceptionhandler;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
