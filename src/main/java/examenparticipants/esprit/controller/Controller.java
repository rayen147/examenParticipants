package examenparticipants.esprit.controller;

import examenparticipants.esprit.entity.Evenement;
import examenparticipants.esprit.entity.Participant;
import examenparticipants.esprit.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @Autowired
Iservice service;
    @PostMapping("/ajouterParticipant")
    public Participant ajouterParticipant(@RequestBody Participant p){
        return service.ajouterParticipant(p);
    }
    @PostMapping("/ajoutAffectEvenParticip")
    public Evenement ajoutAffectEvenParticip(@RequestBody Evenement e){
        return service.ajoutAffectEvenParticip(e);
    }

}
