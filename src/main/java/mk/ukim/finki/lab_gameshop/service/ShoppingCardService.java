package mk.ukim.finki.lab_gameshop.service;

import mk.ukim.finki.lab_gameshop.model.Games;
import mk.ukim.finki.lab_gameshop.model.ShoppingCart;

import java.util.List;

public interface ShoppingCardService {
    List<Games> listAllProductsInShoppingCart(Long cartId);


    ShoppingCart addProductToShoppingCart(String username, Long productId);
}
