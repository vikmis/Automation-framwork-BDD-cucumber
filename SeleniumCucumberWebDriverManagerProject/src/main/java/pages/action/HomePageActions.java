package pages.action;

import org.openqa.selenium.support.PageFactory;

import pages.locators.HomePageLocators;
import utilities.SeleniumDriver;

public class HomePageActions {
	
	 HomePageLocators homePageLocators = null;

	    public HomePageActions() {
	        this.homePageLocators = new HomePageLocators();
	        PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);
	    }

	    public String getPageTitle() {
	        return homePageLocators.pageTitle.getText();
	    }

	    public int getProductCount() {
	        return homePageLocators.products.size();
	    }

}
