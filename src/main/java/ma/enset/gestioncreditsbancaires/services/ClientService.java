package ma.enset.gestioncreditsbancaires.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import ma.enset.gestioncreditsbancaires.entities.Client;
import ma.enset.gestioncreditsbancaires.repositories.ClientRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ClientService {

    private final ClientRepository clientRepository;
    private final PasswordEncoder passwordEncoder;

    public Client saveClient(Client client) {
        client.setPassword(passwordEncoder.encode(client.getPassword())); // Encode le mot de passe
        return clientRepository.save(client);
    }

    public Client findByUsername(String username) {
        return clientRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Client introuvable"));
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }


    public UserDetails getClients(String s) {
        return null;
    }
}