package com.example.PatientApp.controller;

import com.example.PatientApp.dao.PatientDao;
import com.example.PatientApp.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/viewpatient")
    public List<Patient> viewpage(){
        return(List<Patient>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addpatient",consumes = "application/json",produces = "application/json")
    public Map<String,String> add(@RequestBody Patient p){
//        System.out.println(p.getPatientname());
//        System.out.println(p.getAdress());
//        System.out.println(p.getContactno());
//        System.out.println(p.getDateofappoinment());
//        System.out.println(p.getDoctorname());
        dao.save(p);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins ="*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Patient> Searchpatient(@RequestBody Patient p){
        String empcode=String.valueOf(p.getPatientname());
        System.out.println(empcode);
        dao.searchPatient(p.getPatientname());
        return(List<Patient>)dao.searchPatient(p.getPatientname());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> delete(@RequestBody Patient d){
        String id=String.valueOf(d.getId());
        System.out.println(id);
        dao.deletePatient(d.getId());
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return map;
    }
}
