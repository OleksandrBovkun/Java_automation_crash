package org.softserve;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    protected WebDriver driver;

    @BeforeEach
    public void beforeEach(){
        driver = SetupDriver.createDriver();
    }

    @Test
    public void testTest() {
        driver.get("https://magento.softwaretestingboard.com/");
    }
}