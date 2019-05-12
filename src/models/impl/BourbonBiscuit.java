package models.impl;

import models.Item;

public class BourbonBiscuit implements Item {
    private float price;
    private float taxPercent;

    public BourbonBiscuit(float price, float taxPercent) {
        this.price = price;
        this.taxPercent= taxPercent;
    }

    @Override
    public float getPriceIncludingTax() {
        return getPrice() + getTotalTax();
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
