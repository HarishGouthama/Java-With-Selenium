package com.rameshsoftjavawithseleniumselenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
        //System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

        /*FirefoxOptions options = new FirefoxOptions();
        options.setProxy(null);

        WebDriver driver = new FirefoxDriver(options);*/
    	WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.gmail.com");

        WebElement ele_username = driver.findElement(By.id("identifierId"));
        ele_username.clear();
        ele_username.sendKeys("haarsh21@gmail.com");
        driver.findElement(By.id("identifierNext")).click();

        Thread.sleep(5000);
        
        WebElement ele_password = driver.findElement(By.id("password"));
        ele_password.clear();
        ele_password.sendKeys("*********");
        
        driver.findElement(By.id("signIn")).click();
        Thread.sleep(5000);
        driver.quit();
        
        driver.quit();
    }
}









/* org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.gmail.com");
		
		WebElement ele_username = driver.findElement(By.id("identifierId"));
		
		ele_username.clear();
		
		ele_username.sendKeys("haarsh21@gmail.com");
		
		driver.findElement(By.id("next")).click();
		
		Thread.sleep(5000);

	}
}
*/