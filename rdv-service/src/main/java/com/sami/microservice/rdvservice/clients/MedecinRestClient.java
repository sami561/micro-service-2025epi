package com.sami.microservice.rdvservice.clients;

import com.sami.microservice.rdvservice.Model.Medecin;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "MEDECIN-SERVICE")
public interface MedecinRestClient {
    @GetMapping("/doctor/find/{id}")
    Medecin getMedecinById(@PathVariable int id);
}


