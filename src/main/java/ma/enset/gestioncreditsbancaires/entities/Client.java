package ma.enset.gestioncreditsbancaires.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom; // Nom du client
    private String email; // Email du client
    @Setter
    @Getter
    private String username; // Identifiant (nom d'utilisateur) du client
    @Getter
    @Setter
    private String password; // Mot de passe du client
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Credit> credits; // Liste des crédits associés au client

}