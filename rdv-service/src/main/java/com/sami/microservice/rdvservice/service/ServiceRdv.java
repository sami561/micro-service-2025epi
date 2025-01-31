package com.sami.microservice.rdvservice.service;


import com.sami.microservice.rdvservice.entites.Rdv;
import com.sami.microservice.rdvservice.repository.RdvRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceRdv implements IServiceRdv{
    public final RdvRepository rdvRepository;


    @Override
    public Rdv createRdv(Rdv p) {
        Rdv rdv1=rdvRepository.findByMedecinIdAndDateRdv(p.getMedecin().getId(),p.getDateRdv());
        Rdv rdv2=rdvRepository.findByPatientIdAndDateRdv(p.getPatient().getId(),p.getDateRdv());
        if(rdv1==null && rdv2==null)
            return rdvRepository.save(p);
        else
        return null;
    }

    @Override
    public Rdv findRdvById(int id) {
        return  rdvRepository.findById(id).get() ;
    }

    @Override
    public List<Rdv> findAllRdv() {
        return rdvRepository.findAll();
    }

    @Override
    public Rdv updateRdv(Rdv a) {
        return rdvRepository.save(a);
    }

    @Override
    public void deleteRdv(int id) {
        rdvRepository.deleteById(id);
    }
}
