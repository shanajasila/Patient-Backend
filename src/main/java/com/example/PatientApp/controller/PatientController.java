package com.example.PatientApp.controller;

import com.example.PatientApp.dao.PatientDao;
import com.example.PatientApp.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Patient> viewpage(){
        return(List<Patient>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addemp",consumes = "application/json",produces = "application/json")
    public String add(@RequestBody Patient p){
        System.out.println(p.getPatientname());
        System.out.println(p.getAdress());
        System.out.println(p.getContactno());
        System.out.println(p.getDateofappoinment());
        System.out.println(p.getDoctorname());
        dao.save(p);
        return "Employee added successfully";
    }
}
