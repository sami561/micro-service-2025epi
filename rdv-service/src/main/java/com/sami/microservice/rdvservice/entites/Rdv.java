package com.sami.microservice.rdvservice.entites;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sami.microservice.rdvservice.Model.Medecin;
import com.sami.microservice.rdvservice.Model.Patient;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rdv {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss", shape = JsonFormat. Shape.STRING)
private LocalDateTime dateRdv;
private String etat;
@Transient
private Patient patient;
private int patientId;
@Transient
private Medecin medecin;
private int medecinId;
}
