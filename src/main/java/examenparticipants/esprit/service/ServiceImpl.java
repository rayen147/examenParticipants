package examenparticipants.esprit.service;

import examenparticipants.esprit.entity.Evenement;
import examenparticipants.esprit.entity.Participant;
import examenparticipants.esprit.repository.IEvenement;
import examenparticipants.esprit.repository.IParticipant;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class ServiceImpl implements Iservice{
IParticipant iParticipant;
IEvenement iEvenement;

    @Override
    public Participant ajouterParticipant(Participant p) {
       return iParticipant.save(p);
    }

    @Transactional
    @Override
    public Evenement ajoutAffectEvenParticip(Evenement e) {
        Set<Participant> participants =e.getParticipants();
        e.setParticipants(new HashSet<>());
        for(Participant participant:participants){
            Participant existingParticipant =null;
            existingParticipant=iParticipant.findByNomAndPrenom(participant.getNom(),participant.getPrenom());
            if(existingParticipant!=null){
                e.getParticipants().add(participant);
            }
        }

        return iEvenement.save(e);
    }
}
