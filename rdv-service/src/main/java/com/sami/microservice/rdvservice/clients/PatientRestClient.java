package com.sami.microservice.rdvservice.clients;

import com.sami.microservice.rdvservice.Model.Patient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PATIENT-SERVICE")
public interface PatientRestClient {
    @GetMapping("/patient/find/{id}")
     Patient getPatientById(@PathVariable int id);


}

