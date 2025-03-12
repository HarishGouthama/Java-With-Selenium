package com.rameshsoftautomation.TestngPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverEngine
{
	public static WebDriver driver;
	
	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			openBrowser();
		}
		return driver;
	}
	
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.close();
	}
}
