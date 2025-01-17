package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.action.HomePageActions;
import pages.action.LoginPageActions;
import utilities.SeleniumDriver;

import org.testng.Assert;


public class HomePageSteps {

    HomePageActions homePageActions = new HomePageActions();

    @Given("user is logged in")
    public void user_is_logged_in() {
        SeleniumDriver.openPage("https://www.saucedemo.com/");
        LoginPageActions loginPageActions = new LoginPageActions();
        loginPageActions.enterUsername("standard_user");
        loginPageActions.enterPassword("secret_sauce");
        loginPageActions.clickLoginButton();
    }

    @Then("home page title should be {string}")
    public void home_page_title_should_be(String expectedTitle) {
        Assert.assertEquals(homePageActions.getPageTitle(), expectedTitle);
    }

    @Then("all products should be listed")
    public void all_products_should_be_listed() {
        Assert.assertTrue(homePageActions.getProductCount() > 0);
    }
}
