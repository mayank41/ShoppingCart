package application;

import model.Cart;
import model.Item;
import model.impl.Biscuit;

import java.util.ArrayList;

public class ShoppingCartApp {

    public static void main(String[] args) {
        Cart cart = new Cart(new ArrayList<>());
        Item biscuits = new Biscuit(10, 3);
        cart.addItemToCart(biscuits);

        System.out.println("You have to pay: " + cart.getTotalPriceOfCart());
    }
}
