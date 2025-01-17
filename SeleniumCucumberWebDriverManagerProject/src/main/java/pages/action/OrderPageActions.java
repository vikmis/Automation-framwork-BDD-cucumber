package pages.action;

import org.openqa.selenium.support.PageFactory;

import pages.locators.OrderPageLocators;
import utilities.SeleniumDriver;

public class OrderPageActions {
	
	OrderPageLocators orderPageLocators = null;

    public OrderPageActions() {
        this.orderPageLocators = new OrderPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), orderPageLocators);
    }

    public void addToCart() {
        orderPageLocators.addToCartButton.click();
    }

    public void goToCart() {
        orderPageLocators.cartButton.click();
    }

    public void proceedToCheckout() {
        orderPageLocators.checkoutButton.click();
    }

    public void enterDetails(String firstName, String lastName, String postalCode) {
        orderPageLocators.firstName.sendKeys(firstName);
        orderPageLocators.lastName.sendKeys(lastName);
        orderPageLocators.postalCode.sendKeys(postalCode);
    }

    public void clickContinue() {
        orderPageLocators.continueButton.click();
    }

    public void clickFinish() {
        orderPageLocators.finishButton.click();
    }

    public boolean isOrderConfirmed() {
        return orderPageLocators.orderConfirmationMessage.isDisplayed();
    }

}
