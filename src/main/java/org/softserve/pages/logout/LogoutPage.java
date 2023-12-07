package org.softserve.pages.logout;

import org.openqa.selenium.WebDriver;
import org.softserve.pages.base.BasePage;


import static org.softserve.constants.Constants.Links.LOGOUT_LINK;

public class LogoutPage extends BasePage {
    public LogoutPage(WebDriver driver) {
        super(driver);
    }
    public LogoutPage logout(){
        open(LOGOUT_LINK);
        return this;
    }

}
