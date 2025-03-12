package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(56, TimeUnit.SECONDS);

        driver.get("https://www.google.com");

        // Enter search query and submit using the Enter key
        driver.findElement(By.name("q")).sendKeys("Selenium by Ramesh" + Keys.ENTER);

        Actions actions = new Actions(driver);

        // Using Actions class to perform keyboard actions
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).build().perform();
        actions.sendKeys(Keys.PAGE_UP).build().perform();
        actions.sendKeys(Keys.HOME).build().perform();
        actions.sendKeys(Keys.END).build().perform();

        driver.quit();
    }
}




/*package com.rameshsoftSelenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardDemo
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(56, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium by Ramesh");
		
		driver.findElement(By.name("btnK")).click();
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		actions.sendKeys(Keys.PAGE_DOWN , Keys.PAGE_DOWN).build().perform();
		
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		
		actions.sendKeys(Keys.HOME).build().perform();
		
		actions.sendKeys(Keys.END).build().perform();
	}
}
*/