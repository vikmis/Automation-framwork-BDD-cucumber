package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.action.HomePageActions;
import pages.action.LoginPageActions;
import pages.action.OrderPageActions;
import utilities.SeleniumDriver;


public class OrderProductSteps {

    OrderPageActions orderPageActions = new OrderPageActions();
    HomePageActions homePageActions = new HomePageActions();

    @Given("user is logged in and on the home page")
    public void user_is_logged_in_and_on_the_home_page() {
        SeleniumDriver.openPage("https://www.saucedemo.com/");
        LoginPageActions loginPageActions = new LoginPageActions();
        loginPageActions.enterUsername("standard_user");
        loginPageActions.enterPassword("secret_sauce");
        loginPageActions.clickLoginButton();
    }

    @When("user adds a product to the cart")
    public void user_adds_a_product_to_the_cart() {
        orderPageActions.addToCart();
    }

    @And("user goes to the cart")
    public void user_goes_to_the_cart() {
        orderPageActions.goToCart();
    }

    @And("user proceeds to checkout")
    public void user_proceeds_to_checkout() {
        orderPageActions.proceedToCheckout();
    }

    @And("user enters their details")
    public void user_enters_their_details() {
        orderPageActions.enterDetails("John", "Doe", "12345");
    }

    @And("user clicks continue")
    public void user_clicks_continue() {
        orderPageActions.clickContinue();
    }

    @And("user clicks finish")
    public void user_clicks_finish() {
        orderPageActions.clickFinish();
    }

    @Then("order should be placed successfully")
    public void order_should_be_placed_successfully() {
        Assert.assertTrue(orderPageActions.isOrderConfirmed());
    }
}
