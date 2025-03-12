package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ScrollingPage 
{
	WebDriver webdriver;
	JavascriptExecutor js;
	
	@BeforeSuite
	public void launchingFirefoxBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\chromedriver.exe");
		//webdriver = new FirefoxDriver();
		webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		webdriver.manage().deleteAllCookies();
		webdriver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}
	
	@Test
	public void testScript() throws InterruptedException
	{
		webdriver.get("https://www.google.com");
		webdriver.findElement(By.name("q")).sendKeys("Selenium by ramesh");
		
		Thread.sleep(3000);
		WebElement searchbutton = webdriver.findElement(By.name("btnK"));
		js = (JavascriptExecutor) webdriver;
		js.executeScript("arguments[0].click();", searchbutton);
		
		webdriver.findElement(By.partialLinkText("Selenium : Selenium WebDriver By Ramesh Anapati")).click();
		
		//scrolling vertically down
		
		js.executeScript("window.scrollBy(0,10750)");
		
		//Thread.sleep(30000);
		
		//Scrolling vertical up
		
		js.executeScript("window.scrollBy(10850,0)");
		//Thread.sleep(20000);
		
		//Scrolling horizontal right
		js.executeScript("window.scrollBy(2000,0)","");
		
		//Scrolling horizontal left
		js.executeScript("window.scrollBy(-2000,0)","");
	}
	
	@AfterSuite
	public void closeBrowser() 
	{
		webdriver.quit();
	}
}
