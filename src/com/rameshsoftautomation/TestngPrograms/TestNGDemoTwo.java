package com.rameshsoftautomation.TestngPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNGDemoTwo 
{
	WebDriver driver ;
	
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("BeforeSuite");
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		System.out.println("AfterSuite");
		driver.quit();
	}
	
	@Test(priority = 2 , enabled = true)
	public void amain()
	{
		System.out.println("Test");
		driver.get("https://www.facebook.com");
		System.out.println("FaceBook");
	}
	
	@Test(priority = 1 , enabled = false)
	public void gmain()
	{
		System.out.println("Test");
		driver.get("https://www.gmail.com");
	}
	
	@Test(priority = 0)
	public void bmain()
	{
		System.out.println("Test");
		driver.get("https://www.google.com");
		System.out.println("google");
	}
}
