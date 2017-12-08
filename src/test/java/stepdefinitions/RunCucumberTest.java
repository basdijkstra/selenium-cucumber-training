package stepdefinitions;

import java.io.File;

import globals.Globals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		plugin = {"pretty", "json:target/cucumber-json-report/cucumber-json-report.json"},
		tags = {"@testing"}
		)

public class RunCucumberTest{
	
	public static ExtentReports extentReports;
	public static ExtentHtmlReporter htmlReporter;
	
	@BeforeClass
	public static void initialize() {
		
		extentReports = new ExtentReports();
		
		// Create reports folder if it does not exist
		File reportsFolder = new File(Globals.EXTENTREPORTS_FOLDER);
		if(!reportsFolder.exists()) {
			// Create report folder if it does not exist
			reportsFolder.mkdir();
			// Create images subfolder too
			new File(Globals.EXTENTREPORTS_FOLDER + Globals.EXTENTREPORTS_IMAGES_FOLDER).mkdir();
		}
		
		htmlReporter = new ExtentHtmlReporter(Globals.EXTENTREPORTS_FOLDER + "myreport.html");
		
		extentReports.attachReporter(htmlReporter);		
	}
	
	@AfterClass
	public static void tearDown() {
		
		extentReports.flush();
	}
}
