package org.softserve;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.softserve.constants.XPath;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogInTest extends MainTest {

    @Test
    public void LogInTest() {
        driver.get("https://magento.softwaretestingboard.com/");

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Sign In")));
        assertEquals("Sign In", driver.findElement(By.linkText("Sign In")).getText());

        driver.findElement(By.xpath(XPath.LogIn.SignInLink)).click();
        driver.findElement(By.xpath(XPath.LogIn.EmailInput)).sendKeys("");
        driver.findElement(By.xpath(XPath.LogIn.PasswordInput)).sendKeys("");
        driver.findElement(By.xpath(XPath.LogIn.SignInButton)).click();

        wait.withTimeout(Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(XPath.Base.WelcomeButton)));
        var WelcomeButton = driver.findElement(By.xpath(XPath.Base.WelcomeButton));
        assertEquals("button", WelcomeButton.getTagName());
    }

}
