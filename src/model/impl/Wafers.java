package model.impl;

import model.Item;

public class Wafers implements Item {
    private float price;
    private int quantity;

    public Wafers(float price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public float getTotalPrice() {
        return price*quantity;
    }
}
