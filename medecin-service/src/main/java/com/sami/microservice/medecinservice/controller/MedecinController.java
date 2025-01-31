package com.sami.microservice.medecinservice.controller;


import com.sami.microservice.medecinservice.entities.Medecin;
import com.sami.microservice.medecinservice.service.IServiceMedecin;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/doctor")
@AllArgsConstructor
public class MedecinController {
    private  final IServiceMedecin iServiceMedecin;
    @GetMapping("/all")
    public ResponseEntity<List<Medecin>> findAll(){
        return ResponseEntity.ok(iServiceMedecin.findAllMedecins());
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Medecin> findMedecin(@PathVariable("id") int id){
        Medecin d = iServiceMedecin.findMedecinById(id);
        if (d==null){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(d);
        }
    }
    @PostMapping("/add")
    public ResponseEntity<Medecin>addMedecin(@RequestBody Medecin d){
        Medecin dr = iServiceMedecin.createMedecin(d);
        return ResponseEntity.ok(dr);
    }
    @PutMapping("/update")
    public ResponseEntity<Medecin>updateMedecin(@RequestBody Medecin d){
        Medecin dr = iServiceMedecin.updateMedecin(d);
        return ResponseEntity.ok(dr);
    }
    @DeleteMapping("/delete/{id}")
    public void  deleteDoctor(@PathVariable("id") int id){
        iServiceMedecin.deleteMedecin(id);
    }


}
