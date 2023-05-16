package mk.ukim.finki.lab_gameshop.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<Games> games;

    public ShoppingCart() {
    }

    public ShoppingCart(User user) {
        this.user = user;
        this.games = new ArrayList<>();
    }
}
