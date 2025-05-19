package ma.enset.gestioncreditsbancaires.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Remboursement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private Double montant;
    private String type; // Exemple: Mensualité, Remboursement anticipé

    @ManyToOne
    @JoinColumn(name = "credit_id")
    private Credit credit;
}