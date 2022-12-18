package com.houarizegai.morningfresh.loyalty_cards;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class SuperSmoothiesStepDefinitions {

    private DrinkCatalog drinkCatalog = new DrinkCatalog();
    private SuperSmoothieSchema superSmoothieSchema = new SuperSmoothieSchema(drinkCatalog);
    private MorningFreshnessMember houari;

    @Given("the following categories:")
    public void the_following_categories(List<Map<String, String>> drinkCategories) {
        drinkCategories.stream().forEach(drinkCategory -> {
            String drink = drinkCategory.get("Drink");
            String category = drinkCategory.get("Category");
            Integer points = Integer.parseInt(drinkCategory.get("Points"));

            drinkCatalog.addDrink(drink, category);
            superSmoothieSchema.setPointsPerCategory(category, points);
        });
    }

    @Given("^(.*) is a morning freshness member$")
    public void houari_is_a_morning_freshness_member(String name) {
        houari = new MorningFreshnessMember(name, superSmoothieSchema);
    }

    @When("^(.*) purchases (\\d+) (.*) drinks?$")
    public void houari_purchases_banana_drinks(String name, Integer amount, String drinkName) {
        houari.order(amount, drinkName);
    }

    @Then("he should earn {int} points")
    public void he_should_earn_points(Integer expectedPoints) {
        assertThat(houari.getPoints()).isEqualTo(expectedPoints);
    }
}
