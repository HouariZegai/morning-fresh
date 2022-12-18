package com.houarizegai.morningfresh.loyalty_cards;

import java.util.HashMap;
import java.util.Map;

public class SuperSmoothieSchema {

    private Map<String, Integer> pointsPerCategory = new HashMap<>();
    private DrinkCatalog drinkCatalog;

    public SuperSmoothieSchema(DrinkCatalog drinkCatalog) {
        this.drinkCatalog = drinkCatalog;
    }

    public void setPointsPerCategory(String category, Integer points) {
        pointsPerCategory.put(category, points);
    }

    public int getPointsPerCategory(String drinkName) {
        return pointsPerCategory.getOrDefault(categoryOf(drinkName), 0);
    }

    private String categoryOf(String drinkName) {
        return drinkCatalog.getCategoryByDrink(drinkName);
    }
}
