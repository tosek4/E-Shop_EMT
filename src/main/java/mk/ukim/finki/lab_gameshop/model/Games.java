package mk.ukim.finki.lab_gameshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import mk.ukim.finki.lab_gameshop.model.enumm.GamesCategory;

@Data
@Entity
public class Games {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private Integer quantity;
    private Double price;

    private GamesCategory category;

    public Games() {

    }

    public Games(String name, Integer quantity, Double price, GamesCategory category) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }
}
