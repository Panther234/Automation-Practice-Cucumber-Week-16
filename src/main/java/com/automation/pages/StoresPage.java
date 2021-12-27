package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoresPage extends Utility {

    private static final Logger log = LogManager.getLogger(StoresPage.class.getName());
    public StoresPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    WebElement popupHandle;


    @CacheLookup
    @FindBy(xpath = "//button[@title='Zoom out']")
    WebElement zoomOutButton;

    public void clickOKOnMap() {
        clickOnElement(popupHandle);
        log.info("Clicking on Map popup  : " + popupHandle.toString());
    }

    public void location() {
        zoomOutButton.click();
        zoomOutButton.click();
        takeScreenShot("screenshot");
        log.info("Clicking on Map popup : ");
    }
}
