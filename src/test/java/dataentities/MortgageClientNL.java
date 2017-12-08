package dataentities;

public class MortgageClientNL {
	
	String dateOfBirth;
	String contractType, yearlyGrossIncome;
	String requestAloneOrTogether, retiringSoon;
	String retirementIncome;
	String savings, hasLoans;
	String alreadyHadHouse, kindOfHouse;
	String purchasePrice, renovationCosts;
	String currentHouseSellingPrice, currentMortgage, currentMortgageStartDate;

	public MortgageClientNL() {
		
		this.dateOfBirth = "29051917";
		this.contractType = "Vast dienstverband";
		this.yearlyGrossIncome = "40000";
		this.retirementIncome = "20000";
		this.retiringSoon = "NO";
		this.savings = "10000";
		this.hasLoans = "NO";
		this.alreadyHadHouse = "NO";
		this.kindOfHouse = "Existing";
		this.purchasePrice = "200000";
		this.renovationCosts = "0";
		this.requestAloneOrTogether = "ALONE";
		this.currentHouseSellingPrice = "750000";
		this.currentMortgage = "1500";
		this.currentMortgageStartDate = "01012000";
	}

	public String getCurrentHouseSellingPrice() {
		return currentHouseSellingPrice;
	}

	public String getCurrentMortgage() {
		return currentMortgage;
	}

	public String getCurrentMortgageStartDate() {
		return currentMortgageStartDate;
	}

	public String getRetiringSoon() {
		return retiringSoon;
	}

	public void setRetiringSoon(String retiringSoon) {
		this.retiringSoon = retiringSoon;
	}

	public String getYearlyGrossIncome() {
		return yearlyGrossIncome;
	}

	public void setYearlyGrossIncome(String yearlyGrossIncome) {
		this.yearlyGrossIncome = yearlyGrossIncome;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getRequestAloneOrTogether() {
		return requestAloneOrTogether;
	}

	public void setRequestAloneOrTogether(String requestAloneOrTogether) {
		this.requestAloneOrTogether = requestAloneOrTogether;
	}

	public String getPurchasePrice() {
		return purchasePrice;
	}

	public String getRenovationCosts() {
		return renovationCosts;
	}

	public String getAlreadyHadHouse() {
		return alreadyHadHouse;
	}

	public void setAlreadyHadHouse(String alreadyHadHouse) {
		this.alreadyHadHouse = alreadyHadHouse;
	}

	public String getKindOfHouse() {
		return kindOfHouse;
	}

	public String getSavings() {
		return savings;
	}

	public void setSavings(String savings) {
		this.savings = savings;
	}

	public String getHasLoans() {
		return hasLoans;
	}

	public void setHasLoans(String hasLoans) {
		this.hasLoans = hasLoans;
	}

	public String getRetirementIncome() {
		return retirementIncome;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}
}
