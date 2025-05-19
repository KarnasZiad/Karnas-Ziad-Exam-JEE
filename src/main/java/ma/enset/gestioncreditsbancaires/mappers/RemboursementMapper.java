package ma.enset.gestioncreditsbancaires.mappers;

import ma.enset.gestioncreditsbancaires.dtos.RemboursementRequestDTO;
import ma.enset.gestioncreditsbancaires.dtos.RemboursementResponseDTO;
import ma.enset.gestioncreditsbancaires.entities.Remboursement;
import org.springframework.stereotype.Component;

@Component
public class RemboursementMapper {

    public RemboursementResponseDTO toDTO(Remboursement remboursement) {
        RemboursementResponseDTO dto = new RemboursementResponseDTO();
        dto.setId(remboursement.getId());
        dto.setDate(remboursement.getDate());
        dto.setMontant(remboursement.getMontant());
        dto.setType(remboursement.getType());
        return dto;
    }

    public Remboursement fromDTO(RemboursementRequestDTO dto) {
        Remboursement remboursement = new Remboursement();
        remboursement.setDate(dto.getDate());
        remboursement.setMontant(dto.getMontant());
        remboursement.setType(dto.getType());
        return remboursement;
    }
}