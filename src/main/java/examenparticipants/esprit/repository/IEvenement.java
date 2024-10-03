package examenparticipants.esprit.repository;

import examenparticipants.esprit.entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEvenement extends JpaRepository<Evenement,Integer> {

}
