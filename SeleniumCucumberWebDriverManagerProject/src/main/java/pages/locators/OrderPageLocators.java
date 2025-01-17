package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPageLocators {
	
	   @FindBy(id = "add-to-cart-sauce-labs-bike-light")
	    public WebElement addToCartButton;

	    @FindBy(xpath= "//a[@class='shopping_cart_link']")
	    public WebElement cartButton;

	    @FindBy(xpath = "//button[@id='checkout']")
	    public WebElement checkoutButton;

	    @FindBy(xpath = "//input[@id='first-name']")
	    public WebElement firstName;

	    @FindBy(xpath = "//input[@id='last-name']")
	    public WebElement lastName;

	    @FindBy(xpath = "//input[@id='postal-code']")
	    public WebElement postalCode;

	    @FindBy(xpath = "//input[@id='continue']")
	    public WebElement continueButton;

	    @FindBy(xpath = "//input[@id='finish']")
	    public WebElement finishButton;

	    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
	    public WebElement orderConfirmationMessage;
	  
}
