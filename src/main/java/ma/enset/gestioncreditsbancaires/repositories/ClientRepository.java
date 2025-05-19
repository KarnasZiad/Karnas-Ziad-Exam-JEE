package ma.enset.gestioncreditsbancaires.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import ma.enset.gestioncreditsbancaires.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
