package ma.enset.gestioncreditsbancaires.services;


import ma.enset.gestioncreditsbancaires.entities.Client;
import ma.enset.gestioncreditsbancaires.entities.Credit;
import ma.enset.gestioncreditsbancaires.entities.Remboursement;
import ma.enset.gestioncreditsbancaires.repositories.ClientRepository;
import ma.enset.gestioncreditsbancaires.repositories.CreditRepository;
import ma.enset.gestioncreditsbancaires.repositories.RemboursementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditServiceImpl implements CreditService {

    private final ClientRepository clientRepository;
    private final CreditRepository creditRepository;
    private final RemboursementRepository remboursementRepository;

    public CreditServiceImpl(ClientRepository clientRepository, CreditRepository creditRepository, RemboursementRepository remboursementRepository) {
        this.clientRepository = clientRepository;
        this.creditRepository = creditRepository;
        this.remboursementRepository = remboursementRepository;
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Credit addCredit(Credit credit, Long clientId) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new RuntimeException("Client introuvable"));
        credit.setClient(client);
        return creditRepository.save(credit);
    }

    @Override
    public Remboursement addRemboursement(Remboursement remboursement, Long creditId) {
        Credit credit = creditRepository.findById(creditId)
                .orElseThrow(() -> new RuntimeException("Crédit introuvable"));
        remboursement.setCredit(credit);
        return remboursementRepository.save(remboursement);
    }
}
