package org.softserve.pages.address;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.softserve.constants.Xpath;
import org.softserve.pages.base.BasePage;

public class AddressPage extends BasePage {
    @FindBy(xpath = Xpath.AddressPage.ADDRESS_BOOK_LABEL)
    private WebElement addressBookLabel;

    @FindBy(xpath = Xpath.AddressPage.ADD_NEW_ADDRESS_BUTTON)
    private WebElement addNewAddressButton;

    @FindBy(xpath = Xpath.AddressPage.ADDITIONAL_ADDRESS_FIRST_NAME_LABEL)
    private WebElement additionalAddressFirstNameLabel;

    @FindBy(xpath = Xpath.AddressPage.DEFAULT_ADDRESS_FIRST_NAME_LABEL)
    private WebElement defaultAddressFirstNameLabel;

    public String getAdditionalAddressFirstNameLabelText() {
        waitElementIsVisible(additionalAddressFirstNameLabel);
        return additionalAddressFirstNameLabel.getText();
    }

    public String getDefaultAddressFirstNameLabelText() {
        waitElementIsVisible(defaultAddressFirstNameLabel);
        return defaultAddressFirstNameLabel.getText().split(" ")[0]; // 0 it`s Name
    }

    public AddressPage(WebDriver driver) {
        super(driver);
    }

    public AddressPage clickAddNewAddressButton(){
        waitElementIsClickable(addNewAddressButton);
        addNewAddressButton.click();
        return this;
    }
}