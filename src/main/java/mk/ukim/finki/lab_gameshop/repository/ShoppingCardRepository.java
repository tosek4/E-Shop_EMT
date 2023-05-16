package mk.ukim.finki.lab_gameshop.repository;

import mk.ukim.finki.lab_gameshop.model.ShoppingCart;
import mk.ukim.finki.lab_gameshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ShoppingCardRepository extends JpaRepository<ShoppingCart, Long> {
   Optional<ShoppingCart> findByUser(User user);
}
