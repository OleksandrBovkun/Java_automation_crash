package org.softserve.unauthorized.base;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.softserve.SetupDriver;

import static org.softserve.constants.Constants.TestsSettings.CLEAR_COOKIES_AND_STORAGE;
import static org.softserve.constants.Constants.TestsSettings.QUIT_BROWSER;

/**
 * Extend your '*Test' class with BaseUnauthorized if for tests that don't require authorization.
 */

public abstract class BaseUnauthorized {
    protected static WebDriver driver = SetupDriver.createDriver();

    @AfterEach
    public void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterAll
    public static void close() {
        if (QUIT_BROWSER){
            driver.quit();
        }
    }


}
