package mk.ukim.finki.lab_gameshop.service;

import mk.ukim.finki.lab_gameshop.model.User;
import mk.ukim.finki.lab_gameshop.model.enumm.Role;

public interface UserService {
    User register(String username, String password, String repeatPassword, String name, String surname, Role role);
}
