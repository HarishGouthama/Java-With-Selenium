package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		WebElement createAccount = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
		createAccount.click();
		
		WebElement ele_day = driver.findElement(By.id("day"));
		
		Select select = new Select(ele_day);
		
		select.selectByIndex(5);
		
		Thread.sleep(3000);
		
		WebElement ele_month = driver.findElement(By.id("month"));
		
		Select select1 = new Select(ele_month);		
		
		select1.selectByValue("january");
		
		WebElement ele_year = driver.findElement(By.id("year"));
		
		Select select2 = new Select(ele_year);
		
		select2.selectByValue("1992");
		
		driver.quit();
	}
}
