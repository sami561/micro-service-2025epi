package com.sami.microservice.rdvservice.controller;


import com.sami.microservice.rdvservice.Model.Medecin;
import com.sami.microservice.rdvservice.Model.Patient;
import com.sami.microservice.rdvservice.clients.MedecinRestClient;
import com.sami.microservice.rdvservice.clients.PatientRestClient;
import com.sami.microservice.rdvservice.entites.Rdv;
import com.sami.microservice.rdvservice.service.IServiceRdv;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rdv")
@AllArgsConstructor

public class RdvController {
    private final IServiceRdv iServiceRdv;
    private  final PatientRestClient patientRestClient;
    private final MedecinRestClient medecinRestClient;
    @GetMapping("/{id}")
    public Rdv findRdv(@PathVariable("id") int id){
        Rdv rdv = iServiceRdv.findRdvById(id);
        Patient patient = patientRestClient.getPatientById(rdv.getPatientId());
        Medecin medecin = medecinRestClient.getMedecinById(rdv.getMedecinId());
            rdv.setPatient (patient);
            rdv.setMedecin(medecin);
        return rdv;
    }
    @PostMapping("/add")
    public ResponseEntity<Object>addRdv(@RequestBody Rdv d){
        Rdv dr = iServiceRdv.createRdv(d);
        if(dr!= null)
            return new ResponseEntity<>(dr, HttpStatus.CREATED);
        else
            return new ResponseEntity<>("le rdv est deja reserver ",HttpStatus.CONFLICT);

    }
    @PutMapping("/update")
    public ResponseEntity<Rdv>updateRdv(@RequestBody Rdv d){
        Rdv dr = iServiceRdv.updateRdv(d);
        return ResponseEntity.ok(dr);
    }
    @DeleteMapping("/delete/{id}")
    public void  deleteDoctor(@PathVariable("id") int id){
       iServiceRdv.deleteRdv(id);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Rdv>> findAll(){
        return ResponseEntity.ok(iServiceRdv.findAllRdv());
    }


}
