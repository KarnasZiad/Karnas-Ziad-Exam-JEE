package ma.enset.gestioncreditsbancaires.mappers;

import ma.enset.gestioncreditsbancaires.dtos.ClientRequestDTO;
import ma.enset.gestioncreditsbancaires.dtos.ClientResponseDTO;
import ma.enset.gestioncreditsbancaires.entities.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    public ClientResponseDTO toDTO(Client client) {
        ClientResponseDTO dto = new ClientResponseDTO();
        dto.setId(client.getId());
        dto.setNom(client.getNom());
        dto.setEmail(client.getEmail());
        return dto;
    }

    public Client fromDTO(ClientRequestDTO dto) {
        Client client = new Client();
        client.setNom(dto.getNom());
        client.setEmail(dto.getEmail());
        return client;
    }
}