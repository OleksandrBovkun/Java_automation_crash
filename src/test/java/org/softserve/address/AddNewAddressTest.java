package org.softserve.address;

import org.junit.jupiter.api.*;
import org.softserve.base.BaseAuthorized;
import org.softserve.pages.account.AccountPage;
import org.softserve.pages.address.AddressPage;
import org.softserve.pages.address.NewAddressPage;

import static org.softserve.constants.Constants.Links;

public class AddNewAddressTest extends BaseAuthorized {
    protected static AccountPage accountPage;
    protected static AddressPage addressPage;
    protected static NewAddressPage newAddressPage;

    @BeforeAll
    public static void setUp(){
        accountPage = new AccountPage(driver);
        addressPage = new AddressPage(driver);
        newAddressPage = new NewAddressPage(driver);
    }
    @Disabled
    @Test
    @Order(1)
    public void Should_CreateFirstAddress_When_InformationIsCorrect(){
        var firstName = "Naruto";
        var lastName = "Uzumaki";
        var telephone = "0991122333";
        var streetAddress = "main str";
        var city = "Kyiv";
        var zipPostalCode = "10000";
        var country = "Ukraine";
        accountPage.open(Links.ACCOUNT_LINK);
        accountPage.clickAddressBookLink();
        if (Links.ADDRESS_NEW_LINK.equals(driver.getCurrentUrl())){
            newAddressPage.fillAll(firstName,lastName,telephone,streetAddress,city,zipPostalCode,country);
            newAddressPage.clickSaveAddressButton();
            String actual = addressPage.getDefaultAddressFirstNameLabelText();
            Assertions.assertEquals(firstName, actual);
        }
    }
    @Disabled
    @Test
    public void Should_CreateNewAddress_When_InformationIsCorrect(){
        var firstName = "Naruto2";
        var lastName = "Uzumaki2";
        var telephone = "0991234567";
        var streetAddress = "second str";
        var city = "Lviv";
        var zipPostalCode = "22000";
        var country = "Ukraine";
        newAddressPage.open(Links.ADDRESS_NEW_LINK);
        newAddressPage.fillAll(firstName,lastName,telephone,streetAddress,city,zipPostalCode,country);
        newAddressPage.clickSaveAddressButton();
        String actual = addressPage.getAdditionalAddressFirstNameLabelText();
        Assertions.assertEquals(firstName, actual);
    }
}
