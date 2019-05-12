package models.impl;

import models.Item;

public class Medicine implements Item {
    private float price;
    private int quantity = 1;
    private float taxPercent;

    public Medicine(float price, float taxPercent) {
        this.price = price;
        this.taxPercent = taxPercent;
    }

    @Override
    public float getPriceIncludingTax() {
        return price + getTotalTax();
    }

    @Override
    public float getTotalTax() {
        return (price*taxPercent)/100;
    }

    @Override
    public float getPrice() {
        return price;
    }
}
