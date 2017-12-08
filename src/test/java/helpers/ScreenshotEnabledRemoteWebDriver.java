package helpers;

import java.net.URL;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;

public class ScreenshotEnabledRemoteWebDriver extends RemoteWebDriver implements TakesScreenshot {

	public ScreenshotEnabledRemoteWebDriver(URL url, DesiredCapabilities dc) {
		super(url, dc);
	}

	@Override
	public <T> T getScreenshotAs(OutputType<T> target)
			throws WebDriverException {
		if ((Boolean) getCapabilities().getCapability(CapabilityType.TAKES_SCREENSHOT)) {
		    return target.convertFromBase64Png(execute(DriverCommand.SCREENSHOT).getValue().toString());
		}
		return null;
	}
}
