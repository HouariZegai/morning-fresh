package com.houarizegai.morningfresh.loyalty_cards;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/loyalty_cards",
        glue = "com.houarizegai.morningfresh")
public class SuperSmoothiesProgramTestSuite {
}
