package com.rameshsoftautomation.TestngPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class ParametersDemo
{
	@Parameters({"phoneNumber" , "password"})
	@Test
	public void Facebooklogin(String phoneNumber , String password) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		emailField.sendKeys(phoneNumber);
		
		WebElement passWord = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		passWord.sendKeys(password);
		
		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		loginButton.click();
	}
}
