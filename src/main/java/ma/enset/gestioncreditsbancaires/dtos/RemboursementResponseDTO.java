package ma.enset.gestioncreditsbancaires.dtos;

import lombok.Data;
import java.time.LocalDate;

@Data
public class RemboursementResponseDTO {
    private Long id;
    private LocalDate date;
    private Double montant;
    private String type; // Exemple : Mensualité, Remboursement anticipé

    public void setDate(String date) {
    }
}