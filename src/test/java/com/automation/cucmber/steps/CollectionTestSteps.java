package com.automation.cucmber.steps;

import com.automation.pages.HomePage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CollectionTestSteps {
    @When("^I select 'Women' from menu by mouseHover$")
    public void iSelectWomenFromMenuByMouseHover() {
        new HomePage().selectWomenMenu();
    }

    @And("^I select summer dress from it$")
    public void iSelectSummerDressFromIt() {
        new HomePage().selectSummerDress();
    }

    @Then("^I verify Summer dress text display$")
    public void iVerifySummerDressTextDisplay() {
        new WomenCategoryPage().verifySummerDressText("SUMMER DRESSES ");
    }
}
