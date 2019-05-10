package models.impl;

import models.Item;

public class BourbonBiscuit implements Item {
    private float price;
    private int quantity = 1;
    private float taxPercent;

    public BourbonBiscuit(float price, float taxPercent) {
        this.price = price;
        this.taxPercent= taxPercent;
    }

    @Override
    public float getTotalPrice() {
        return price*quantity + getTotalTax();
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public float getTotalTax() {
        float totalTax = (price*quantity*taxPercent)/100;
        return totalTax;
    }
}
