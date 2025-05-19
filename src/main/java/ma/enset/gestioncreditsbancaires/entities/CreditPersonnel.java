package ma.enset.gestioncreditsbancaires.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@DiscriminatorValue("Personnel")
@Data
public class CreditPersonnel extends Credit {
    private String motif; // Exemple: Achat de voiture, Études, Travaux
}
