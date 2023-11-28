package org.softserve.address;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
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

    @Test
    @Order(1)
    public void Should_CreateFirstAddress_When_InformationIsCorrect(){
        var FirstName = "Naruto";
        var LastName = "Uzumaki";
        var Telephone = "0991122333";
        var StreetAddress = "main str";
        var City = "Kyiv";
        var ZipPostalCode = "10000";
        var Country = "Ukraine";
        accountPage.open(Links.ACCOUNT_LINK);
        accountPage.clickAddressBookLink();
        if (Links.ADDRESS_NEW_LINK.equals(driver.getCurrentUrl())){
            newAddressPage.fillAll(FirstName,LastName,Telephone,StreetAddress,City,ZipPostalCode,Country);
            newAddressPage.clickSaveAddressButton();
            String actual = addressPage.getDefaultAddressFirstNameLabelText();
            Assertions.assertEquals(FirstName, actual);
        }
    }

    @Test
    public void Should_CreateNewAddress_When_InformationIsCorrect(){
        var FirstName = "Naruto2";
        var LastName = "Uzumaki2";
        var Telephone = "0991234567";
        var StreetAddress = "second str";
        var City = "Lviv";
        var ZipPostalCode = "22000";
        var Country = "Ukraine";
        // Assertions.assertEquals(Links.ADDRESS_LINK, driver.getCurrentUrl());
        newAddressPage.open(Links.ADDRESS_NEW_LINK); // todo: make full path to this page
        newAddressPage.fillAll(FirstName,LastName,Telephone,StreetAddress,City,ZipPostalCode,Country);
        newAddressPage.clickSaveAddressButton();
        String actual = addressPage.getAdditionalAddressFirstNameLabelText();
        Assertions.assertEquals(FirstName, actual);
    }
}
