package com.example.PatientApp.controller;

import com.example.PatientApp.model.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @GetMapping("/view")
    public String viewpage(){
        return "welcome";
    }

    @PostMapping(path = "/addemp",consumes = "application/json",produces = "application/json")
    public String add(@RequestBody Patient p){
        System.out.println(p.getPatientname());
        System.out.println(p.getAdress());
        System.out.println(p.getContactno());
        System.out.println(p.getDateofappoinment());
        System.out.println(p.getDoctorname());
        return "Employee added successfully";
    }
}
