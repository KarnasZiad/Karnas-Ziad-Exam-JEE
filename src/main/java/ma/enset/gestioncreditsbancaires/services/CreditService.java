package ma.enset.gestioncreditsbancaires.services;

import ma.enset.gestioncreditsbancaires.entities.Client;
import ma.enset.gestioncreditsbancaires.entities.Credit;
import ma.enset.gestioncreditsbancaires.entities.Remboursement;

import java.util.List;

public interface CreditService {
    List<Client> getAllClients();
    Client addClient(Client client);
    Credit addCredit(Credit credit, Long clientId);
    Remboursement addRemboursement(Remboursement remboursement, Long creditId);
}