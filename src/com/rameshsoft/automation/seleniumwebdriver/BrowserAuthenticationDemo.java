/*package com.rameshsoft.automation.seleniumwebdriver;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAuthenticationDemo {
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        try {
            // Navigate to URL with Basic Authentication (may require additional tools or libraries)
            driver.get("http://seleniumrealtime:9177791456@www.rameshsoft.com");
            Thread.sleep(2000);

            // Navigate to another website
            driver.get("https://rameshselenium.blogspot.in/");

            // Try clicking an element and take a screenshot if it fails
            try {
                driver.findElement(By.id("a")).click();
            } catch (Exception e) {
                takeScreenshot(driver); // Pass driver as a parameter
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    // Static method to take a screenshot
    public static void takeScreenshot(WebDriver driver) {
        try {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File img = takesScreenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(img, new File("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\screenshots\\Image.png"));
            System.out.println("Screenshot captured successfully.");
        } catch (IOException e) {
            System.err.println("Failed to save screenshot: " + e.getMessage());
        }
    }
}*/




package com.rameshsoft.automation.seleniumwebdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAuthenticationDemo {
public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://seleniumrealtime:9177791456@www.rameshsoft.com");
	Thread.sleep(2000);
	
	
	driver.get("https://rameshselenium.blogspot.in/");
	try {
		driver.findElement(By.id("a")).click();
	}catch (Exception e) {
		takeScreenshot(driver);
	}
	driver.quit();
}
	
	public static  void takeScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File img = takescreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img, new File("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\screenshots\\Image.png"));
	}
}

