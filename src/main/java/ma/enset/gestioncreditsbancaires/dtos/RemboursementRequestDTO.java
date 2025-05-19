package ma.enset.gestioncreditsbancaires.dtos;

import lombok.Data;
import java.time.LocalDate;

@Data
public class RemboursementRequestDTO {
    private LocalDate date;
    private Double montant;
    private String type;
}