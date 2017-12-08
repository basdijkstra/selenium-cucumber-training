package pages.mortgageorientation;

import org.junit.Assert;
import org.openqa.selenium.By;

import globals.SharedObjects;
import helpers.MYElements;

public class MortgageOrientationFinancialSituationPage {
	
	private SharedObjects _so;
	private MYElements myElements;
	
	private By textLabelRetireWithInTenYearsYes = By.id("retirement_0");
	private By textLabelRetireWithInTenYearsNo = By.id("retirement_1");
	private By textLabelPartnerRetireWithInTenYearsYes = By.id("partnerRetirement_0");
	private By textLabelPartnerRetireWithInTenYearsNo = By.id("partnerRetirement_1");
	private By textFieldPartnerDateOfBirth = By.id("partnerBirthDate");
	private By textLabelPartnerRetirementIncomeKnown = By.id("partnerKnowsRetirementIncome_0"); 
	private By textFieldPartnerRetirementIncome = By.id("partnerRetirementIncome");
	private By textFieldCapital = By.id("capital");
	private By textLabelFinancialCommitmentYes = By.id("financialCommitment_0");
	private By textLabelFinancialCommitmentNo = By.id("financialCommitment_1");
	private By textFieldMonthlyLoans = By.id("monthlyLoans");
	private By textFieldMonthlyAlimony = By.id("monthlyAlimony");
	private By textFieldStudentLoan = By.id("studentLoan");
	private By textFieldPartnerMonthlyLoans = By.id("partnerMonthlyLoans");
	private By textFieldPartnerMonthlyAlimony = By.id("partnerMonthlyAlimony");
	private By textFieldPartnerStudentLoan = By.id("partnerStudentLoan");
	private By buttonNextStep = By.xpath("//button/span[contains(text(),'Vertel ons iets over de woning')]");
	
	public MortgageOrientationFinancialSituationPage(SharedObjects so) {
		        
		_so = so;
		myElements = new MYElements(_so);
    }
	
	public MortgageOrientationFinancialSituationPage setRetiringWithinTenYears(String retiringWithinTenYearsYesOrNo) {
		
		switch(retiringWithinTenYearsYesOrNo.toLowerCase()) {
		case "yes":
			myElements.click(textLabelRetireWithInTenYearsYes);
			break;
		case "no":
			myElements.click(textLabelRetireWithInTenYearsNo);
			break;
		default:
			_so.extentTest.error("Unknown value specified for 'retiring within ten years': " + retiringWithinTenYearsYesOrNo);
			Assert.fail();
		}
		return this;
	}
	
	public MortgageOrientationFinancialSituationPage setPartnerRetiringWithinTenYears(String partnerRetiringWithinTenYearsYesOrNo) {
		
		switch(partnerRetiringWithinTenYearsYesOrNo.toLowerCase()) {
		case "yes":
			myElements.click(textLabelPartnerRetireWithInTenYearsYes);
			break;
		case "no":
			myElements.click(textLabelPartnerRetireWithInTenYearsNo);
			break;
		default:
			_so.extentTest.error("Unknown value specified for 'partner retiring within ten years': " + partnerRetiringWithinTenYearsYesOrNo);
			Assert.fail();
		}
		return this;
	}
	
	public MortgageOrientationFinancialSituationPage setPartnerDateOfBirth(String partnerDateOfBirth) {
		
		myElements.sendKeys(textFieldPartnerDateOfBirth, partnerDateOfBirth);
		return this;
	}
	
	public MortgageOrientationFinancialSituationPage setCapital(String capital) {
		
		myElements.sendKeys(textFieldCapital, capital);
		return this;
	}
	
	public MortgageOrientationFinancialSituationPage setPartnerRetirementIncomeIsKnown() {
		
		myElements.click(textLabelPartnerRetirementIncomeKnown);
		return this;
	}
	
	public MortgageOrientationFinancialSituationPage setPartnerRetirementIncome(String partnerRetirementIncome) {
		
		myElements.sendKeys(textFieldPartnerRetirementIncome, partnerRetirementIncome);
		return this;
	}
	
	public MortgageOrientationFinancialSituationPage setFinancialCommitment(String financialCommitmentYesOrNo) {
		
		switch(financialCommitmentYesOrNo.toLowerCase()) {
		case "yes":
			myElements.click(textLabelFinancialCommitmentYes);
			break;
		case "no":
			myElements.click(textLabelFinancialCommitmentNo);
			break;
		default:
			_so.extentTest.error("Unknown value specified for 'financial commitment': " + financialCommitmentYesOrNo);
			Assert.fail();
		}
		return this;
	}
	
	public MortgageOrientationFinancialSituationPage setDefaultFinancialCommitmentInfo() {
		
		myElements.sendKeys(textFieldMonthlyLoans, "100");
		myElements.sendKeys(textFieldMonthlyAlimony, "0");
		myElements.sendKeys(textFieldStudentLoan, "1000");
		myElements.sendKeys(textFieldPartnerMonthlyLoans, "100");
		myElements.sendKeys(textFieldPartnerMonthlyAlimony, "0");
		myElements.sendKeys(textFieldPartnerStudentLoan, "1000");
		return this;
	}

	public void clickButtonNextStep() {
		
		myElements.click(buttonNextStep);
	}
}
