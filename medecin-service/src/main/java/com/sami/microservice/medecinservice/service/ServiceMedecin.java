package com.sami.microservice.medecinservice.service;

import com.sami.microservice.medecinservice.entities.Medecin;
import com.sami.microservice.medecinservice.repository.MedecinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceMedecin implements IServiceMedecin {
    public final MedecinRepository medecinRepository;
    @Override
    public Medecin createMedecin(Medecin a) {
        return medecinRepository.save(a);
    }

    @Override
    public Medecin findMedecinById(int id) {
        return medecinRepository.findById(id).get();
    }

    @Override
    public List<Medecin> findAllMedecins() {
        return medecinRepository.findAll();
    }

    @Override
    public Medecin updateMedecin(Medecin a) {
        return medecinRepository.save(a);
    }

    @Override
    public void deleteMedecin(int id) {
        medecinRepository.deleteById(id);
    }
}
