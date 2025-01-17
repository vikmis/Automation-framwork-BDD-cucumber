package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.action.LoginPageActions;
import utilities.ExtentManager;
import utilities.SeleniumDriver;

import org.testng.Assert;


import java.util.List;
import java.util.Map;

public class LoginSteps {

    LoginPageActions loginPageActions = new LoginPageActions();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        SeleniumDriver.openPage("https://www.saucedemo.com/");
      
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            loginPageActions.enterUsername(row.get("username"));
            loginPageActions.enterPassword(row.get("password"));
            loginPageActions.clickLoginButton();
            
        }
    }

    @Then("user should be logged in")
    public void user_should_be_logged_in() {
        Assert.assertTrue(SeleniumDriver.getDriver().getCurrentUrl().contains("inventory.html"));
        
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            loginPageActions.enterUsername(row.get("username"));
            loginPageActions.enterPassword(row.get("password"));
            loginPageActions.clickLoginButton();
            
        }
    }

    @Then("user should not be logged in")
    public void user_should_not_be_logged_in() {
        Assert.assertTrue(SeleniumDriver.getDriver().getCurrentUrl().contains("saucedemo.com"));
        
    }

    @When("user enters valid username and invalid password")
    public void user_enters_valid_username_and_invalid_password(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            loginPageActions.enterUsername(row.get("username"));
            loginPageActions.enterPassword(row.get("password"));
            loginPageActions.clickLoginButton();
           
        }
    }
}
