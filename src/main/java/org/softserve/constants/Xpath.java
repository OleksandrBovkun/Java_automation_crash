package org.softserve.constants;

/**
 * todo: 1. optional - install 'CamelCase' plugin for switching cases of constants and web elements:
 *  (ctrl+alt+s) ==> marketplace ==> CamelCase ;
 *  2. set links (or examples if it covers several pages) of pages for provided xpathes;
 *  3. delete repeatable xpathes;
 *  4. try to format xpathes so they don't contain:
 *      1) ['number']: [4]::       /html/body/div[2]/header/div[2]/div[1]/a  ==>   //header//div[@class='minicart-wrapper']//a[@class='action showcart']
 *      2) unneeded html tags::   //main/div/div/form//button                ==>  //main//form[@class='form-address-edit']//button[@data-action='save-address']
 *      try to use @id, @name, @class etc instead (it can make xpath be even longer, but it's ok):
 *      in such way we make xpath more accurate
 *      pattern: 2-3 tags with parameters :: //tag1[@class='abc']//tag2[@id='qwe']//tafFinal[@id='final']
 *
 */


public class Xpath {

    // Ivan Fedyniak
    public interface Login{
        //https://magento.softwaretestingboard.com/customer/account/login/
        String
                EMAIL_INPUT = "//input[@name='login[username]']",
                PASSWORD_INPUT = "//input[@name='login[password]']",
                SIGN_IN_BUTTON = "//button[@id='send2' and @class='action login primary']",
                FORGOT_PASSWORD_BUTTON = "//a[@class='action remind' and span[text()='Forgot Your Password?']]",
                CREATE_ACCOUNT_BUTTON = "//a[@class='action create primary' and span[text()='Create an Account']]";
    }
    public interface Review{
        // for any product page, example:
        // https://magento.softwaretestingboard.com/circe-hooded-ice-fleece.html
        interface RATING{
            String
                    ONE_STAR_INPUT = "//input[@id='Rating_1']",
                    TWO_STAR_INPUT = "//input[@id='Rating_2']",
                    THREE_STAR_INPUT = "//input[@id='Rating_3']",
                    FOUR_STAR_INPUT = "//input[@id='Rating_4']",
                    FIVE_STAR_INPUT = "//input[@id='Rating_5']";
        }
        String
                PRODUCT_REVIEWS_BUTTON = "//a[@id='tab-label-reviews-title']",
                NICKNAME_INPUT = "//input[@id='nickname_field']",
                SUMMARY_INPUT = "//input[@id='summary_field']",
                REVIEW_TEXTAREA = "//textarea[@id='review_field']",
                SUBMIT_BUTTON = "//button[@class='action submit primary' and span[text()='Submit Review']]",
                REVIEW_SUBMITTED_MESSAGE = "//div[@role='alert' and div//div[text()='You submitted your review for moderation.']]";
    }

    // Maksymovych Mykola
    public interface Base{
        // URI https://magento.softwaretestingboard.com/
        String WELCOME_MSG = "//header//li[@class='greet welcome']//span",
            WELCOME_BUTTON = "//header//div/ul/li/span/button"; // can not find on provided url!
    }
    public interface Account{
        // https://magento.softwaretestingboard.com/customer/account/
        String MY_ACCOUNT_LABEL = "//h1[@class='page-title']//span[@class='base']",
                ADDRESS_BOOK_LINK = "//div[@id='block-collapsible-nav']//li//a[text()='Address Book']";
    }
    public interface Address {
        // https://magento.softwaretestingboard.com/customer/address/
        String ADDRESS_BOOK_LABEL ="//main//h1/span",
        ADD_NEW_ADDRESS_BUTTON ="//main//button[contains(.,'Add New Address')]",
        ADDITIONAL_ADDRESS_FIRST_NAME_LABEL ="//main//table/tbody/tr/td[1]";

        public interface New {
            // https://magento.softwaretestingboard.com/customer/address/new/
            String ADD_NEW_ADDRESS_LABEL ="//main//h1/span",

            FIRST_NAME_INPUT ="//input[@id='firstname']",
            LAST_NAME_INPUT ="//input[@id='lastname']",
            TELEPHONE_INPUT ="//input[@id='telephone']",
            STREET_ADDRESS_INPUT ="//input[@id='street_1']",
            CITY_INPUT ="//input[@id='city']",
            STATE_PROVINCE_INPUT ="//select[@id='region_id']",
            ZIP_POSTAL_CODE_INPUT ="//input[@id='zip']",
            COUNTRY_INPUT ="//select[@id='country']",

            SAVE_ADDRESS_BUTTON ="//main//form[@class='form-address-edit']//button[@data-action='save-address']";
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

    }
    public interface MenJacketsCategory {
        String PROTEUS_FITNESS_JACKSHIRT = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img";

    }
    public interface MenJacketsProductPage {
        String SIZE_XS = "//*[@id=\"option-label-size-143-item-166\"]",
                SIZE_S = "//*[@id=\"option-label-size-143-item-167\"]",
                SIZE_M = "//*[@id=\"option-label-size-143-item-168\"]",
                SIZE_L = "//*[@id=\"option-label-size-143-item-169\"]",
                SIZE_XL = "//*[@id=\"option-label-size-143-item-170\"]",
                COLOR_BLACK = "//*[@id=\"option-label-color-93-item-49\"]",
                COLOR_BLUE = "//*[@id=\"option-label-color-93-item-50\"]",
                COLOR_ORANGE = "//*[@id=\"option-label-color-93-item-56\"]",
                ADD_TO_CART_BUTTON = "//*[@id=\"product-addtocart-button\"]";
    }




    // Petrenko Maryna
    public interface Woman_Tab{
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

    // Sereda Olga
    public interface SortBy {
        String SORT_BY_PRICE_XPATH = "//*[@id='sorter']/option[3]",
                SORT_BY_PRODUCT_NAME_XPATH = "//*[@id='sorter']/option[2]",
                SORT_BY_POSITION_XPATH = "//*[@id='sorter']/option[1]",
                DESCENDING_DIRECTION_XPATH = "//a[contains(.,'Set Descending Direction')]",
                PRICE_VALUES_XPATH = "//div[@data-role='priceBox']/span/span/span[2]",
                SORTER_ID = "sorter";
    }
}
