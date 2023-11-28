package org.softserve.constants;

public class Constants {

    public interface Links{
        String
                MAIN_PAGE_LINK = "https://magento.softwaretestingboard.com/",
                LOGIN_PAGE_LINK = "https://magento.softwaretestingboard.com/customer/account/login",
                LOGOUT_LINK = "https://magento.softwaretestingboard.com/customer/account/logout/",
                PRODUCT_EXAMPLE_LINK = "https://magento.softwaretestingboard.com/circe-hooded-ice-fleece.html",


                WOMEN_TOPS_LINK = "https://magento.softwaretestingboard.com/women/tops-women.html",

                ACCOUNT_LINK = "https://magento.softwaretestingboard.com/customer/account/",
                ADDRESS_LINK = "https://magento.softwaretestingboard.com/customer/address/",
                ADDRESS_NEW_LINK = "https://magento.softwaretestingboard.com/customer/address/new/";
    }
    public interface TestsSettings{
        boolean CLEAR_COOKIES_AND_STORAGE = true; // to clear cookies
        int EXPLICITLY_WAIT = 20; // time to wait for webElement to load (if pass more we'll get TimeoutException)
        boolean QUIT_BROWSER = true; // to close browser after tests
    }
}
