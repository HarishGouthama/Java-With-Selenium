package com.rameshsoftautomation.TestngPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserDemo 
{
	WebDriver driver;
	
	@BeforeSuite
	@Parameters("browser")
	public void openBrowser(String browser) {
	    System.out.println("Browser parameter received: " + browser);
	    
	    if (browser.equalsIgnoreCase("firefox")) {
	        System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
	        driver = new FirefoxDriver();
	    } else if (browser.equalsIgnoreCase("chrome")) {
	        System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	    } else if (browser.equalsIgnoreCase("edge")) {
	        System.setProperty("webdriver.edge.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\msedgedriver.exe");
	        driver = new EdgeDriver();
	    }
	    
	    else
	    {
	    	throw new IllegalArgumentException("Invalid browser parameter value: " + browser);
	    }
	}

	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@Test
	public void script()
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	}
}
