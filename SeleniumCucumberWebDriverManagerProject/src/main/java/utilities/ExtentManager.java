package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	  private static ExtentReports extentReports;
	    private static ExtentTest test;

	    public static void setUpExtentReport() {
	        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/extent-reports/extent-report.html");
	        extentReports = new ExtentReports();
	        extentReports.attachReporter(sparkReporter);
	    }

	    public static void tearDownExtentReport() {
	        if (extentReports != null) {
	            extentReports.flush();
	        }
	    }

	    public static ExtentTest createTest(String testName) {
	        test = extentReports.createTest(testName);
	        return test;
	    }

	    public static ExtentTest getTest() {
	        return test;
	    }

}
