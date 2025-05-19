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
    // Méthode pour définir le nom d'utilisateur (ajoutée pour cohérence)
    // Méthode pour récupérer le nom d'utilisateur (username)
    @Setter
    @Getter
    private String username; // Identifiant (nom d'utilisateur) du client
    // Méthode pour récupérer le mot de passe (par exemple, pour la sécurité ou l'encodage)
    // Méthode pour définir le mot de passe
    @Getter
    @Setter
    private String password; // Mot de passe du client

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Credit> credits; // Liste des crédits associés au client

}