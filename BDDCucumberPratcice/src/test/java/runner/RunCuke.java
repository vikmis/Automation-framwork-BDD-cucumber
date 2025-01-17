package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features", // Specify the path to your feature files
    glue = "steps", // Specify the package where your step definitions are located
    		tags ="@datatable",
    plugin = {
        "html:target/cucumber-reports/cucumber-html-report.html", // HTML report
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // Extent report
    }
)
public class RunCuke extends AbstractTestNGCucumberTests {
}
