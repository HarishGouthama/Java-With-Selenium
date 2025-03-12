package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizeDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("rameshsoft.selenium@gmail.com");
		
		driver.findElement(By.id("identifierNext")).click();;
		
		WebDriverWait wait = new WebDriverWait(driver, 58);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("password"))));
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
