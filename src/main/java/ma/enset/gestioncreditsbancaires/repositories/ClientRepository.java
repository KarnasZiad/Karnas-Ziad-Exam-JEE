package ma.enset.gestioncreditsbancaires.repositories;

import ma.enset.gestioncreditsbancaires.dtos.ClientResponseDTO;
import ma.enset.gestioncreditsbancaires.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("SELECT new ma.enset.gestioncreditsbancaires.dtos.ClientResponseDTO(c.id, c.nom, c.email) FROM Client c WHERE c.id = :id")
    ClientResponseDTO findClientDTOById(@Param("id") Long id);
}