package com.nguyenphucthienan.springrest.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(Throwable throwable) {
        super(throwable);
    }

    public StudentNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
