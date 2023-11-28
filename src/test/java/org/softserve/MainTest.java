package org.softserve;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.softserve.constants.XPath;

import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;



class MainTest implements XPath.WomanPage {
    protected WebDriver driver;
    static WebDriverWait wait;

    @BeforeEach
    public void beforeEach(){
        driver = SetupDriver.createDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void LogInTest(){
        driver.get("https://magento.softwaretestingboard.com/");

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Sign In")));
        assertEquals("Sign In", driver.findElement(By.linkText("Sign In")).getText());

        WebElement itemMenuWomen = driver.findElement(By.xpath(WOMAN_ITEM));
        itemMenuWomen.click();

        WebElement itemTops = driver.findElement(By.xpath(TOPS_ITEM));
        itemTops.click();


        WebElement signInButton = driver.findElement(By.xpath(PAGE_TITLE));
        signInButton.click();


        WebElement signInButton = driver.findElement(By.xpath(FIRST_ELEMENT));
        signInButton.click();




//        WebElement signInButton = driver.findElement(By.xpath(SIGNIN_BUTTON));
//        signInButton.click();
//        WebElement emailField = driver.findElement(By.xpath(EMAIL_INPUT));
//        emailField.sendKeys("pmarinka16@gmail.com");
//        WebElement passwordField = driver.findElement(By.xpath(PASSWORSD_INPUT));
//        passwordField.sendKeys("Password1!");
//        WebElement loginButton = driver.findElement(By.xpath(LOGIN_BUTTON));
//        loginButton.click();
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        WebElement welcomeMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(WELCOME_MESSAGE)));

    }

    @AfterEach
    public void afterEach(){
        driver.close();
    }
}
