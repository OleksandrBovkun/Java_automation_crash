package org.softserve;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

class MainTest {
    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeAll
    static void setUpBeforeAll(){
        driver = SetupDriver.createDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // log in
//        driver.get("https://magento.softwaretestingboard.com/");
//        driver.findElement(By.xpath(XPath.LogIn.SignInLink)).click();
//        driver.findElement(By.xpath(XPath.LogIn.EmailInput)).sendKeys("");
//        driver.findElement(By.xpath(XPath.LogIn.PasswordInput)).sendKeys("");
//        driver.findElement(By.xpath(XPath.LogIn.SignInButton)).click();
    }

    @AfterAll
    static void tearDownAfterAll(){
        driver.close();
    }
}