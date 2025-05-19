package ma.enset.gestioncreditsbancaires.controllers;

import ma.enset.gestioncreditsbancaires.entities.Client;
import ma.enset.gestioncreditsbancaires.services.CreditService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final CreditService creditService;

    public ClientController(CreditService creditService) {
        this.creditService = creditService;
    }

    @GetMapping
    public List<Client> getAllClients() {
        return creditService.getAllClients();
    }

    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return creditService.addClient(client);
    }
}
