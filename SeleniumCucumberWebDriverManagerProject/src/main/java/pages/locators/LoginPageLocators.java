package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	 @FindBy(xpath = "//input[@id='user-name']")
	    public WebElement username;

	    @FindBy(xpath = "//input[@id='password']")
	    public WebElement password;

	    @FindBy(xpath = "//input[@id='login-button']")
	    public WebElement loginButton;

	    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
	    public WebElement errorMessage;

}
