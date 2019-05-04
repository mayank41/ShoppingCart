package model.impl;

import model.Item;

public class Wafers implements Item {
    private float price = 5.0f;
    private int quantity;

    public Wafers() {}

    @Override
    public float getTotalPrice() {
        return price*quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
