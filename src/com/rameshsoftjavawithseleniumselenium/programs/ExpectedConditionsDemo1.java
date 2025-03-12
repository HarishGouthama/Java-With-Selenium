package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExpectedConditionsDemo1
{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException
	{
		WebElement username = driver.findElement(By.id("identifierId"));
		username.clear();
		username.sendKeys("haarsh21@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(30000);
		driver.findElement(By.id("Passwd")).sendKeys("*********");
		driver.findElement(By.id("identifierNext")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'compose')]")));
		driver.findElement(By.xpath("//div[contains(text() , 'compose')]")).click();
	}
}
