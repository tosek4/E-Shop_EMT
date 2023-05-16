package mk.ukim.finki.lab_gameshop.repository;

import mk.ukim.finki.lab_gameshop.model.User;
import mk.ukim.finki.lab_gameshop.model.enumm.Role;
import mk.ukim.finki.lab_gameshop.model.projectons.UserProjection;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> findAll();
    Optional<User> findByUsernameAndPassword(String username, String password);
    boolean findByUsername(String username);
    UserProjection findByRole(Role role);
}
