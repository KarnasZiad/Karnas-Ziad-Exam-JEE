package ma.enset.gestioncreditsbancaires.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import ma.enset.gestioncreditsbancaires.entities.Client;
import ma.enset.gestioncreditsbancaires.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ClientService {

    private final ClientRepository clientRepository;

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public Client findByUsername(String username) {
        return clientRepository.findByUsername(username)
            .orElseThrow(() -> new RuntimeException("Client introuvable"));
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

}