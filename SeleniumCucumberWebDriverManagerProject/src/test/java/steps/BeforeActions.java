package steps;

import io.cucumber.java.Before;
import utilities.ExtentManager;
import utilities.SeleniumDriver;

public class BeforeActions {
	
	@Before
    public static void setUp() {
		
        SeleniumDriver.setUpDriver();
     
        
    }

}
