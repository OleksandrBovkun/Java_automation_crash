package org.softserve.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.softserve.constants.Xpath;
import org.softserve.pages.base.BasePage;


public class LoginPage extends BasePage {

    /** PageFactory @FindBy is alternative of WebElement emailInput = driver.findElement(By.xpath(Xpath.LoginPage.EMAIL_INPUT));
        Initialization of webElements with  @FindBy annotation occur with PageFactory.initElements here:
        {@link org.softserve.pages.base.BasePage#BasePage}
    */
    @FindBy(xpath = Xpath.LoginPage.EMAIL_INPUT)
    private WebElement emailInput;

    @FindBy(xpath = Xpath.LoginPage.PASSWORD_INPUT)
    private WebElement passwordInput;

    @FindBy(xpath = Xpath.LoginPage.SIGN_IN_BUTTON)
    private WebElement signInButton;

    @FindBy(xpath = Xpath.LoginPage.FORGOT_PASSWORD_BUTTON)
    private WebElement forgetPasswordButton;

    @FindBy(xpath = Xpath.LoginPage.CREATE_ACCOUNT_BUTTON)
    private WebElement createAccountButton;

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
