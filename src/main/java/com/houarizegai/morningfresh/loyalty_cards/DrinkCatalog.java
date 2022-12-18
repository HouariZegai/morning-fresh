package com.houarizegai.morningfresh.loyalty_cards;

import java.util.HashMap;
import java.util.Map;

public class DrinkCatalog {

    Map<String, String> drinkCatalogs = new HashMap<>();

    public void addDrink(String drink, String category) {
        drinkCatalogs.put(drink, category);
    }

    public String getCategoryByDrink(String drink) {
        return drinkCatalogs.get(drink);
    }
}
