package com.example.PatientApp.dao;

import com.example.PatientApp.model.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patient,Integer> {
    @Query(value = "SELECT `id`, `adress`, `contactno`, `dateofappoinment`, `doctorname`, `patientname` FROM `employees` WHERE `patientname`= :patientname",nativeQuery = true)
    List<Patient> searchPatient(@Param("patientname") String patientname);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `employees` WHERE `id`= :id",nativeQuery = true)
    void deletePatient(@Param("id")Integer id);

}
