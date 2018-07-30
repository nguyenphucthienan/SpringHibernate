package com.nguyenphucthienan.springrest.exception;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String message) {
        super(message);
    }

    public CustomerNotFoundException(Throwable throwable) {
        super(throwable);
    }

    public CustomerNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
