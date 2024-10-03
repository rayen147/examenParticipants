package examenparticipants.esprit.service;

import examenparticipants.esprit.entity.Evenement;
import examenparticipants.esprit.entity.Participant;

public interface Iservice {
    public Participant ajouterParticipant (Participant p);
    public Evenement ajoutAffectEvenParticip (Evenement e);
}
