package services;

import models.Cart;
import models.Item;

import java.util.Iterator;
import java.util.Map;

public class CartService {

    private Cart cart;

    public CartService(Cart cart) {
        this.cart = cart;
    }

    public void printReceiptOfCart() {
        for(Map.Entry<Item, Integer> itemToQuantityPair : cart.getItemsWithQuantity().entrySet()) {
            System.out.println("Item Total Price including tax: " +
                    (itemToQuantityPair.getKey().getPriceIncludingTax()*itemToQuantityPair.getValue()) +
                    ". Total item tax: " + itemToQuantityPair.getKey().getTotalTax());
        }

        System.out.println("Total Price: "  + cart.getTotalPriceOfCart());
    }

    public void addItemToCart(Item item) {
        if(isItemPresentInCart(cart, item)) {
            for(Map.Entry<Item, Integer> cartItem : cart.getItemsWithQuantity().entrySet()) {
                if(cartItem == item) {
                    cartItem.setValue(cartItem.getValue() + 1);
                }
            }
        } else {
            cart.getItemsWithQuantity().put(item, 1);
        }
    }

    public void reduceItemQuantityFromCart(Item item) {
        if (!isItemPresentInCart(cart, item)) {
            return;
        }
        Iterator<Map.Entry<Item, Integer>> itemToQuantityPairIterator = cart.getItemsWithQuantity().entrySet().iterator();
        while (itemToQuantityPairIterator.hasNext()) {
            Map.Entry<Item, Integer> itemToQuantityPair = itemToQuantityPairIterator.next();
            if(itemToQuantityPair.getKey() == item) {
                if(itemToQuantityPair.getValue() > 1) {
                    itemToQuantityPair.setValue(itemToQuantityPair.getValue() - 1);
                } else {
                    itemToQuantityPairIterator.remove();
                }
            }
        }
    }

    private boolean isItemPresentInCart(Cart cart, Item item) {
        return cart.getItemsWithQuantity().keySet().contains(item);
    }
}
