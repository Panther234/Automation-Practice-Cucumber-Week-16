package com.automation.pages;


import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    WebElement addToCartBtn;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart']")
    WebElement popUpDisplay;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
    WebElement proceedToCheckout;

    public void verifyPopUpDisplayMsg(String text) {
        verifyThatTextIsDisplayed(popUpDisplay, text);
        log.info("Verify PopUp Msg " + text + popUpDisplay.toString());
    }

    public void clickOnAddToCartBtn() {
        clickOnElement(addToCartBtn);
        log.info("Click Add to cart " + addToCartBtn.toString());
    }

    public void clickProceedToCheckOut() {
        clickOnElement(proceedToCheckout);
        log.info("Clicking to Proceed to checkout button" + proceedToCheckout.toString());
    }


}
