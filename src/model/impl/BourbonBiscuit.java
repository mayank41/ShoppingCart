package model.impl;

import model.Item;

public class BourbonBiscuit implements Item {
    private float price = 20.0f;
    private int quantity;

    public BourbonBiscuit() {}

    @Override
    public float getTotalPrice() {
        return price*quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
