package examenparticipants.esprit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Logistique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idLog;
    String description;
    boolean reserve;
    float  prixUnit;
    int quantite;

}
