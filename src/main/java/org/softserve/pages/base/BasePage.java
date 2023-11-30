package org.softserve.pages.base;

import org.openqa.selenium.JavascriptExecutor;
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
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITLY_WAIT));

        PageFactory.initElements(driver, this);
    }
    public void open(String url){
        driver.get(url);
    }

    public void fullSizeScreen(){
        driver.manage().window().maximize();
    }

    protected void fillField(WebElement element, String inputText){
        element.clear();
        element.sendKeys(inputText);
    }

    protected String getText(WebElement element){
        return element.getText();
    }

    protected WebElement waitElementIsVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement waitElementIsClickable(WebElement element){
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    protected WebElement scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
        return element;
    }
}
