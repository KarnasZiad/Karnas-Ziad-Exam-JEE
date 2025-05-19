package ma.enset.gestioncreditsbancaires.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@DiscriminatorValue("Professionnel")
@Data
public class CreditProfessionnel extends Credit {
    private String motif;
    private String raisonSociale; // Nom de l’entreprise
}
