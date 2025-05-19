package ma.enset.gestioncreditsbancaires.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CreditImmobilierDTO extends CreditResponseDTO {
    private String typeBien; // Exemple : Appartement, Maison, Local Commercial
}