package examenparticipants.esprit.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Participant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPart;
    String nom;
    String prenom;
    @Enumerated(EnumType.STRING)
    Tache tache;
    @JsonIgnore
    @ManyToMany(mappedBy="participants", cascade = CascadeType.ALL)
    private Set<Evenement> evenements;





}
