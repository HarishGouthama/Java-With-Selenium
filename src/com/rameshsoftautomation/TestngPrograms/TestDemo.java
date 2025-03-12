package com.rameshsoftautomation.TestngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestDemo {
	@Test
	public void login() {
		DriverUtility.openBrowser("chrome");
		DriverUtility.getDriver().get("https://www.gmail.com");
		
		WebElement username = DriverUtility.getDriver().findElement(By.id("identifierId1"));
		
		username.clear();
		username.sendKeys("harish1992.it@gmail.com");
	}
}
