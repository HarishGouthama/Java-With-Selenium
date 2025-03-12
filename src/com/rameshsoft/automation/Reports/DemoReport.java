package com.rameshsoft.automation.Reports;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DemoReport {
	public static ExtentReports extentReport;
	public static ExtentTest logger;
	public static WebDriver driver;
	
	@BeforeMethod
	public void method()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void verifyTitle()
	{
		extentReport = new ExtentReports("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Reports\\report1.html");
		logger = extentReport.startTest("DemoExtentReport");
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		logger.log(LogStatus.INFO, "Browser is launched");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		logger.log(LogStatus.INFO, "Browser is maximized");
		driver.get("https://www.googlee.com");
		String title = driver.getTitle();
		if (title.equals("google")) { // Replace "Google" with the expected title
            logger.log(LogStatus.PASS, "Title is verified successfully.");
        } else {
            logger.log(LogStatus.FAIL, "Title verification failed. Expected: Google, but got: " + title);
        }
	}
	
	@AfterMethod
	public void method(ITestResult result) throws IOException {
		if(result.getStatus() == result.FAILURE) {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\screenshots\\Failure.png"));
		}
	}
}
