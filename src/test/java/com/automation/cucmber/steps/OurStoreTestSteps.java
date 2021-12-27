package com.automation.cucmber.steps;

import com.automation.pages.HomePage;
import com.automation.pages.StoresPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OurStoreTestSteps {
    @When("^I click on Our Stores link$")
    public void iClickOnOurStoresLink() {
        new HomePage().clickOnOurStores();
    }

    @And("^I can click on Map$")
    public void iCanClickOnMap() {
        new StoresPage().clickOKOnMap();
    }

    @Then("^I can see stores from West Palm Beach$")
    public void iCanSeeStoresFromWestPalmBeach() {
        new StoresPage().location();
    }
}
