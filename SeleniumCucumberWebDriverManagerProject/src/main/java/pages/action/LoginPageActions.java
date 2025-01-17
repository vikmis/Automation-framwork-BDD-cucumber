package pages.action;

import org.openqa.selenium.support.PageFactory;

import pages.locators.LoginPageLocators;
import utilities.SeleniumDriver;

public class LoginPageActions {
	
	LoginPageLocators loginPageLocators = null;

    public LoginPageActions() {
        this.loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), loginPageLocators);
    }

    public void enterUsername(String username) {
        loginPageLocators.username.sendKeys(username);
    }

    public void enterPassword(String password) {
        loginPageLocators.password.sendKeys(password);
    }

    public void clickLoginButton() {
        loginPageLocators.loginButton.click();
    }

    public boolean isErrorMessageDisplayed() {
        return loginPageLocators.errorMessage.isDisplayed();
    }

}
