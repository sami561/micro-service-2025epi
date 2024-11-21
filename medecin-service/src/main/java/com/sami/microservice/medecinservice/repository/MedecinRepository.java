package com.sami.microservice.medecinservice.repository;

import com.sami.microservice.medecinservice.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Integer> {
}
