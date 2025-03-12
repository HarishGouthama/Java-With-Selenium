package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ControlShiftOperationsDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.chord(Keys.CONTROL , "s")).build().perform();
		
		actions.sendKeys(Keys.chord(Keys.CONTROL , Keys.SHIFT , "s")).build().perform();
		
		Thread.sleep(10000);
		driver.quit();
		
	}
}
