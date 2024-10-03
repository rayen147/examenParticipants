package examenparticipants.esprit.repository;

import examenparticipants.esprit.entity.Logistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ILogistique extends JpaRepository<Logistique,Integer> {
}
