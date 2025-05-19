package ma.enset.gestioncreditsbancaires.controllers;

import lombok.RequiredArgsConstructor;
import ma.enset.gestioncreditsbancaires.entities.Client;
import ma.enset.gestioncreditsbancaires.security.JwtUtils;
import ma.enset.gestioncreditsbancaires.security.JwtUtils;
import ma.enset.gestioncreditsbancaires.services.ClientService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager; // Autowired bean
    private final ClientService clientService;
    private final JwtUtils jwtUtil;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password)
        );

        Client client = clientService.findByUsername(username); // Recherche du client
        String token = jwtUtil.generateToken(client.getUsername());

        Map<String, String> response = new HashMap<>();
        response.put("access_token", token);
        return response;
    }
}