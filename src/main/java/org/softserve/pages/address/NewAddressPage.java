package org.softserve.pages.address;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.softserve.constants.Xpath;
import org.softserve.pages.base.BasePage;

public class NewAddressPage extends BasePage {
    @FindBy(xpath = Xpath.AddressPage.New.ADD_NEW_ADDRESS_LABEL)
    private WebElement addNewAddressLabel;

    @FindBy(xpath = Xpath.AddressPage.New.SAVE_ADDRESS_BUTTON)
    private WebElement saveAddressButton;

    @FindBy(xpath = Xpath.AddressPage.New.FIRST_NAME_INPUT)
    private WebElement firstNameInput;

    @FindBy(xpath = Xpath.AddressPage.New.LAST_NAME_INPUT)
    private WebElement lastNameInput;

    @FindBy(xpath = Xpath.AddressPage.New.TELEPHONE_INPUT)
    private WebElement telephoneInput;

    @FindBy(xpath = Xpath.AddressPage.New.STREET_ADDRESS_INPUT)
    private WebElement streetAddressInput;

    @FindBy(xpath = Xpath.AddressPage.New.CITY_INPUT)
    private WebElement cityInput;

    @FindBy(xpath = Xpath.AddressPage.New.STATE_PROVINCE_INPUT)
    private WebElement stateProvinceInput;

    @FindBy(xpath = Xpath.AddressPage.New.ZIP_POSTAL_CODE_INPUT)
    private WebElement zipPostalCodeInput;

    @FindBy(xpath = Xpath.AddressPage.New.COUNTRY_INPUT)
    private WebElement countryInput;

    public NewAddressPage(WebDriver driver) {
        super(driver);
    }

    public NewAddressPage fillFirstNameInput(String data){
        waitElementIsVisible(firstNameInput);
        fillField(firstNameInput, data);
        return this;
    }
    public NewAddressPage fillLastNameInput(String data){
        waitElementIsVisible(lastNameInput);
        fillField(lastNameInput, data);
        return this;
    }
    public NewAddressPage fillTelephoneInput(String data){
        waitElementIsVisible(telephoneInput);
        fillField(telephoneInput, data);
        return this;
    }
    public NewAddressPage fillStreetAddressInput(String data){
        waitElementIsVisible(streetAddressInput);
        fillField(streetAddressInput, data);
        return this;
    }
    public NewAddressPage fillCityInput(String data){
        waitElementIsVisible(cityInput);
        fillField(cityInput, data);
        return this;
    }
    public NewAddressPage fillStateProvinceInput(String data){
        waitElementIsVisible(stateProvinceInput);
        fillField(stateProvinceInput, data);
        return this;
    }
    public NewAddressPage fillStateProvinceSelect(String data){
        waitElementIsVisible(stateProvinceInput);
        new Select(stateProvinceInput).selectByValue(data);
        return this;
    }
    public NewAddressPage fillZipPostalCodeInput(String data){
        waitElementIsVisible(zipPostalCodeInput);
        fillField(zipPostalCodeInput, data);
        return this;
    }
    public NewAddressPage fillCountrySelect(String data){
        waitElementIsVisible(countryInput);
        new Select(countryInput).selectByVisibleText(data);
        return this;
    }

    public NewAddressPage fillAll(String FirstName, String LastName,
                    String Telephone, String StreetAddress, String City,
                    String ZipPostalCode, String Country) {
        fillFirstNameInput(FirstName);
        fillLastNameInput(LastName);
        fillTelephoneInput(Telephone);
        fillStreetAddressInput(StreetAddress);
        fillCityInput(City);
        fillZipPostalCodeInput(ZipPostalCode);
        fillCountrySelect(Country);
        return this;
    }

    public NewAddressPage clickSaveAddressButton(){
        waitElementIsClickable(saveAddressButton);
        saveAddressButton.click();
        return this;
    }
}