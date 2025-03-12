package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesAttributeDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://www.jqueryui.com");
		
		driver.findElement(By.linkText("Autocomplete")).click();
		
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			WebElement element = (WebElement) iterator.next();
			String id = element.getAttribute("id");
			
			System.out.println("Frame id is : " + id);
			
			String Class = element.getAttribute("class");
			
			System.out.println("Frame class is : " + Class);
			
			String src = element.getAttribute("src");
			
			System.out.println("Frame src is : " + src);
		}
		
		driver.switchTo().frame(0);
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@class = 'demo-frame']")));
		
		driver.findElement(By.id("tags")).sendKeys("Selenium");
		
		Thread.sleep(2000);
	}
}
