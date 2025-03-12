package com.rameshsoftautomation.TestngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.rameshsoftautomation.TestngPrograms.DriverEngine;
public class FacebookTest
{
	@Test
	public void main()
	{
		DriverEngine.openBrowser();	
		WebDriver driver = DriverEngine.getDriver();
		DriverEngine.driver.get("https://www.facebook.com");
		WebElement element = DriverEngine.driver.findElement(By.id("emai"));
		element.clear();
		element.sendKeys("rameshsoft.selenium@gmail.com");
	}
}
