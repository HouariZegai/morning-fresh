package com.houarizegai.morningfresh.loyalty_cards;

public class MorningFreshnessMember {

    private String name;
    private int points;
    private SuperSmoothieSchema schema;

    public MorningFreshnessMember(String name, SuperSmoothieSchema schema) {
        this.name = name;
        this.schema = schema;
    }

    public void order(Integer amount, String drinkName) {
        points += schema.getPointsPerCategory(drinkName) * amount;
    }

    public int getPoints() {
        return points;
    }
}
