package globals;

import org.openqa.selenium.By;

public class Globals {

	public static final int DEFAULT_TIMEOUT = 30;
	public static final int MODAL_TIMEOUT = 5;
	
	public static final String USERNAME_PREFIX = "at";
	public static final String DEFAULT_EMAIL_DOMAIN = "@gmail.com";
	public static final String DEFAULT_PASSWORD = "Test1234";
	
	public static final String EXTENTREPORTS_FOLDER = "target/extentreports/";
	public static final String EXTENTREPORTS_IMAGES_FOLDER = "images/";

	public static final By BY_MODAL_PATIENCE = By.xpath("//div[contains(@class,'modal-patience')]");
	public static final By BY_MODAL_BACKDROP = By.xpath("//div[contains(@class,'modal-backdrop')]");
	
	public static final String MORTGAGE_ORIENTATION_NL = "https://www.moneyou.nl/hypotheek/berekenen/bereken-je-maximale-hypotheek";
	
}