@mortgage @mortgage-orientation-api
Feature: Calculate mortgage estimate
	As a Dutch prospective house owner
	I want to see a mortgage calculation estimate
	So that I can potentially start the mortgage application process

	@ignore
	Scenario: Mortgage orientation intermediary calculation based on income and house price
		Given Bert is trying to finance a mortgage as a single applicant
		And he has an employment type Vast dienstverband
		And he earns 60000 euros per annum
		And he wants to buy a house with an asking price of 150000
		When he enters these details in the mortgage orientation tool
		Then he sees that the maximum mortgage amount is 299271