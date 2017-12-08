package helpers;

import globals.Globals;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.model.Media;

public class MYReporting {
	
	public static MediaEntityModelProvider getScreenshot(WebDriver driver) {
		
		MediaEntityModelProvider memp = new MediaEntityModelProvider(new Media());
		
		try {
			memp = MediaEntityBuilder.createScreenCaptureFromPath(getScreenShot(driver)).build();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return memp;
	}
	
	public static String getScreenShot(WebDriver driver) {
				
		String filePath = Globals.EXTENTREPORTS_IMAGES_FOLDER + UUID.randomUUID() + ".png";
				
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screenshotFile, new File(Globals.EXTENTREPORTS_FOLDER + filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return filePath;
	}

}
