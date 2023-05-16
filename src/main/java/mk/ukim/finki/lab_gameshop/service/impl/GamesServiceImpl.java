package mk.ukim.finki.lab_gameshop.service.impl;

import mk.ukim.finki.lab_gameshop.model.Games;
import mk.ukim.finki.lab_gameshop.model.enumm.GamesCategory;
import mk.ukim.finki.lab_gameshop.repository.GamesRepository;
import mk.ukim.finki.lab_gameshop.repository.ShoppingCardRepository;
import mk.ukim.finki.lab_gameshop.repository.UserRepository;
import mk.ukim.finki.lab_gameshop.service.GamesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamesServiceImpl implements GamesService {

    private final GamesRepository gamesRepository;
    private final UserRepository userRepository;
    private final ShoppingCardRepository shoppingCardRepository;

    public GamesServiceImpl(GamesRepository gamesRepository, UserRepository userRepository, ShoppingCardRepository shoppingCardRepository) {
        this.gamesRepository = gamesRepository;
        this.userRepository = userRepository;
        this.shoppingCardRepository = shoppingCardRepository;
    }

    @Override
    public List<Games> findAll() {
        return this.gamesRepository.findAll();
    }

    @Override
    public Optional<Games> findById(Long id) {
        return this.gamesRepository.findById(id);
    }

    @Override
    public Optional<Games> findByName(String name) {
        return this.gamesRepository.findByName(name);
    }

    @Override
    public Optional<Games> save(String name, Integer quantity, Double price, GamesCategory category) {
        this.gamesRepository.deleteByName(name);
        Games games = new Games(name,quantity,price,category);
        this.gamesRepository.save(games);
        return  Optional.of(games);
    }

    @Override
    public Optional<Games> edit(Long id, String name, Integer quantity, Double price, GamesCategory category) {
        Games game = this.gamesRepository.findById(id).orElseThrow(()-> new RuntimeException());
        game.setName(name);
        game.setPrice(price);
        game.setQuantity(quantity);
        game.setCategory(category);
        this.gamesRepository.save(game);
        return Optional.of(game);
    }


    @Override
    public void deleteById(Long id) {
        this.gamesRepository.deleteById(id);
    }
}
