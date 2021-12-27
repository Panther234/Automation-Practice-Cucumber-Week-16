package com.automation.cucmber.steps;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.ShoppingCartPage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteItemsTestSteps {
    @When("^I select 'Women' from menu$")
    public void iSelectWomenFromMenu() {
        new HomePage().selectMenu("Women");
    }

    @And("^I select Product from it$")
    public void iSelectProductFromIt() {
        new WomenCategoryPage().sellProduct("Faded Short Sleeve T-shirts");
    }

    @And("^I click on Add to cart button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartBtn();
    }

    @And("^I click Proceed to checkout button$")
    public void iClickProceedToCheckoutButton() {
        new ProductPage().clickProceedToCheckOut();
    }

    @And("^I click Delete button$")
    public void iClickDeleteButton() {
        new ShoppingCartPage().clickDeleteButton();
    }

    @Then("^I verify empty cart message$")
    public void iVerifyEmptyCartMessage() throws InterruptedException {
        new ShoppingCartPage().verifyEmptyCartMessage("Your shopping cart is empty.");
    }
}
