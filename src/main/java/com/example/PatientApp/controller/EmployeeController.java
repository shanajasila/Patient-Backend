package com.example.PatientApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/view")
    public String viewpage(){
        return "welcome";
    }

    @PostMapping("/addemp")
    public String add(){
        return "Employee added successfully";
    }
}
