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
	
	public void assertFalse(boolean valueToAssert, String reportingMessage) {
		
		try {
			Assert.assertFalse(valueToAssert);
			_so.extentTest.pass(reportingMessage);
		}
		catch (AssertionError ae) {
			_so.extentTest.fail("AssertFalse failed when evaluating check '" + reportingMessage + "'", MYReporting.getScreenshot(_so.driver));
			throw new AssertionError(reportingMessage);
		}		
	}
	
	public void assertEquals(String expectedValue, String actualValue, String reportingMessage) {
		
		try {
			Assert.assertEquals(expectedValue, actualValue);
			_so.extentTest.pass(reportingMessage);
		}
		catch (AssertionError ae) {
			_so.extentTest.fail("AssertEquals failed when evaluating check '" + reportingMessage + "', actual value was '" + actualValue + "', where '" + expectedValue + "' was expected", MYReporting.getScreenshot(_so.driver));
			throw new AssertionError(reportingMessage);
		}		
	}
	
	public void assertEquals(long expectedValue, long actualValue, String reportingMessage) {
		
		try {
			Assert.assertEquals(expectedValue, actualValue);
			_so.extentTest.pass(reportingMessage);
		}
		catch (AssertionError ae) {
			_so.extentTest.fail("AssertEquals failed when evaluating check '" + reportingMessage + "', actual value was " + actualValue + ", where " + expectedValue + " was expected", MYReporting.getScreenshot(_so.driver));
			throw new AssertionError(reportingMessage);
		}		
	}
}
