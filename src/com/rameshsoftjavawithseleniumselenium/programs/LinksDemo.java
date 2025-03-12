package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.AbstractParallelWorker.Arguments;

public class LinksDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		int enabledLinks = 0;
		int disabledLinks = 0;
		
		System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(56, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		WebElement ele =  driver.findElement(By.xpath("//textarea[@name = 'q']"));
		ele.sendKeys("Rameshsoft with selenium");
		
		/*WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		element.click();*/

		
		WebElement element = driver.findElement(By.xpath("//input[@name = 'btnK']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();" , element);
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links);
		
		int totalLinks = links.size();
		
		System.out.println("Total no links are: " + totalLinks);
		
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
		
		Iterator iterator = links.iterator();
		
		while(iterator.hasNext())
		{
			WebElement link = (WebElement) iterator.next();
			if(link.isDisplayed() && link.isEnabled())
			{
				enabledLinks++ ; 
			}
			else
			{
				disabledLinks++;
			}
			
			System.out.println("Enabled links are : " + enabledLinks);
			System.out.println("Disabled links are : " + disabledLinks);
			
			int total = enabledLinks + disabledLinks;
			
			if(total == totalLinks)
			{
				System.out.println("Count is matching");
			}
			else
			{
				System.out.println("Count is not matching");
			}
			
			Thread.sleep(5000);
		
		}
		
	}
}
