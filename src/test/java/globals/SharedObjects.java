package globals;

import com.aventstack.extentreports.*;
import org.openqa.selenium.WebDriver;

import dataentities.*;

public class SharedObjects {
	
	public WebDriver driver;
	public MortgageClientNL mortgageClientNL, jointMortgageClientNL;
	public String apiSessionId;
	public ExtentTest extentTest;
}
