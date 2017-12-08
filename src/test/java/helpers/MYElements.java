package helpers;

import java.io.File;
import java.util.ArrayList;

import globals.Globals;
import globals.SharedObjects;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.*;

public class MYElements {
	
	private SharedObjects _so;

	public MYElements(SharedObjects sharedObjects) {
		
		_so = sharedObjects;
	}
	
	public void get(String pageToLoad) {
		
		try {
			_so.driver.get(pageToLoad);
		}
		catch (TimeoutException te){
			_so.extentTest.error("Loading " + pageToLoad + " took more than " + Globals.DEFAULT_TIMEOUT + " seconds", MYReporting.getScreenshot(_so.driver));
			Assert.fail();
		}
	}
	
	public boolean waitForElementToBeVisible(By by) {
		
		try {
			new WebDriverWait(_so.driver, Globals.DEFAULT_TIMEOUT).until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		catch (TimeoutException te)
		{
			_so.extentTest.error("TimeoutException caught while waiting for element " + by.toString() + " to be visible", MYReporting.getScreenshot(_so.driver));
			return false;
		}
		return true;
	}
	
	public void click(By by) {
		
		checkPendingRequests("sendKeys", new EventFiringWebDriver(_so.driver));
		uglyWaitThatShouldBeAvoided(1000);
		
		try {
			new WebDriverWait(_so.driver, Globals.DEFAULT_TIMEOUT).until(ExpectedConditions.elementToBeClickable(by));
			_so.driver.findElement(by).click();
		}
		catch (TimeoutException te) {
			_so.extentTest.error("Timeout occurred when clicking on " + by.toString() + ": " + te.getMessage(), MYReporting.getScreenshot(_so.driver));
			Assert.fail();
		}
		catch (NoSuchElementException nse) {
			_so.extentTest.error("Element " + by.toString() + "could not be found: " + nse.getMessage(), MYReporting.getScreenshot(_so.driver));
			Assert.fail();
		}
		catch (WebDriverException wde) {
			
			for(int i = 1; i <= Globals.DEFAULT_TIMEOUT; i++) {
			
				try {
					uglyWaitThatShouldBeAvoided(1000);
					
					_so.driver.findElement(by).click();
					break;
				}
				catch (WebDriverException wdel){
					
					_so.extentTest.info("Caught WebDriverException iteration " + Integer.toString(i) + " for element " + by.toString() + ", caused by " + wdel.getMessage());					
				}
				
				if(i == Globals.DEFAULT_TIMEOUT) {
					_so.extentTest.error("Still experiencing WebDriverException after " + Globals.DEFAULT_TIMEOUT + " retries, exiting test...", MYReporting.getScreenshot(_so.driver));
					Assert.fail();
				}
			}
		}
	}

	public void select(By by, String valueToBeSelected) {
				
		checkPendingRequests("sendKeys", new EventFiringWebDriver(_so.driver));
		uglyWaitThatShouldBeAvoided(1000);

		try {
			new WebDriverWait(_so.driver, Globals.DEFAULT_TIMEOUT).until(ExpectedConditions.elementToBeClickable(by));
			new Select(_so.driver.findElement(by)).selectByVisibleText(valueToBeSelected);
		}
		catch (TimeoutException | NoSuchElementException ex) {
			_so.extentTest.error("Error occurred when trying to select '" + valueToBeSelected + "' from dropdown " + by.toString() + ", does this dropdown exist and does it contain the value to be selected?", MYReporting.getScreenshot(_so.driver));
			Assert.fail();
		}
	}

	public void sendKeys(By by, String textToSend) {
		
		checkPendingRequests("sendKeys", new EventFiringWebDriver(_so.driver));
		uglyWaitThatShouldBeAvoided(1000);

		try {
			new WebDriverWait(_so.driver, Globals.DEFAULT_TIMEOUT).until(ExpectedConditions.elementToBeClickable(by));
			WebElement element = _so.driver.findElement(by); 
			element.clear();
			element.sendKeys(textToSend);
		}
		catch (TimeoutException | NoSuchElementException ex) {
			_so.extentTest.error("Error in sendKeys(): Element " + by.toString() + " could not be found", MYReporting.getScreenshot(_so.driver));
			Assert.fail();
		}
		catch (ElementNotVisibleException enve) {
			
			_so.extentTest.info("Caught ElementNotVisibleException in sendKeys() for element " + by.toString() + ", probably because modal dialog blocks access to the element to be typed into: " + enve.getMessage(), MYReporting.getScreenshot(_so.driver));
			
			waitForModalToDisappear();
			
			WebElement element = _so.driver.findElement(by); 
			element.clear();
			element.sendKeys(textToSend);
		}
	}
	
	public boolean checkElementIsVisible(By by) {
		
		try {
			new WebDriverWait(_so.driver, Globals.DEFAULT_TIMEOUT).until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		catch (TimeoutException | NoSuchElementException ex) {
			_so.extentTest.error("Error in checkElementIsVisible(): Element " + by.toString() + " could not be found");
			return false;
		}
		return true;
	}

	public void waitForModalToDisappear() {
		
		try {
			new WebDriverWait(_so.driver, Globals.MODAL_TIMEOUT).until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated(Globals.BY_MODAL_PATIENCE),ExpectedConditions.presenceOfElementLocated(Globals.BY_MODAL_BACKDROP)));
			// modal is visible, wait until it disappears
			try {				
				new WebDriverWait(_so.driver, Globals.DEFAULT_TIMEOUT).until(ExpectedConditions.invisibilityOfElementLocated(Globals.BY_MODAL_PATIENCE));
				new WebDriverWait(_so.driver, Globals.DEFAULT_TIMEOUT).until(ExpectedConditions.invisibilityOfElementLocated(Globals.BY_MODAL_BACKDROP));
			}
			catch (TimeoutException ex) {
				_so.extentTest.error("WaitForModalToDisappear: Modal did not disappear after " + Globals.DEFAULT_TIMEOUT + " seconds", MYReporting.getScreenshot(_so.driver));
				Assert.fail();
			}
		}
		catch (TimeoutException | NoSuchElementException ex) {
			// modal is not visible, proceed!
		}
	}
	
	public void uglyWaitThatShouldBeAvoided(long durationInMilliSeconds) {
		
		try {
			Thread.sleep(durationInMilliSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void checkPendingRequests(final String context, final EventFiringWebDriver driver) {
		final int timeoutInNumberOfTries = 50;
		try {
			if (driver instanceof JavascriptExecutor) {
				final JavascriptExecutor jsDriver = driver;
				boolean timeout = true;
				for (int i = 0; i < timeoutInNumberOfTries; i++) {
					Thread.sleep(100);
					final Object numberOfAjaxConnections = jsDriver.executeScript("return window.openHTTPs");
					// return should be a number
					if (numberOfAjaxConnections instanceof Long) {
						final Long n = (Long) numberOfAjaxConnections;
						if (n.longValue() == 0L) {
							timeout = false;
							break;
						}
					} else {
						// If it's not a number, the page might have been freshly loaded indicating the monkey
						// patch is replaced or we haven't yet done the patch.
						monkeyPatchXMLHttpRequest(driver);
					}
				}
				if (timeout) {
					throw new RuntimeException("Pending XHR requests even after 50 times checking (100 msec) for:" + context);
				}
			} else {
				System.out.println("Web driver: " + driver + " cannot execute javascript");
			}
		} catch (final InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void monkeyPatchXMLHttpRequest(final EventFiringWebDriver driver) {
		try {
			if (driver instanceof JavascriptExecutor) {
				final JavascriptExecutor jsDriver = driver;
				final Object numberOfAjaxConnections = jsDriver.executeScript("return window.openHTTPs");
				if (numberOfAjaxConnections instanceof Long) {
					return;
				}
				final String script = "  (function() {" + "var oldOpen = XMLHttpRequest.prototype.open;" + "window.openHTTPs = 0;" +
						"XMLHttpRequest.prototype.open = function(method, url, async, user, pass) {" + "window.openHTTPs++;" +
						"this.addEventListener('readystatechange', function() {" + "if(this.readyState == 4) {" + "window.openHTTPs--;" + "}" +
						"}, false);" + "oldOpen.call(this, method, url, async, user, pass);" + "}" + "})();";
				jsDriver.executeScript(script);
			} else {
				System.out.println("Web driver: " + driver + " cannot execute javascript");
			}
		} catch (final Exception e) {
			System.out.println(e.getMessage());
		}
	}
}