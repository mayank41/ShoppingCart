package services;

import models.Cart;
import models.Item;

import java.util.List;

public class CartService {

    Cart cart;

    public CartService(Cart cart) {
        this.cart = cart;
    }

    public void printReceiptOfCart() {
        for(Item item : cart.getItems()) {
            System.out.println("Item Total Price including tax: " + item.getTotalPrice() + ". Total item tax: " + item.getTotalTax());
        }
    }

    public void addItemToCart(Item item) {
        if(isItemPresentInCart(cart, item)) {
            for(Item cartItem : cart.getItems()) {
                if(cartItem == item) {
                    cartItem.setQuantity(cartItem.getQuantity() + 1);
                }
            }
        } else {
            cart.getItems().add(item);
        }
    }

    public void reduceItemQuantityFromCart(Item item) {
        if (!isItemPresentInCart(cart, item)) {
            return;
        }
        for(Item cartItem : cart.getItems()) {
            if(cartItem == item) {
                if (cartItem.getQuantity() > item.getQuantity()) {
                    cartItem.setQuantity(cartItem.getQuantity() - 1);
                } else {
                    cart.getItems().remove(item);
                }
            }
        }
    }

    public boolean isItemPresentInCart(Cart cart, Item item) {
        return cart.getItems().contains(item);
    }
}
