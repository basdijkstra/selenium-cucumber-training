package pages.mortgageorientation;

import org.junit.Assert;
import org.openqa.selenium.By;

import globals.SharedObjects;
import helpers.MYElements;

public class MortgageOrientationHouseInfoPage {
	
	private SharedObjects _so;
	private MYElements myElements;
	
	private By textLabelHouseTypeNew = By.id("houseType0");
	private By textLabelHouseTypeExisting = By.id("houseType1");
	private By textFieldRenovationCost = By.id("houseExtraCost");
	private By textLabelCurrentlyHomeOwnerYes = By.id("homeOwner0");
	private By textLabelCurrentlyHomeOwnerNo = By.id("homeOwner1");
	private By textFieldCurrentHouseSalePrice = By.id("oldHouseSalePrice");
	private By textFieldCurrentMortgage = By.id("oldMortgage");
	private By textFieldCurrentMortgageStartDate = By.id("oldMortgageStartDate");
	private By buttonNextStep = By.xpath("//button/span[contains(text(),'Bekijk het hypotheekaanbod')]");
	
	public MortgageOrientationHouseInfoPage(SharedObjects so) {
		        
		_so = so;
		myElements = new MYElements(_so);
    }
	
	public MortgageOrientationHouseInfoPage setHouseType(String houseTypeNewOrExisting) {
		
		switch(houseTypeNewOrExisting.toLowerCase()) {
		case "new":
			myElements.click(textLabelHouseTypeNew);
			break;
		case "existing":
			myElements.click(textLabelHouseTypeExisting);
			break;
		default:
			_so.extentTest.error("Unknown value specified for 'house type': " + houseTypeNewOrExisting);
			Assert.fail();
		}
		return this;
	}
	
	public MortgageOrientationHouseInfoPage setRenovationCost(String renovationCost) {
		
		myElements.sendKeys(textFieldRenovationCost, renovationCost);
		return this;
	}
	
	public MortgageOrientationHouseInfoPage setCurrentlyHomeOwner(String currentlyHomeOwnerYesOrNo) {
		
		switch(currentlyHomeOwnerYesOrNo.toLowerCase()) {
		case "yes":
			myElements.click(textLabelCurrentlyHomeOwnerYes);
			break;
		case "no":
			myElements.click(textLabelCurrentlyHomeOwnerNo);
			break;
		default:
			_so.extentTest.error("Unknown value specified for 'currently home owner': " + currentlyHomeOwnerYesOrNo);
			Assert.fail();
		}
		return this;
	}
	
	public MortgageOrientationHouseInfoPage setCurrentHouseSalePrice(String currentHouseSalePrice) {
		
		myElements.sendKeys(textFieldCurrentHouseSalePrice, currentHouseSalePrice);
		return this;
	}
	
	public MortgageOrientationHouseInfoPage setCurrentMortgage(String currentMortgage) {
		
		myElements.sendKeys(textFieldCurrentMortgage, currentMortgage);
		return this;
	}
	
	public MortgageOrientationHouseInfoPage setCurrentMortgageStartDate(String currentMortgageStartDate) {
		
		myElements.sendKeys(textFieldCurrentMortgageStartDate, currentMortgageStartDate);
		return this;
	}

	public void clickButtonNextStep() {
		
		myElements.click(buttonNextStep);
	}
}
