package com.rameshsoft.automation.InterfaceTypes;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface CommonUtility<T extends WebDriver> {
	public abstract<T> WebDriver getDriver();
	
	public static void screenshot(WebDriver driver , String path) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver; 
		File file = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path));
	}
	
	default boolean isVisible(WebElement element) {
		boolean b = true;
		try {
			element.isDisplayed();
		}
		catch (Exception e) {
			b = false;
		}
		return b;		
	}
}
