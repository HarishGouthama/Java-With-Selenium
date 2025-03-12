package com.rameshsoftautomation.TestngPrograms;

/*import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class ScreenShotDemo {
    WebDriver d;

    @BeforeMethod
    public void beforeMethod(Method m) {
        System.out.println("Executing the test: " + m.getName());
    }

    @Test
    public void login() {
        System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\chromedriver.exe");
        d = new ChromeDriver();
        d.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
        d.get("https://www.gmail.com");
        d.findElement(By.id("identifierI")).sendKeys("rameshsoft.selenium");
    }

    @AfterMethod
    public void afterMethod(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus() && d != null) {
            TakesScreenshot ts = (TakesScreenshot) d;
            File file = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\screenshots\\" + result.getName() + ".jpeg"));
        }
        if (d != null) {
            d.quit();
        }
    }
}





*/




import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class ScreenShotDemo
{
	WebDriver d;
	
	@Test
	public void login()
	{		
		System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
		d.get("https://www.gmail.com");
		d.findElement(By.id("identifierI")).sendKeys("rameshsoft.selenium");
	}
	
	@BeforeMethod
	public void beforeMethod(Method m)
	{
		System.out.println("Executing the test");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE == result.getStatus() && d != null)
		{
			TakesScreenshot ts = (TakesScreenshot) d;
			File file = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\screenshots" + result.getName() + ".jpeg"));
		}
		if(d != null) {
			d.quit();
		}
	}
}
