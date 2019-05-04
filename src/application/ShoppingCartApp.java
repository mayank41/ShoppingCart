package application;

import model.BiscuitFactory;
import model.Cart;
import model.Item;
import model.impl.BourbonBiscuit;
import model.impl.Wafers;

import java.util.ArrayList;

public class ShoppingCartApp {

    public static void main(String[] args) throws Exception {
        Cart cart = new Cart(new ArrayList<>());
        Item bourbonBiscuits = BiscuitFactory.getSpecificBiscuitObject("BOURBON");
        bourbonBiscuits.setQuantity(3);
        Item parlegBiscuits = BiscuitFactory.getSpecificBiscuitObject("PARLEG");
        parlegBiscuits.setQuantity(5);
        Item wafers = new Wafers();
        wafers.setQuantity(4);

        cart.addItemToCart(bourbonBiscuits);
        cart.addItemToCart(parlegBiscuits);
        cart.addItemToCart(wafers);

        System.out.println("You have to pay: " + cart.getTotalPriceOfCart());
    }
}
