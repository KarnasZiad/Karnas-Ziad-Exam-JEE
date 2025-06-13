package ma.enset.gestioncreditsbancaires.dtos;

import lombok.Data;

@Data
public class ClientResponseDTO {
    private Long id;
    private String nom;
    private String email;

    public ClientResponseDTO(Long id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    public ClientResponseDTO() {
    }
}