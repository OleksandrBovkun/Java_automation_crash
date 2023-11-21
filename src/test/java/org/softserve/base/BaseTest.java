package org.softserve.base;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.softserve.SetupDriver;

import org.softserve.pages.login.LoginPage;
import org.softserve.pages.logout.LogoutPage;
import org.softserve.pages.product.review.ReviewPage;


import static org.softserve.constants.Constant.TestsSettings.CLEAR_COOKIES_AND_STORAGE;
import static org.softserve.constants.Constant.TestsSettings.QUIT_BROWSER;


public class BaseTest {
    protected static WebDriver driver = SetupDriver.createDriver(); //null;//

    protected LoginPage loginPage = new LoginPage(driver);
    protected ReviewPage reviewPage = new ReviewPage(driver);
    protected LogoutPage logoutPage = new LogoutPage(driver);





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
//            driver.close();
            driver.quit();
        }
    }


}
