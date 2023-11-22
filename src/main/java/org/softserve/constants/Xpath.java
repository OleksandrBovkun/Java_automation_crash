package org.softserve.constants;

public class Xpath {

    public interface Login{
        String
         SIGNIN_BUTTON = "//li[@class='authorization-link']//a[contains(text(), 'Sign In')]",
         EMAIL_INPUT = "//input[@id='email' and @name='login[username]' and @type='email']",
         PASSWORSD_INPUT = "//input[@id='pass' and @name='login[password]' and @type='password']",
         LOGIN_BUTTON = "//button[@id='send2' and contains(@class, 'primary')]",
         WELCOME_MESSAGE = "span.logged-in[data-bind^='text: new String']";
    }

    public interface WomanPage{
    String
        WOMAN_ITEM = "//a[contains(@href, 'women') and @role='menuitem' and contains(., 'Women')]",
        TOPS_ITEM = "//li[@class='item']/a[contains(@href, 'women/tops-women.html') and text()='Tops']",
        PAGE_TITLE = "//h1[@class='page-title' and @id='page-title-heading']/span[@class='base' and text()='Tops']",
        FIRST_ELEMENT = "//li[@class='item product product-item'][1]",
        MAIN_CONTENT = "//main[@id='maincontent' and @class='page-main']",
        DETAILS_TAB = "//div[@class='product data items']//div[@class='data item title active' and contains(a, 'Details')]",
        DETAILS_CONTENT = "//div[@class='data item content' and @id='description']",
        MORE_INFO_TAB = "//div[@class='product data items']//div[@class='data item title active' and contains(a, 'More Information ')]",
        MORE_INFO_CONTENT = "//div[@class='data item content' and @id='additional']",
        REVIEWS_TAB = "//div[@class='product data items']//div[@class='data item title active' and contains(a, 'Reviews ')]",
        REVIEWS_CONTENT = "//div[@class='data item content' and @id='reviews']";
    }
}
