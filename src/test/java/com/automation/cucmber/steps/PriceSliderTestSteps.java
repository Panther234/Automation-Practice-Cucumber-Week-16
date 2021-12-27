package com.automation.cucmber.steps;

import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.Then;

public class PriceSliderTestSteps {
    @Then("^I can set price$")
    public void iCanSetPrice() throws InterruptedException {
        new WomenCategoryPage().setPriceRange();
    }
}
