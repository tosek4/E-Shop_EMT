package mk.ukim.finki.lab_gameshop.service.impl;

import mk.ukim.finki.lab_gameshop.model.User;
import mk.ukim.finki.lab_gameshop.model.enumm.Role;
import mk.ukim.finki.lab_gameshop.repository.UserRepository;
import mk.ukim.finki.lab_gameshop.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Override
    public User register(String username, String password, String repeatPassword, String name, String surname, Role role) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty())
            throw new RuntimeException();
        if (this.userRepository.findByUsername(username))
            throw new RuntimeException();

        User user = new User(username,password,name,surname,role);
            return null;
    }
}
