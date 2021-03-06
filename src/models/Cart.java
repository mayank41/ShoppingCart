package models;

import java.util.Map;

public class Cart {
    private Map<Item, Integer> itemToQuantityMap;

    public Cart(Map<Item, Integer> itemToQuantityMap) {
        this.itemToQuantityMap = itemToQuantityMap;
    }

    public  Map<Item, Integer> getItemsWithQuantity() {
        return itemToQuantityMap;
    }

    public float getTotalPriceOfCart() {
        float totalValue = 0;
        for(Map.Entry<Item, Integer> itemToQuantityPair : itemToQuantityMap.entrySet()) {
            totalValue += (itemToQuantityPair.getKey().getPriceIncludingTax())*itemToQuantityPair.getValue();
        }
        return totalValue;
    }

}
