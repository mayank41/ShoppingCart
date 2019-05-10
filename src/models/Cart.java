package models;

import services.CartService;

import java.util.List;

public class Cart {
    private List<Item> items;
    private float totalValue = 0;

    public Cart(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public float getTotalValue() {
        return totalValue;
    }

    public float getTotalPriceOfCart() {
        items.forEach(item -> totalValue +=item.getTotalPrice());
        return totalValue;
    }

    public void update(Cart cart, CartService cartService, Item item, int quantity) {
        if(!cartService.isItemPresentInCart(cart, item)) {
            cart.getItems().add(item);
        } else  {

        }
    }

}
