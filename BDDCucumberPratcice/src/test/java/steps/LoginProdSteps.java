package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class LoginProdSteps {

    @And("user validates captcha image")
    public void user_validates_captcha_image() {
        // Your validation logic for captcha image
    }

    @Then("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps();

        // Assuming you have a method to enter first name and last name
        for (Map<String, String> row : data) {
            String firstName = row.get("FirstName");
            String lastName = row.get("LastName");

            // Your logic to enter first name and last name
            // For empty values, handle them as needed (e.g., set to null or leave empty)
            // Example:
            if ("[blank]".equals(firstName)) {
                firstName = ""; // Set to empty string
            }

            // Print for verification (you can remove this in your actual code)
            System.out.println("FirstName: " + firstName + " LastName: " + lastName);
        }
    }
}
