package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WomenCategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenCategoryPage.class.getName());
    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Blouse']")   //a[normalize-space()='Blouse']
    WebElement blouse;

    @CacheLookup
    @FindBy(xpath = "(//a[@title='Printed Dress'][normalize-space()='Printed Dress'])[1]")
    WebElement printedDress;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Printed Chiffon Dress']")
    WebElement priChiDress;

    @CacheLookup
    @FindBy(xpath = "(//a[@title='Printed Summer Dress'][normalize-space()='Printed Summer Dress'])[2]")
    WebElement summerDress;

    @CacheLookup
    @FindBy(linkText = "Faded Short Sleeve T-shirts")
    WebElement fadedShortSleeveTShirt;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cat-name']")
    WebElement summerDressText;

    @CacheLookup
    @FindBy(css = "div#layered_price_slider>a:nth-of-type(2)")
    WebElement slider;

    @CacheLookup
    @FindBy(id = "layered_price_slider")
    WebElement fullSlider;


    public void sellProduct(String proName) {
        if (proName.equalsIgnoreCase("Blouse")) {
            clickOnElement(blouse);
            log.info("Select Product : " + proName + blouse.toString());
        } else if (proName.equalsIgnoreCase("Printed Dress")) {
            mouseHoverToElementAndClick(printedDress);
            log.info("Select Product : " + proName+ printedDress.toString());
        } else if (proName.equalsIgnoreCase("Printed Chiffon Dress")) {
            clickOnElement(priChiDress);
            log.info("Select Product : " + proName+ priChiDress.toString());
        } else if (proName.equalsIgnoreCase("Printed Summer Dress with Price $28.98")) {
            clickOnElement(summerDress);
            log.info("Select Product : " + proName+ summerDress.toString());
        } else if (proName.equalsIgnoreCase("Faded Short Sleeve T-shirts")) {
            clickOnElement(fadedShortSleeveTShirt);
        }
    }
    public void setPriceRange() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, ((Double) (-0.75 * fullSlider.getSize().width)).intValue() + 1, 0).build().perform();
        log.info("Drag Slider : " );
    }
    public void verifySummerDressText(String text) {
        String actualString = getTextFromElement(summerDressText);
//        System.out.println("text of message: " + actualString);
        Assert.assertTrue(actualString.trim().equalsIgnoreCase(text.trim()));
        log.info("Verify Summer Dress Text : " + text+ summerDressText.toString());
    }
}
