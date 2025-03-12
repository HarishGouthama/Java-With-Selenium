package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		
		Actions actions = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//*[text() = 'Electronics']"));
		
		actions.moveToElement(element).build().perform();
		
		driver.quit();
	}
}
