package model.impl;

import model.Item;

public class ParleGBiscuit implements Item {
    private float price = 5.0f;
    private int quantity;

    public ParleGBiscuit() {}

    @Override
    public float getTotalPrice() {
        return price*quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
