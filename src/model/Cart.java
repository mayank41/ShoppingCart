package model;

import java.util.List;

public class Cart {
    private List<Item> items;
    private float totalValue = 0;

    public Cart(List<Item> items) {
        this.items = items;
    }

    public void addItemToCart(Item item) {
        items.add(item);
    }

    public float getTotalPriceOfCart() {
        items.forEach(item -> totalValue +=item.getTotalPrice());
        return totalValue;
    }
}
