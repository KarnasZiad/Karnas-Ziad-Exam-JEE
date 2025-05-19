package ma.enset.gestioncreditsbancaires;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ma.enset.gestioncreditsbancaires")
public class GestionCreditsBancairesApplication {
    public static void main(String[] args) {
        SpringApplication.run(GestionCreditsBancairesApplication.class, args);
    }
}