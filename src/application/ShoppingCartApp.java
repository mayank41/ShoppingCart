package application;

import model.Cart;
import model.Item;
import model.impl.Biscuit;
import model.impl.Wafers;

import java.util.ArrayList;

public class ShoppingCartApp {

    public static void main(String[] args) {
        Cart cart = new Cart(new ArrayList<>());
        Item biscuits = new Biscuit(10, 3);
        Item wafers = new Wafers(5, 4);
        cart.addItemToCart(biscuits);
        cart.addItemToCart(wafers);

        System.out.println("You have to pay: " + cart.getTotalPriceOfCart());
    }
}
