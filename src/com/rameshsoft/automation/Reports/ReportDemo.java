package com.rameshsoft.automation.Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class ReportDemo {
    static ExtentReports extent1;

    // Method to take a screenshot
    public static void screenshot(String fileName, WebDriver driver) throws IOException {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(fileName));
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        // Initialize ExtentReports with the report file path
        extent1 = new ExtentReports("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Reports\\reports1.html", true);

        // Start a test
        ExtentTest test = extent1.startTest("Gmail Login TestCase");

        System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        test.log(LogStatus.INFO, "Firefox browser is launched");
        Thread.sleep(2000);

        screenshot("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Reports\\image1.png", driver);
        test.log(LogStatus.INFO, "Screenshot captured");

        driver.get("https://www.gmail.com");
        test.log(LogStatus.INFO, "Gmail is opened");
        Thread.sleep(2000);

        driver.findElement(By.id("identifierId")).sendKeys("harish1992.it@gmail.com");
        test.log(LogStatus.INFO, "Username entered with test data");

        screenshot("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Reports\\image2.png", driver);
        test.log(LogStatus.INFO, "Screenshot captured after entering username");

        driver.findElement(By.id("identifierNext")).click();
        test.log(LogStatus.INFO, "Clicked on Next button");

        screenshot("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Reports\\image3.png", driver);
        test.log(LogStatus.INFO, "Screenshot captured after clicking Next");

        // End the test and write the report
        extent1.endTest(test);
        extent1.flush();

        driver.quit();
    }
}



/*package com.rameshsoft.automation.Reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.rameshsoftautomation.TestngPrograms.ScreenShotDemo;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class ReportDemo {
static ExtentReports extent1;

public static void screenshot(String fileName , WebDriver driver) throws IOException {
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File(fileName));
}

public static void main(String[] args) {
	extent1 = ExtentReports.get(ReportDemo.class);
	extent1.init("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Reports\\reports1.html",true);
	extent1.startTest("Gmail Login TestCase");
	System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	extent1.log(LogStatus.INFO , "Firefox browser is launched");
	Thread.sleep(2000);
	
	screenshot("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Reports\\image1.png", driver);
	Thread.sleep(1000);
	
	extent1.attachScreenShot("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Reports\\image1.png");
	driver.get("https://www.gmail.com");
	extent1.log(LogStatus.INFO,"Gmail is opened");
	Thread.sleep(2000);
	
	driver.findElement(By.id("identifierId")).sendKeys("harish1992.it@gmail.com");
	extent1.log(LogStatus.INFO , "username is entered with testdata @ harish1992.it@gmail.com");
	Thread.sleep(2000);
	
	ScreenShotDemo("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Reports\\image3.png");
	
	extent1.attachScreenShot("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Reports\\image3.png");
	driver.findElement(By.id("identifierNext")).click();
	
	extent1.log(LogStatus.INFO , "Clicked on next button");
	Thread.sleep(2000);
	
	screenshot("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Reports\\image4.png", driver);
	extent1.attachScreenShot("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Reports\\image4.png");
	extent1.endTest();
	driver.quit();
	
}
}
*/