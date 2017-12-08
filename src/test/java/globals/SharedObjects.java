package globals;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import dataentities.*;

public class SharedObjects {
	
	public WebDriver driver;
	public MortgageClientNL mortgageClientNL, jointMortgageClientNL;
	public ExtentTest extentTest;
}
