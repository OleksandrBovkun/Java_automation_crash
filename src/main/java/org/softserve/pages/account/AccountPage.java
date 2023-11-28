package org.softserve.pages.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.softserve.constants.Xpath;
import org.softserve.pages.base.BasePage;

public class AccountPage extends BasePage {
    @FindBy(xpath = Xpath.AccountPage.MY_ACCOUNT_LABEL)
    WebElement myAccountLabel;

    @FindBy(xpath = Xpath.AccountPage.ADDRESS_BOOK_LINK)
    WebElement addressBookLink;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public AccountPage clickAddressBookLink(){
        waitElementIsClickable(addressBookLink);
        addressBookLink.click();
        return this;
    }
}
