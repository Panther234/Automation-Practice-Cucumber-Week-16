package com.automation.cucmber.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.MyAccountPage;
import com.automation.pages.SignInPage;
import com.automation.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccountTestSteps extends Utility {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I Click on Sign In link$")
    public void iClickOnSignInLink() {
        new HomePage().signInLink();
    }

    @And("^I Enter 'Email' in email address field$")
    public void iEnterEmailInEmailAddressField() {
        new SignInPage().enterEmail(getRandomEmail());
    }

    @And("^I click on 'Create an account' button$")
    public void iClickOnCreateAnAccountButton() {
        new SignInPage().clickCreateAccountButton();
    }

    @And("^I enter 'FirstName' in customer first name field$")
    public void iEnterFirstNameInCustomerFirstNameField() {
        new CreateAccountPage().enterFirstName("Bob");
    }

    @And("^I enter 'LastName' in customer last name field$")
    public void iEnterLastNameInCustomerLastNameField() {
        new CreateAccountPage().enterLastName("Alexa");
    }

    @And("^I enter 'Password' in password field$")
    public void iEnterPasswordInPasswordField() {
        new CreateAccountPage().enterPassword("Abc1234");
    }

    @And("^I enter 'FirstName' in first name field$")
    public void iEnterFirstNameInFirstNameField() {
        new CreateAccountPage().enterFirstNameField("Bob");
    }

    @And("^I enter 'LastName' in last name field$")
    public void iEnterLastNameInLastNameField() {
        new CreateAccountPage().enterLastNameField("Alexa");
    }

    @And("^I enter 'Address' in address field$")
    public void iEnterAddressInAddressField() {
        new CreateAccountPage().enterAddress("1, Bond Street");
    }

    @And("^I enter 'City' in city field$")
    public void iEnterCityInCityField() {
        new CreateAccountPage().enterCity("london");
    }

    @And("^I enter 'State' in state field$")
    public void iEnterStateInStateField() {
        new CreateAccountPage().selectState("Alaska");
    }

    @And("^I enter 'ZipCode' in zipcode field$")
    public void iEnterZipCodeInZipcodeField() {
        new CreateAccountPage().enterZipCode("11111");
    }

    @And("^I enter 'Phone Number' in phone number field$")
    public void iEnterPhoneNumberInPhoneNumberField() {
        new CreateAccountPage().enterPhoneNumber("0123456789");
    }

    @And("^I enter 'Reference' in reference field$")
    public void iEnterReferenceInReferenceField() {
        new CreateAccountPage().enterReference("Home");
    }

    @And("^I click on 'Register' button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterBtn();
    }

    @And("^I verify 'My Account' text displayed$")
    public void iVerifyMyAccountTextDisplayed() {
        new MyAccountPage().verifyMyAccountText("MY ACCOUNT");
    }

    @Then("^I can verify Account name on$")
    public void iCanVerifyAccountNameOn() {
        new MyAccountPage().verifyAccountName("Bob Alexa");
    }
}
