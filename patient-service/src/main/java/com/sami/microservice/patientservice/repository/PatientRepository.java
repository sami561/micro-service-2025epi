package com.sami.microservice.patientservice.repository;

import com.sami.microservice.patientservice.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository  extends JpaRepository<Patient,Integer> {
}
