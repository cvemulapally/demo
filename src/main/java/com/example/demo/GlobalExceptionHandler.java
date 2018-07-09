package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<Error> handleException(MethodArgumentNotValidException ex) {
        com.example.demo.Error error = new com.example.demo.Error();
        List<FieldError> errorList = ex.getBindingResult().getFieldErrors();

        for (FieldError objectError : errorList) {
            error.setDescription(objectError.getDefaultMessage());
            error.setMessage(objectError.getField());
        }
        return new ResponseEntity<Error>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {HttpMediaTypeNotAcceptableException.class})
    public ResponseEntity<Error> handleException(HttpMediaTypeNotAcceptableException ex) {
        com.example.demo.Error error = new com.example.demo.Error();
        List<FieldError> errorList = null;

        for (FieldError objectError : errorList) {
            error.setDescription(objectError.getDefaultMessage());
            error.setMessage(objectError.getField());
        }
        return new ResponseEntity<Error>(error, HttpStatus.BAD_REQUEST);
    }

}
