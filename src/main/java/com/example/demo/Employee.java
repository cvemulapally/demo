package com.example.demo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "Employee")
public class Employee {

    @NotBlank(message = "Must Supply FirstName")
    private String firstName;
    @NotBlank(message = "Must Supply LastName")
    private String lastName;
}
