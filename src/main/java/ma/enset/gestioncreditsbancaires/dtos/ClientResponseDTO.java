package ma.enset.gestioncreditsbancaires.dtos;

import lombok.Data;

@Data
public class ClientResponseDTO {
    private Long id;
    private String nom;
    private String email;
}