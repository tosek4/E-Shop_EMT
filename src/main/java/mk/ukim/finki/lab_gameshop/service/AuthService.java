package mk.ukim.finki.lab_gameshop.service;

import mk.ukim.finki.lab_gameshop.model.User;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    User login(String username, String password);
}
