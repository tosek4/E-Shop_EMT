package mk.ukim.finki.lab_gameshop.repository;

import mk.ukim.finki.lab_gameshop.model.Games;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GamesRepository extends JpaRepository<Games, Long> {
    Optional<Games> findByName(String name);
    void deleteByName(String name);
}
