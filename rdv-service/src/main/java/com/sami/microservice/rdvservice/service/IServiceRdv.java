package com.sami.microservice.rdvservice.service;


import com.sami.microservice.rdvservice.entites.Rdv;

import java.util.List;

public interface IServiceRdv {
    public Rdv createRdv(Rdv p);
    public  Rdv findRdvById(int id);
    public List<Rdv> findAllRdv();
    public Rdv updateRdv(Rdv a);
    public void deleteRdv(int id);
}
