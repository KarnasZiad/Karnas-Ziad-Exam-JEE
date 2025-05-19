package ma.enset.gestioncreditsbancaires.mappers;

import ma.enset.gestioncreditsbancaires.dtos.*;
import ma.enset.gestioncreditsbancaires.entities.*;
import org.springframework.stereotype.Component;

@Component
public class CreditMapper {

    public CreditResponseDTO toDTO(Credit credit) {
        CreditResponseDTO dto = new CreditResponseDTO();
        dto.setId(credit.getId());
        dto.setDateDemande(credit.getDateDemande());
        dto.setStatut(credit.getStatut());
        dto.setDateAcceptation(credit.getDateAcceptation());
        dto.setMontant(credit.getMontant());
        dto.setDureeRemboursement(credit.getDureeRemboursement());
        dto.setTauxInteret(credit.getTauxInteret());
        return dto;
    }

    public Object toSpecificDTO(Credit credit) {
        if (credit instanceof CreditPersonnel) {
            CreditPersonnelDTO dto = new CreditPersonnelDTO();
            dto.setMotif(((CreditPersonnel) credit).getMotif());
            return dto;
        } else if (credit instanceof CreditImmobilier) {
            CreditImmobilierDTO dto = new CreditImmobilierDTO();
            dto.setTypeBien(((CreditImmobilier) credit).getTypeBien());
            return dto;
        } else if (credit instanceof CreditProfessionnel) {
            CreditProfessionnelDTO dto = new CreditProfessionnelDTO();
            dto.setMotif(((CreditProfessionnel) credit).getMotif());
            dto.setRaisonSociale(((CreditProfessionnel) credit).getRaisonSociale());
            return dto;
        }
        return toDTO(credit); // Default case for generic Credit
    }
}