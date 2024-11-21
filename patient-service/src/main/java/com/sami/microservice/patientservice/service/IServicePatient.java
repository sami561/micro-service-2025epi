package com.sami.microservice.patientservice.service;

import com.sami.microservice.patientservice.entities.Patient;

import java.util.List;

public interface IServicePatient {
    public Patient createPatient(Patient p);
    public  Patient findPatientById(int id);
    public List<Patient> findAllPatient();
    public Patient updatePatient(Patient a);
    public void deletePatient(int id);
}
