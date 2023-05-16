package mk.ukim.finki.lab_gameshop.service.impl;

import mk.ukim.finki.lab_gameshop.model.User;
import mk.ukim.finki.lab_gameshop.repository.UserRepository;
import mk.ukim.finki.lab_gameshop.service.AuthService;

public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String username, String password) {
        if (username==null || username.isEmpty() || password==null || password.isEmpty()) {
            throw new RuntimeException();
        }
        return userRepository.findByUsernameAndPassword(username,
                password).orElseThrow(RuntimeException::new);
    }
}
