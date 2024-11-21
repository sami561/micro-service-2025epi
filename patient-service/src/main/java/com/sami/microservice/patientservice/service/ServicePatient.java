package com.sami.microservice.patientservice.service;


import com.sami.microservice.patientservice.entities.Patient;
import com.sami.microservice.patientservice.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicePatient implements  IServicePatient {
    public final PatientRepository patientRepository;
    @Override
    public Patient createPatient(Patient p) {
        return patientRepository.save(p);
    }

    @Override
    public Patient findPatientById(int id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public List<Patient> findAllPatient() {
        return patientRepository.findAll();
    }

    @Override
    public Patient updatePatient(Patient a) {
        return patientRepository.save(a);
    }

    @Override
    public void deletePatient(int id) {
        patientRepository.deleteById(id);
    }
}
