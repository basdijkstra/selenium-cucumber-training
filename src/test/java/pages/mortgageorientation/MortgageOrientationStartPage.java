package pages.mortgageorientation;

import org.junit.Assert;
import org.openqa.selenium.By;

import globals.Globals;
import globals.SharedObjects;
import helpers.MYElements;

public class MortgageOrientationStartPage {
	
	private SharedObjects _so;
	private MYElements myElements;
	
	private By textLabelApplicationAlone = By.id("application0");
	private By textLabelApplicationTogether = By.id("application1");
	private By dropdownContractType = By.id("employmentType");
	private By textFieldGrossIncome = By.id("grossIncome");
	private By dropdownContractTypePartner = By.id("partnerEmploymentType");
	private By textFieldGrossIncomePartner = By.id("partnerGrossIncome");
	private By textFieldHouseAskingPrice = By.id("housePrice");
	private By buttonNextStep = By.xpath("//button/span[contains(text(),'Bereken')]");
	
	public MortgageOrientationStartPage(SharedObjects so) {
		        
		_so = so;
		myElements = new MYElements(_so);
		
		myElements.get(Globals.MORTGAGE_ORIENTATION_NL);
    }
	
	public MortgageOrientationStartPage setRequestAloneOrTogether(String aloneOrTogether) {
		
		switch(aloneOrTogether.toLowerCase()) {
		case "alone":
			myElements.click(textLabelApplicationAlone);
			break;
		case "together":
			myElements.click(textLabelApplicationTogether);
			break;
		default:
			_so.extentTest.error("Unknown value specified for 'alone or together': " + aloneOrTogether);
			Assert.fail();
		}
		return this;
	}
	
	public MortgageOrientationStartPage selectContractType(String contractType) {
		
		myElements.select(dropdownContractType, contractType);
		return this;
	}
	
	public MortgageOrientationStartPage setGrossIncome(String grossIncome) {
		
		myElements.sendKeys(textFieldGrossIncome, grossIncome);
		return this;
	}
	
	public MortgageOrientationStartPage setContractTypePartner(String contractTypePartner) {
		
		myElements.select(dropdownContractTypePartner, contractTypePartner);
		return this;
	}
	
	public MortgageOrientationStartPage setGrossIncomePartner(String grossIncomePartner) {
		
		myElements.sendKeys(textFieldGrossIncomePartner, grossIncomePartner);
		return this;
	}
	
	public MortgageOrientationStartPage setAskingPrice(String askingPrice) {
		
		myElements.sendKeys(textFieldHouseAskingPrice, askingPrice);
		return this;
	}
	
	public void clickButtonNextStep() {
		
		myElements.click(buttonNextStep);
	}
}
