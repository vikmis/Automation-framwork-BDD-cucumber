package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	 @FindBy(xpath = "//span[text()='Products']")
	    public WebElement pageTitle;

	    @FindBy(xpath = "//div[@data-test='inventory-list']")
	    public List<WebElement> products;

}
