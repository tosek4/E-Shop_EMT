package mk.ukim.finki.lab_gameshop.service;

import mk.ukim.finki.lab_gameshop.model.Games;
import mk.ukim.finki.lab_gameshop.model.enumm.GamesCategory;

import java.util.List;
import java.util.Optional;

public interface GamesService {

    List<Games> findAll();

    Optional<Games> findById(Long id);

    Optional<Games> findByName(String name);


    Optional<Games> save(String name, Integer quantity, Double price, GamesCategory category);

    Optional<Games> edit(Long id, String name, Integer quantity, Double price, GamesCategory category);

    void deleteById(Long id);

    interface AuthService {
    }
}
