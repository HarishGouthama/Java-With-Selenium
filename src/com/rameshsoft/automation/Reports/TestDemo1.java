package com.rameshsoft.automation.Reports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo1 {

	@Test
	public void testScript() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Reporter.log("Firefox browser is launched");
		driver.manage().window().maximize();
		Reporter.log("Window is maximized");
		driver.manage().deleteAllCookies();
		Reporter.log("Deleted all cookies");
		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
		
		Reporter.log("Gmail application is opened");
		
		driver.findElement(By.id("identifierId")).sendKeys("harish1992.it@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		
		Reporter.log("clicked");
		Thread.sleep(5000);
		driver.quit();
	}

}
