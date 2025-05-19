package ma.enset.gestioncreditsbancaires.controllers;

import ma.enset.gestioncreditsbancaires.entities.Remboursement;
import ma.enset.gestioncreditsbancaires.services.CreditService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/remboursements")
public class RemboursementController {

    private final CreditService creditService;

    public RemboursementController(CreditService creditService) {
        this.creditService = creditService;
    }

    @PostMapping("/{creditId}")
    public Remboursement addRemboursement(@RequestBody Remboursement remboursement, @PathVariable Long creditId) {
        return creditService.addRemboursement(remboursement, creditId);
    }
}
