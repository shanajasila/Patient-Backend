package com.example.PatientApp.dao;

import com.example.PatientApp.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientDao extends CrudRepository<Patient,Integer> {

}
