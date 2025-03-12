package com.rameshsoftautomation.TestngPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGDemoOne
{
	public class TestNGDemo
	{
		WebDriver driver;
		
		@BeforeSuite
		public void openBrowser()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		
		@AfterSuite
		public void closeBrowser()
		{
			driver.quit();
		}
		
		@Test
		public void main()
		{
			driver.get("https://www.flipkart.com");
			System.out.println("FlipKart");
		}
	}
}
