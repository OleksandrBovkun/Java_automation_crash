package org.softserve.constants;

public class XPath {
    // Maksymovych Mykola
    public interface LogIn{
        String SignInLink = "//header//ul/li[2]/a",
        EmailInput = "//form/fieldset//div/input[@id='email']",
        PasswordInput = "//form/fieldset//div/input[@id='pass']",
        SignInButton = "//form/fieldset//button[@id='send2']";
    }
    public interface Base{
        // URI https://magento.softwaretestingboard.com/
        String WelcomeMsg = "//header//div/ul/li[1]/span";
        String WelcomeButton = "//header//div/ul/li/span/button";
    }
    public interface Account{
        // https://magento.softwaretestingboard.com/customer/account/
        static String MyAccountLabel = "/html/body//main//h1/span",
        AddressBookLink = "//div/ul/li[6]/a";
    }
    public interface Address {
        // https://magento.softwaretestingboard.com/customer/address/
        String AddressBookLabel ="//main//h1/span",
        AddNewAddressButton ="//main//button[contains(.,'Add New Address')]",
        AdditionalAddressFirstNameLabel ="//main//table/tbody/tr/td[1]";

        public interface New {
            // https://magento.softwaretestingboard.com/customer/address/new/
            String AddNewAddressLabel ="//main//h1/span",

            FirstNameInput ="//input[@id='firstname']",
            LastNameInput ="//input[@id='lastname']",
            TelephoneInput ="//input[@id='telephone']",
            StreetAddressInput ="//input[@id='street_1']",
            CityInput ="//input[@id='city']",
            StateProvinceInput ="//select[@id='region_id']",
            ZipPostalCodeInput ="//input[@id='zip']",
            CountryInput ="//select[@id='country']",

            SaveAddressButton ="//main/div/div/form//button";
        }
    }

    // Oleksander Bovkun
    public interface HomePage {
        String MEN_MENU = "//*[@id=\"ui-id-5\"]",
                WOMEN_MENU = "//*[@id=\"ui-id-4\"]",
                GEAR_MENU = "//*[@id=\"ui-id-6\"]",
                CART_COUNT_BUTTON = "/html/body/div[2]/header/div[2]/div[1]/a",
                VIEW_EDIT_CART = "/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[5]/div/a";
    }
    public interface ShoppingCart {
        String DELETE_BUTTON = "//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[2]/span";
    }
    public interface MenMenuCategory {
        String MEN_MENU_TOPS = "//*[@id=\"narrow-by-list2\"]/dd/ol/li[1]/a",
                MEN_MENU_BOTTOMS = "//*[@id=\"narrow-by-list2\"]/dd/ol/li[2]/a",
                MEN_TOPS_HOODIES = "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[1]/a",
                MEN_TOPS_JACKETS = "//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a",
                MEN_TOPS_TEES = "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[3]/a",
                MEN_TOPS_TANKS = "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[4]/a",
                MEN_TOPS_CAT_DD = "//*[@id='narrow-by-list']/div[1]/div[1]";

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
