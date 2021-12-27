package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement clickSignInLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Our stores')]")
    WebElement ourStore;

    @CacheLookup
    @FindBy(xpath = "//li[@class='sfHover']//a[@title='Summer Dresses'][normalize-space()='Summer Dresses']")
    WebElement summerDress;

    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenMenu;

    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@id='block_top_menu']//li"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }

    public void signInLink() {
        clickOnElement(clickSignInLink);
        log.info("Clicking on SignIn Link : " + clickSignInLink.toString());
    }

    public void clickOnOurStores() {
        clickOnElement(ourStore);
        log.info("Clicking on Our Stores Link : " + ourStore.toString());
    }

    public void selectWomenMenu(){
        mouseHoverToElement(womenMenu);
        log.info("Mousehover on Women menu  : " + womenMenu.toString());
    }
    public void selectSummerDress() {
        clickOnElement(summerDress);
        log.info("Clicking on Summer Dress  : " + summerDress.toString());
    }
}
