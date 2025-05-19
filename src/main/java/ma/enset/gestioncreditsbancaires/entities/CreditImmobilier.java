package ma.enset.gestioncreditsbancaires.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@DiscriminatorValue("Immobilier")
@Data
public class CreditImmobilier extends Credit {
    private String typeBien; // Exemple: Appartement, Maison, Local Commercial
}
