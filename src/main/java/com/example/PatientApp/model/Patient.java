package com.example.PatientApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Patient {

    @Id
    @GeneratedValue
    private int id;
    private String patientname;
    private String adress;
    private String contactno;
    private String dateofappoinment;
    private String doctorname;

    public Patient() {
    }

    public Patient(int id, String patientname, String adress, String contactno, String dateofappoinment, String doctorname) {
        this.id = id;
        this.patientname = patientname;
        this.adress = adress;
        this.contactno = contactno;
        this.dateofappoinment = dateofappoinment;
        this.doctorname = doctorname;
    }

    public int getId() {
        return id;
    }

    public String getPatientname() {
        return patientname;
    }

    public String getAdress() {
        return adress;
    }

    public String getContactno() {
        return contactno;
    }

    public String getDateofappoinment() {
        return dateofappoinment;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public void setDateofappoinment(String dateofappoinment) {
        this.dateofappoinment = dateofappoinment;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }
}
