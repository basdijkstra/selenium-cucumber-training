@mortgage @mortgage-orientation
Feature: Calculate mortgage eligibility in the Netherlands
	As a Dutch prospective house owner
	I want check whether I am eligible for a mortgage with MoneYou
	So that I can potentially start the mortgage application process

	@testing
	Scenario: Single prospect is not eligible for a mortgage
		Given John is trying to finance a mortgage on his own
		But his financial situation is not mortgage ready
		When he completes the mortgage orientation tool
		Then John sees that he is not eligible for a mortgage
	
	Scenario: Single prospect has a house to sell and is eligible for a mortgage
		Given John is trying to finance a mortgage on his own
		And he has a house to sell
		When he completes the mortgage orientation tool including info about his current house 
		Then John sees that he is eligible for a mortgage
	
	Scenario: Joint prospects are not eligible for a mortgage
		Given John and Anna are trying to finance a mortgage together
		But their financial situation is not mortgage ready
		When they complete the mortgage orientation tool
		Then John and Anna see that they are not eligible for a mortgage
		
	Scenario: Joint prospects are eligible for a mortgage
		Given John and Anna are trying to finance a mortgage together
		And their financial situation is mortgage ready
		When they complete the mortgage orientation tool including info about their current house and loans
		Then John and Anna see that they are eligible for a mortgage