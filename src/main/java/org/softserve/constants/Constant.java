package org.softserve.constants;

public class Constant {

    public interface Links{
        String
                LOGIN_PAGE_LINK = "https://magento.softwaretestingboard.com/customer/account/login",
                LOGOUT_LINK = "https://magento.softwaretestingboard.com/customer/account/logout/",
                PRODUCT_EXAMPLE_LINK = "https://magento.softwaretestingboard.com/circe-hooded-ice-fleece.html",
                MAIN_PAGE_LINK = "https://magento.softwaretestingboard.com/";
    }
    public interface TestsSettings{

        boolean CLEAR_COOKIES_AND_STORAGE = true;
        int EXPLICITLY_WAIT = 20;
        boolean QUIT_BROWSER = true;
    }


}
