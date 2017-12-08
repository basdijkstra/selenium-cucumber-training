package stepdefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import globals.SharedObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.*;

public class SetupAndTeardownSteps extends SharedObjects {
	
	private SharedObjects _so;
	
	public SetupAndTeardownSteps(SharedObjects sharedObjects) {
		
		_so = sharedObjects;
	}
		
	@Before
	public void openBrowser(Scenario scenario) {
				
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
		
		_so.extentTest = RunCucumberTest.extentReports.createTest(scenario.getName());

		_so.driver = new ChromeDriver();
		_so.driver.manage().window().maximize();
	}
	
	@After
	public void closeBrowser() {
				
		_so.driver.close();
	}
}
