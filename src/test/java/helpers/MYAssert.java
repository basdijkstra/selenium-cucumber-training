package helpers;

import globals.SharedObjects;

import org.junit.Assert;

public class MYAssert {

	private SharedObjects _so;
	
	public MYAssert(SharedObjects sharedObjects) {
		
		_so = sharedObjects;
	}
	
	public void assertTrue(boolean valueToAssert, String reportingMessage) {
		
		try {
			Assert.assertTrue(valueToAssert);
			_so.extentTest.pass(reportingMessage, MYReporting.getScreenshot(_so.driver));
		}
		catch (AssertionError ae) {
			_so.extentTest.fail("AssertTrue failed when evaluating check '" + reportingMessage + "'", MYReporting.getScreenshot(_so.driver));
			throw new AssertionError(reportingMessage);
		}		
	}
}
