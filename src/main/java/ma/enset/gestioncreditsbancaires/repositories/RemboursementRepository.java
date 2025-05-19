package ma.enset.gestioncreditsbancaires.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.enset.gestioncreditsbancaires.entities.Remboursement;

public interface RemboursementRepository extends JpaRepository<Remboursement, Long> {
}

