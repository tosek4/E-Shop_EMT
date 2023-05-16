package mk.ukim.finki.lab_gameshop.model;

import jakarta.persistence.*;
import lombok.Data;
import mk.ukim.finki.lab_gameshop.model.enumm.Role;

import java.util.List;


@Data
@Entity
public class User {
    @Id
    private String username;

    private String password;
    private String name;
    private String surname;


    @Enumerated(value = EnumType.STRING)
    private Role role;

    @OneToMany
    private List<ShoppingCart> carts;

    public User() {

    }

    public User(String username,String password, String name, String surname, Role role) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.role = role;
    }
}
