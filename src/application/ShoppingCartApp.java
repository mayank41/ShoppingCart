package application;

import models.BiscuitFactory;
import models.BiscuitTypes;
import models.Cart;
import models.Item;;
import models.impl.BourbonBiscuit;
import models.impl.Wafers;
import services.CartService;

import java.util.ArrayList;

public class ShoppingCartApp {

    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
        Cart cart = new Cart(new ArrayList());
        Item bourbonBiscuit = BiscuitFactory.getSpecificBiscuitObject("BOURBON", 20, 20);
        CartService cartService =  new CartService(cart);
        cartService.addItemToCart(bourbonBiscuit);
        cartService.addItemToCart(bourbonBiscuit);
        Wafers wafers = new Wafers(10, 20);
        cartService.addItemToCart(wafers);

        cartService.reduceItemQuantityFromCart(bourbonBiscuit);
        cartService.reduceItemQuantityFromCart(bourbonBiscuit);
        cartService.reduceItemQuantityFromCart(wafers);

        cartService.printReceiptOfCart();
    }


}
