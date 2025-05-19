package ma.enset.gestioncreditsbancaires.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "credit_type", discriminatorType = DiscriminatorType.STRING)
@Data
public abstract class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dateDemande;
    private String statut; // Exemple: En cours, Accepté, Rejeté
    private String dateAcception;
    private Double montant;
    private Integer dureeRemboursement; // En mois
    private Double tauxInteret;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "credit", cascade = CascadeType.ALL)
    private List<Remboursement> remboursements;

    public LocalDate getDateAcceptation() {
        return null;
    }
}
