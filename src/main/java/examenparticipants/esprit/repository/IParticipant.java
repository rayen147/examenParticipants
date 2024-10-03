package examenparticipants.esprit.repository;

import examenparticipants.esprit.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IParticipant extends JpaRepository <Participant,Integer> {
    Participant findByNomAndPrenom (String n,String p);

}
