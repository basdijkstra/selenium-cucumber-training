package pages.mortgageorientation;

import org.openqa.selenium.By;

import globals.SharedObjects;
import helpers.MYElements;

public class MortgageOrientationResultPage {
	
	private SharedObjects _so;
	private MYElements myElements;
	
	private By textLabelNoMortgagePossible = By.xpath("//p[contains(text(),'Op basis van de gegevens die je hebt ingevuld kan de woning helaas niet worden gefinancierd met de Moneyou Hypotheek.')]");
	private By textLabelMortgagePossible = By.xpath("//span[contains(text(),'Op basis van de gegevens die je hebt ingevuld, kun je je woning financieren met een MoneYou hypotheek.')]");
	private By textLabelNoMortgagePossibleJoint = By.xpath("//p[contains(text(),'Op basis van de gegevens die jullie hebben ingevuld, kunnen jullie je woning niet financieren met een MoneYou hypotheek.')]");
	private By textLabelMortgagePossibleJoint = By.xpath("//span[contains(text(),'Op basis van de gegevens die jullie hebben ingevuld, kunnen jullie je woning financieren met een MoneYou hypotheek.')]");
	private By textLabelMortgageInterest = By.xpath("//p[contains(@class,'mtg-interest-percentage')]");
	private By dropdownFixedInterestRate = By.id("fixedInterestTerm");
	
	public MortgageOrientationResultPage(SharedObjects so) {
		        
		_so = so;
		myElements = new MYElements(_so);
    }
	
	public Boolean noMortgagePossibleTextIsVisible() {
		
		return myElements.checkElementIsVisible(textLabelNoMortgagePossible);
	}
	
	public Boolean noMortgagePossibleTextIsVisibleJoint() {
				
		return myElements.checkElementIsVisible(textLabelNoMortgagePossibleJoint);
	}
	
	public Boolean mortgagePossibleTextIsVisible() {
		
		myElements.waitForElementToBeVisible(textLabelMortgageInterest);
		return myElements.checkElementIsVisible(textLabelMortgagePossible);
	}
	
	public Boolean mortgagePossibleTextIsVisibleJoint() {
		
		myElements.waitForElementToBeVisible(textLabelMortgageInterest);
		return myElements.checkElementIsVisible(textLabelMortgagePossibleJoint);
	}

	public MortgageOrientationResultPage selectFixedInterestRate(String fixedInterestRate) {

		myElements.select(dropdownFixedInterestRate, fixedInterestRate);
		return this;
	}
}
