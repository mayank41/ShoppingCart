package model.impl;

import model.Item;

public class Biscuit implements Item {
    private float price;
    private int quantity;

    public Biscuit(float price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public float getTotalPrice() {
        return price*quantity;
    }
}
