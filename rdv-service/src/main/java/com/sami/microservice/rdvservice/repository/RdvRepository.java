package com.sami.microservice.rdvservice.repository;

import com.sami.microservice.rdvservice.entites.Rdv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface RdvRepository extends JpaRepository<Rdv,Integer> {
    Rdv findByPatientIdAndDateRdv(int id, LocalDateTime ldt);
    Rdv findByMedecinIdAndDateRdv(int id,LocalDateTime ldt);
}
