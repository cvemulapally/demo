package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmpController {

    @PostMapping(value = "/emp", consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"})
    public ResponseEntity<Employee>  registerEmp(@Valid @RequestBody Employee employee){

        return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
    }
}
