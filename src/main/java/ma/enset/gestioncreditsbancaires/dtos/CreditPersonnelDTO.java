package ma.enset.gestioncreditsbancaires.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CreditPersonnelDTO extends CreditResponseDTO {
    private String motif; // Exemple : achat de voiture, études
}