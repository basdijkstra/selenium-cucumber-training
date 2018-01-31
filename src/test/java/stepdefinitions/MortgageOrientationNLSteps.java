package stepdefinitions;

import pages.mortgageorientation.*;
import globals.*;
import helpers.MYAssert;
import cucumber.api.java.en.*;
import dataentities.MortgageClientNL;

public class MortgageOrientationNLSteps extends SharedObjects {
	
	private SharedObjects _so;
	private MYAssert myAssert;
	
	public MortgageOrientationNLSteps(SharedObjects sharedObjects) {
		
		_so = sharedObjects;
		myAssert = new MYAssert(_so);
	}
	
	@Given("^(.*) is trying to finance a mortgage on his own$")
	public void is_trying_to_finance_a_mortgage_on_his_own(String applicantName) throws Throwable {
			
		_so.mortgageClientNL = new MortgageClientNL();
	}
	
	@Given("^(.*) and (.*) are trying to finance a mortgage together$")
	public void are_trying_to_finance_a_mortgage_together(String applicantName, String jointApplicantName) throws Throwable {
			
		_so.mortgageClientNL = new MortgageClientNL();
		_so.jointMortgageClientNL = new MortgageClientNL();
	}
	
	@But("^his financial situation is not mortgage ready$")
	public void his_financial_situation_is_not_mortgage_ready() throws Throwable {
		
		// This is the default setup, no changes needed
	}
	
	@But("^their financial situation is not mortgage ready$")
	public void their_financial_situation_is_not_mortgage_ready() throws Throwable {
		
		_so.mortgageClientNL.setRequestAloneOrTogether("TOGETHER");
		_so.mortgageClientNL.setSavings("0");
		_so.jointMortgageClientNL.setContractType("Tijdelijk dienstverband");
		_so.jointMortgageClientNL.setYearlyGrossIncome("5000");
		_so.jointMortgageClientNL.setRetiringSoon("YES");
	}
	
	@And("^he has a house to sell$")
	public void he_has_a_house_to_sell() throws Throwable {
		
		_so.mortgageClientNL.setAlreadyHadHouse("YES");
	}
	
	@And("^their financial situation is mortgage ready$")
	public void their_financial_situation_is_mortgage_ready() throws Throwable {
		
		_so.mortgageClientNL.setRequestAloneOrTogether("TOGETHER");
		_so.mortgageClientNL.setAlreadyHadHouse("YES");
		_so.mortgageClientNL.setHasLoans("YES");
		_so.jointMortgageClientNL.setContractType("Tijdelijk dienstverband");
		_so.jointMortgageClientNL.setYearlyGrossIncome("30000");
	}
	
	@When("^he completes the mortgage orientation tool$")
	public void he_completes_the_mortgage_orientation_tool() throws Throwable {
		
		new MortgageOrientationStartPage(_so).
			setRequestAloneOrTogether(_so.mortgageClientNL.getRequestAloneOrTogether()).
			selectContractType(_so.mortgageClientNL.getContractType()).
			setGrossIncome(_so.mortgageClientNL.getYearlyGrossIncome()).
			setAskingPrice(_so.mortgageClientNL.getPurchasePrice()).
			clickButtonNextStep();
		
		new MortgageOrientationFinancialSituationPage(_so).
			setRetiringWithinTenYears(_so.mortgageClientNL.getRetiringSoon()).
			setCapital(_so.mortgageClientNL.getSavings()).
			setFinancialCommitment(_so.mortgageClientNL.getHasLoans()).
			clickButtonNextStep();
		
		new MortgageOrientationHouseInfoPage(_so).
			setHouseType(_so.mortgageClientNL.getKindOfHouse()).
			setRenovationCost(_so.mortgageClientNL.getRenovationCosts()).
			setCurrentlyHomeOwner(_so.mortgageClientNL.getAlreadyHadHouse()).
			clickButtonNextStep();
	}
	
	@When("^he completes the mortgage orientation tool including info about his current house$")
	public void he_completes_the_mortgage_orientation_tool_including_info_about_his_current_house() throws Throwable {
		
		new MortgageOrientationStartPage(_so).
			setRequestAloneOrTogether(_so.mortgageClientNL.getRequestAloneOrTogether()).
			selectContractType(_so.mortgageClientNL.getContractType()).
			setGrossIncome(_so.mortgageClientNL.getYearlyGrossIncome()).
			setAskingPrice(_so.mortgageClientNL.getPurchasePrice()).
			clickButtonNextStep();
		
		new MortgageOrientationFinancialSituationPage(_so).
			setRetiringWithinTenYears(_so.mortgageClientNL.getRetiringSoon()).
			setCapital(_so.mortgageClientNL.getSavings()).
			setFinancialCommitment(_so.mortgageClientNL.getHasLoans()).
			clickButtonNextStep();
		
		new MortgageOrientationHouseInfoPage(_so).
			setHouseType(_so.mortgageClientNL.getKindOfHouse()).
			setRenovationCost(_so.mortgageClientNL.getRenovationCosts()).
			setCurrentlyHomeOwner(_so.mortgageClientNL.getAlreadyHadHouse()).
			setCurrentHouseSalePrice(_so.mortgageClientNL.getCurrentHouseSellingPrice()).
			setCurrentMortgage(_so.mortgageClientNL.getCurrentMortgage()).
			setCurrentMortgageStartDate(_so.mortgageClientNL.getCurrentMortgageStartDate()).
			clickButtonNextStep();
	}
	
	@When("^they complete the mortgage orientation tool$")
	public void they_complete_the_mortgage_orientation_tool() throws Throwable {
		
		new MortgageOrientationStartPage(_so).
			setRequestAloneOrTogether(_so.mortgageClientNL.getRequestAloneOrTogether()).
			selectContractType(_so.mortgageClientNL.getContractType()).
			setGrossIncome(_so.mortgageClientNL.getYearlyGrossIncome()).
			setContractTypePartner(_so.jointMortgageClientNL.getContractType()).
			setGrossIncomePartner(_so.jointMortgageClientNL.getYearlyGrossIncome()).
			setAskingPrice(_so.mortgageClientNL.getPurchasePrice()).
			clickButtonNextStep();
		
		new MortgageOrientationFinancialSituationPage(_so).
			setRetiringWithinTenYears(_so.mortgageClientNL.getRetiringSoon()).
			setPartnerRetiringWithinTenYears(_so.jointMortgageClientNL.getRetiringSoon()).
			setPartnerDateOfBirth(_so.jointMortgageClientNL.getDateOfBirth()).
			setPartnerRetirementIncomeIsKnown().
			setPartnerRetirementIncome(_so.jointMortgageClientNL.getRetirementIncome()).
			setCapital(_so.mortgageClientNL.getSavings()).
			setFinancialCommitment(_so.mortgageClientNL.getHasLoans()).
			clickButtonNextStep();
		
		new MortgageOrientationHouseInfoPage(_so).
			setHouseType(_so.mortgageClientNL.getKindOfHouse()).
			setRenovationCost(_so.mortgageClientNL.getRenovationCosts()).
			setCurrentlyHomeOwner(_so.mortgageClientNL.getAlreadyHadHouse()).
			clickButtonNextStep();
	}
	
	@When("^they complete the mortgage orientation tool including info about their current house and loans$")
	public void they_complete_the_mortgage_orientation_tool_including_info_about_their_current_house_and_loans() throws Throwable {
		
		new MortgageOrientationStartPage(_so).
			setRequestAloneOrTogether(_so.mortgageClientNL.getRequestAloneOrTogether()).
			selectContractType(_so.mortgageClientNL.getContractType()).
			setGrossIncome(_so.mortgageClientNL.getYearlyGrossIncome()).
			setContractTypePartner(_so.jointMortgageClientNL.getContractType()).
			setGrossIncomePartner(_so.jointMortgageClientNL.getYearlyGrossIncome()).
			setAskingPrice(_so.mortgageClientNL.getPurchasePrice()).
			clickButtonNextStep();
		
		new MortgageOrientationFinancialSituationPage(_so).
			setRetiringWithinTenYears(_so.mortgageClientNL.getRetiringSoon()).
			setPartnerRetiringWithinTenYears(_so.jointMortgageClientNL.getRetiringSoon()).
			setCapital(_so.mortgageClientNL.getSavings()).
			setFinancialCommitment(_so.mortgageClientNL.getHasLoans()).
			setDefaultFinancialCommitmentInfo().
			clickButtonNextStep();
		
		new MortgageOrientationHouseInfoPage(_so).
			setHouseType(_so.mortgageClientNL.getKindOfHouse()).
			setRenovationCost(_so.mortgageClientNL.getRenovationCosts()).
			setCurrentlyHomeOwner(_so.mortgageClientNL.getAlreadyHadHouse()).
			setCurrentHouseSalePrice(_so.mortgageClientNL.getCurrentHouseSellingPrice()).
			setCurrentMortgage(_so.mortgageClientNL.getCurrentMortgage()).
			setCurrentMortgageStartDate(_so.mortgageClientNL.getCurrentMortgageStartDate()).
			clickButtonNextStep();
	}

	@Then("^(.*) sees that he is not eligible for a mortgage$")
	public void sees_that_he_is_not_eligible_for_a_mortgage(String applicantName) throws Throwable {
		
		myAssert.assertTrue(new MortgageOrientationResultPage(_so).noMortgagePossibleTextIsVisible(), applicantName + " is not eligible for a mortgage under his current financial situation");
	}
	
	@Then("^(.*) sees that he is eligible for a mortgage$")
	public void sees_that_he_is_eligible_for_a_mortgage(String applicantName) throws Throwable {
		
		myAssert.assertTrue(new MortgageOrientationResultPage(_so).mortgagePossibleTextIsVisible(), applicantName + " is eligible for a mortgage under his current financial situation");
	}
	
	@Then("^(.*) and (.*) see that they are not eligible for a mortgage$")
	public void see_that_they_are_not_eligible_for_a_mortgage(String applicantName, String partnerApplicantName) throws Throwable {
		
		myAssert.assertTrue(new MortgageOrientationResultPage(_so).noMortgagePossibleTextIsVisibleJoint(), applicantName + " and " + partnerApplicantName + " are not eligible for a mortgage under their current financial situation");
	}
	
	@Then("^(.*) and (.*) see that they are eligible for a mortgage$")
	public void see_that_they_are_eligible_for_a_mortgage(String applicantName, String partnerApplicantName) throws Throwable {
		
		myAssert.assertTrue(new MortgageOrientationResultPage(_so).mortgagePossibleTextIsVisibleJoint(), applicantName + " and " + partnerApplicantName + " are eligible for a mortgage under their current financial situation");
	}

	@Then("^he is able to select a fixed interest period$")
	public void test() throws Throwable {

	}
}
