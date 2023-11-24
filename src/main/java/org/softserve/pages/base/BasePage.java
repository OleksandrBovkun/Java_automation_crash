package org.softserve.pages.base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


import static org.softserve.constants.Constants.TestsSettings.EXPLICITLY_WAIT;

/**
 * Contains basic methods for pages. Extend your '*Page' class with BasePage.
 */
public abstract class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void open(String url){
        driver.get(url);
    }


    protected void fillField(WebElement element, String inputText){
        element.clear();
        element.sendKeys(inputText);
    }

    protected String getText(WebElement element){
        return element.getText();
    }


    //todo: create driver wrapper and move waits there
    public WebElement waitElementIsVisible(WebElement element){
        return new WebDriverWait(driver, Duration.ofSeconds(EXPLICITLY_WAIT)).until(ExpectedConditions.visibilityOf(element));
    }
    public WebElement waitElementIsClickable(WebElement element){
        return new WebDriverWait(driver, Duration.ofSeconds(EXPLICITLY_WAIT)).until(ExpectedConditions.elementToBeClickable(element));
    }

}
