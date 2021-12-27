package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());
    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@title='View my customer account']//span[1]")
    WebElement accountName;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myAccountText;


    public void verifyAccountName(String account){
        String actualString = getTextFromElement(accountName);
        System.out.println("text of message: " + actualString);
        Assert.assertTrue(actualString.contains((account)));
        log.info("Verify Summer Dress Text  : " + account + myAccountText.toString());
    }
    public void verifyMyAccountText(String text){
        String actualString = getTextFromElement(myAccountText);
        System.out.println("text of message: " + actualString);
        Assert.assertTrue(actualString.contains((text)));
        log.info("Verify 'My Account' text is displayed : " + text + myAccountText.toString());
    }

}
