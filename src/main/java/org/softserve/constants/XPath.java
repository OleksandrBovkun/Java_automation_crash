package org.softserve.constants;

public class XPath {
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
}
