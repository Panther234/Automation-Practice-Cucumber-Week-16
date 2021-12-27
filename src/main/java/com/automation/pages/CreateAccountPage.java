package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "customer_firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "customer_lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "passwd")
    WebElement password;

    @CacheLookup
    @FindBy(id = "firstname")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "lastname")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "address1")
    WebElement address;

    @CacheLookup
    @FindBy(id = "city")
    WebElement city;

    @CacheLookup
    @FindBy(id = "id_state")
    WebElement state;

    @CacheLookup
    @FindBy(id = "postcode")
    WebElement zipcode;

    @CacheLookup
    @FindBy(id = "phone_mobile")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(id = "alias")
    WebElement reference;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Register']")
    WebElement registerbtn;

    public void clickOnRegisterBtn(){
        clickOnElement(registerbtn);
        log.info("Click register : "  + registerbtn.toString());
    }

    public void enterAddress(String text){
        sendTextToElement(address,text);
        log.info("Enter Address  : " + text + address.toString());
    }

    public void enterCity(String text){
        sendTextToElement(city,text);
        log.info("Enter City : " + text + city.toString());
    }

    public void enterZipCode(String text){
        sendTextToElement(zipcode,text);
        log.info("Enter Zipcode : " + text + zipcode.toString());
    }

    public void enterPhoneNumber(String text){
        sendTextToElement(phoneNumber,text);
        log.info("Enter PhoneNumber : " + text + phoneNumber.toString());
    }

    public void enterReference(String text){
        sendTextToElement(reference,text);
        log.info("Select Reference : " + text + reference.toString());
    }

    public void selectState(String text){
        sendTextToElement(state,text);
        log.info("Select state : " + text + state.toString());
    }

    public void enterFirstName(String text){
        sendTextToElement(firstName,text);
        log.info("Enter Firstname : " + text + firstName.toString());
    }
    public void enterLastName(String text){
        sendTextToElement(lastName,text);
        log.info("Enter Lastname : " + text + lastName.toString());
    }
    public void enterFirstNameField(String text){
        sendTextToElement(firstNameField,text);
        log.info("Send text to Firstname : " + text + firstNameField.toString());
    }
    public void enterLastNameField(String text){
        sendTextToElement(lastNameField,text);
        log.info("Send text to Lastname : " + text + lastNameField.toString());
    }
    public void enterPassword(String text){
        sendTextToElement(password,text);
        log.info("Send text to Password : " + text + password.toString());
    }
}
