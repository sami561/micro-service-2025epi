package com.sami.microservice.rdvservice.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Medecin {
    private int id;
    private String nom;
    private String prenom;
    private String specialite;
    private String adresse;
}


