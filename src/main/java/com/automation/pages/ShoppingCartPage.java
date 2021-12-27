package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//i[@class='icon-trash']")
    WebElement deleteButton;

    @CacheLookup
    @FindBy(css = "p.alert.alert-warning")
    WebElement emptyCartMessage;

    public void clickDeleteButton() {
        clickOnElement(deleteButton);
        log.info("Clicking Delete button " + deleteButton.toString());
    }

    public void verifyEmptyCartMessage(String text) throws InterruptedException {
        Thread.sleep(2000);
        String actualString = getTextFromElement(emptyCartMessage);
        System.out.println("text of message: " + actualString);
        Assert.assertTrue(actualString.trim().contains((text.trim())));
        log.info("Verify shopping cart is empty Text  " + text + emptyCartMessage.toString());
    }

}
