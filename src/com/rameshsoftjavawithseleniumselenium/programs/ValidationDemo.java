/*package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ValidationDemo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver , 10);
		WebElement logo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id = 'hplogo']")));
		Assert.assertTrue(logo.isDisplayed(), "Google logo is not displayed");
		System.out.println("Google logo is displayed " + logo.isDisplayed());
		
		WebElement logo = driver.findElement(By.xpath("//*[@id = 'hplogo']"));
		Assert.assertTrue(logo.isDisplayed() , "Google logo is not displayed");
		
		System.out.println("webelement text is: " + text);
		Assert.assertTrue(true, text);
		Assert.assertFalse(false , text);
		
		//System.out.println("Google logo is displayed " + logo.isDisplayed());
		driver.quit();
	}
}
*/


package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ValidationDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in");

        // Optional delay to ensure the page is fully loaded
        try {
            Thread.sleep(2000); // 2 seconds delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Use WebDriverWait to wait for the element to be present
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement logo = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#hplogo")));

        // Perform actions on the element
        Assert.assertTrue(logo.isDisplayed(), "Google logo is not displayed");
        System.out.println("Google logo is displayed: " + logo.isDisplayed());

        driver.quit();
    }
}
