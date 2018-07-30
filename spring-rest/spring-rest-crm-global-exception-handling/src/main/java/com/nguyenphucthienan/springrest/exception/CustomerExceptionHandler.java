package com.nguyenphucthienan.springrest.exception;

import com.nguyenphucthienan.springrest.response.CustomerErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundException exception) {
        CustomerErrorResponse customerErrorResponse = new CustomerErrorResponse();
        customerErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        customerErrorResponse.setMessage(exception.getMessage());
        customerErrorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(customerErrorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> handleException(Exception exception) {
        CustomerErrorResponse customerErrorResponse = new CustomerErrorResponse();
        customerErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        customerErrorResponse.setMessage(exception.getMessage());
        customerErrorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(customerErrorResponse, HttpStatus.BAD_REQUEST);
    }
}
