package com.rameshsoftjavawithseleniumselenium.programs;

//import java.awt.List;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class MultipleWindowsDemo
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver" , "D:\\\\RameshSoft2directory\\\\Rameshsoft Revision\\\\RameshSoftRevision\\\\Drivers\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.bing.com");
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium ");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text() , 'selenium download')]"))).click();
		
		//driver.findElement(By.linkText("outlook.com")).click();
		
		String firstWindow = driver.getWindowHandle();
		
		System.out.println("First window name is: " + firstWindow);
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator iterator = windows.iterator();
		
		while(iterator.hasNext())
		{
			String window = (String) iterator.next();
			
			if(!window.equalsIgnoreCase(firstWindow))
			{
				driver.switchTo().window(window);
				break;
			}
		}
		
		driver.findElement(By.id("idA_pwd_ForgotPassword")).click();
		String secondWindow = driver.getWindowHandle();
		System.out.println("Second window name is : " +secondWindow);
		driver.quit();
	}
}
