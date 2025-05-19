package ma.enset.gestioncreditsbancaires.controllers;

import ma.enset.gestioncreditsbancaires.entities.Credit;
import ma.enset.gestioncreditsbancaires.services.CreditService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/credits")
public class CreditController {

    private final CreditService creditService;

    public CreditController(CreditService creditService) {
        this.creditService = creditService;
    }

    @PostMapping("/{clientId}")
    public Credit addCredit(@RequestBody Credit credit, @PathVariable Long clientId) {
        return creditService.addCredit(credit, clientId);
    }
}
