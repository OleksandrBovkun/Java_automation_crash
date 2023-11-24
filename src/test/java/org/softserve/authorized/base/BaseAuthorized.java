package org.softserve.authorized.base;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.softserve.Config;
import org.softserve.SetupDriver;
import org.softserve.pages.login.LoginPage;
import org.softserve.pages.logout.LogoutPage;
import org.softserve.pages.product.review.ReviewPage;

import static org.softserve.constants.Constants.Links.LOGIN_PAGE_LINK;
import static org.softserve.constants.Constants.TestsSettings.CLEAR_COOKIES_AND_STORAGE;
import static org.softserve.constants.Constants.TestsSettings.QUIT_BROWSER;

/**
 * Extend your '*Test' class with BaseAuthorized if to provide authorization before tests execution.
 */
public abstract class BaseAuthorized {
    protected static WebDriver driver = SetupDriver.createDriver();
    protected LoginPage loginPage = new LoginPage(driver);
    protected LogoutPage logoutPage = new LogoutPage(driver);



    @BeforeEach
    public void beforeEachMethod(){
        loginPage.open(LOGIN_PAGE_LINK);
        loginPage.login(Config.LOGIN, Config.PASSWORD);
    }


    @AfterEach
    public void clearCookiesAndLocalStorage(){
        logoutPage.logout();
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
