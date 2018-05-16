package stepdefinitions;

import cucumber.api.java.en.*;
import dataentities.MortgageClientNL;
import dataentities.OrientationFieldOperation;
import globals.SharedObjects;
import helpers.MYAssert;
import io.restassured.http.ContentType;
import pages.mortgageorientation.MortgageOrientationFinancialSituationPage;
import pages.mortgageorientation.MortgageOrientationHouseInfoPage;
import pages.mortgageorientation.MortgageOrientationResultPage;
import pages.mortgageorientation.MortgageOrientationStartPage;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class MortgageOrientationApiSteps extends SharedObjects {

	private SharedObjects _so;
	private MYAssert myAssert;

	public MortgageOrientationApiSteps(SharedObjects sharedObjects) {
		
		_so = sharedObjects;
		myAssert = new MYAssert(_so);
	}

	@Given("^(.*) is trying to finance a mortgage as a single applicant$")
	public void is_trying_to_finance_a_mortgage_as_a_single_applicant(String applicantName) throws Throwable {

		OrientationFieldOperation ofo = new OrientationFieldOperation();
		ofo.setFieldName("application");
		ofo.setSessionId(_so.apiSessionId);
		ofo.setTaskType("FIELDUPDATE");
		ofo.setValue("Single");

		given().log().body().and().
		    relaxedHTTPSValidation().
		and().
			contentType(ContentType.JSON).
		and().
			body(ofo).
		when().
			post("https://www.moneyou.nl/mortgageapi/Orientation/SaveOrientationField").
		then().
			assertThat().
			statusCode(200);
	}
}
