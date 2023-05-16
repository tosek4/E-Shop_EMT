package mk.ukim.finki.lab_gameshop.service.impl;

import mk.ukim.finki.lab_gameshop.model.Games;
import mk.ukim.finki.lab_gameshop.model.ShoppingCart;
import mk.ukim.finki.lab_gameshop.service.ShoppingCardService;
import mk.ukim.finki.lab_gameshop.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingCardService {
    private final ShoppingCardService shoppingCardService;
    private final UserService userService;

    public ShoppingServiceImpl(ShoppingCardService shoppingCardService, UserService userService) {
        this.shoppingCardService = shoppingCardService;
        this.userService = userService;
    }

    @Override
    public List<Games> listAllProductsInShoppingCart(Long cartId) {
        return this.shoppingCardService.listAllProductsInShoppingCart(cartId);
    }


    @Override
    public ShoppingCart addProductToShoppingCart(String username, Long productId) {
        return null;
    }
}
