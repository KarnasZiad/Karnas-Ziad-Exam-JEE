package ma.enset.gestioncreditsbancaires.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import ma.enset.gestioncreditsbancaires.entities.Credit;

public interface CreditRepository extends JpaRepository<Credit, Long> {
}
