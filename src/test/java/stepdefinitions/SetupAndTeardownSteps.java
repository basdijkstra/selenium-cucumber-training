package stepdefinitions;

import globals.SharedObjects;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.*;

import java.util.UUID;

public class SetupAndTeardownSteps extends SharedObjects {
	
	private SharedObjects _so;
	
	public SetupAndTeardownSteps(SharedObjects sharedObjects) {
		
		_so = sharedObjects;
	}

	@Before
	public void initReport(Scenario scenario) {

		_so.extentTest = RunCucumberTest.extentReports.createTest(scenario.getName());
	}

	@Before("@api")
	public void createAndStoreApiSessionId() {

		_so.apiSessionId = UUID.randomUUID().toString();
	}

	@Before("@userinterface")
	public void openBrowser() {
				
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");

		_so.driver = new ChromeDriver();
		_so.driver.manage().window().maximize();
	}
	
	@After("@userinterface")
	public void closeBrowser() {
				
		_so.driver.close();
	}
}
