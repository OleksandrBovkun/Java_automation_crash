package org.softserve.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.softserve.pages.base.BasePage;

import static org.softserve.constants.Xpath.Login;

public class LoginPage extends BasePage {

    @FindBy(xpath = Login.EMAIL_INPUT)
    WebElement emailInput;

    @FindBy(xpath = Login.PASSWORD_INPUT)
    WebElement passwordInput;

    @FindBy(xpath = Login.SIGN_IN_BUTTON)
    WebElement signInButton;

    @FindBy(xpath = Login.FORGOT_PASSWORD_BUTTON)
    WebElement forgetPasswordButton;

    @FindBy(xpath = Login.CREATE_ACCOUNT_BUTTON)
    WebElement createAccountButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage fillEmail(String email){
        waitElementIsVisible(emailInput);
        fillField(emailInput, email);
        return this;
    }
    public LoginPage fillPassword(String password){
        waitElementIsVisible(passwordInput);
        fillField(passwordInput, password);
        return this;
    }

    public LoginPage clickSignInButton(){
        waitElementIsClickable(signInButton);
        signInButton.click();
        return this;
    }

    public LoginPage clickForgetPasswordButton(){
        waitElementIsClickable(signInButton);
        forgetPasswordButton.click();
        return this;
    }

    public LoginPage clickCreateAccountButton(){
        waitElementIsClickable(signInButton);
        createAccountButton.click();
        return this;
    }

    public LoginPage login(String email, String password){
        fillEmail(email)
                .fillPassword(password)
                .clickSignInButton();
        return this;
    }




}
