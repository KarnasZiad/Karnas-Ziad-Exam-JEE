package ma.enset.gestioncreditsbancaires.dtos;

import lombok.Data;
import java.time.LocalDate;

@Data
public class CreditResponseDTO {
    private Long id;
    private LocalDate dateDemande;
    private String statut; // Exemple : "En cours", "Accepté", "Rejeté"
    private LocalDate dateAcceptation;
    private Double montant;
    private Integer dureeRemboursement; // En mois
    private Double tauxInteret;

    public void setDateDemande(String dateDemande) {
    }
}