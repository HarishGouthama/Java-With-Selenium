package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(56, TimeUnit.SECONDS);
		
		driver.get("https://www.jqueryui.com");
		driver.findElement(By.linkText("Autocomplete")).click();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		//driver.switchTo().frame(0);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class = 'demo-frame']")));
		
		driver.findElement(By.id("tags")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Datepicker")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
