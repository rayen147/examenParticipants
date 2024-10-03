package examenparticipants.esprit.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Evenement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String description;
    Date dateDebut;
    Date dateFin;
    float cout;
    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Participant> participants;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Logistique> Logistiques;


}

