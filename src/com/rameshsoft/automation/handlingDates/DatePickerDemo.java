package com.rameshsoft.automation.handlingDates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JSpinner.DateEditor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

public class DatePickerDemo {
public static void main(String[] args) throws InterruptedException {
	
	LocalDate date = LocalDate.now();
	String expectedDateString = date.format(DateTimeFormatter.ofPattern("dd "));
	System.out.println(expectedDateString);
	
	System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	driver.get("https://www.jqueryui.com");
	//driver.get("https://www.blacked.com");
	driver.findElement(By.linkText("Datepicker")).click();
	
	driver.switchTo().frame(0);
	
	driver.findElement(By.id("datepicker")).click();
	Thread.sleep(2000);
	
	List<WebElement> dates = driver.findElements(By.xpath("//*[@id = 'ui-datepicker-div']/table/tbody/tr/td"));
	
	for(WebElement webElement : dates)
	{
		System.out.println(webElement.getText());
	}
	
	boolean dateClicked = false;
	for(WebElement webElement : dates)
	{
		String dateText = webElement.getText().trim();
	if(dateText.equalsIgnoreCase(expectedDateString.trim()) && webElement.isEnabled()) {
			webElement.click();
			System.out.println("Date selected : " + dateText);
			dateClicked = true;
			break;
		}
		
	}
	Thread.sleep(3000);
}
}


/*package com.rameshsoft.automation.handlingDates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerDemo {
    public static void main(String[] args) {
        // Get today's date and format it as "dd "
        LocalDate date = LocalDate.now();
        String expectedDateString = date.format(DateTimeFormatter.ofPattern("dd "));
        System.out.println("Expected Date: " + expectedDateString);

        // Set up the Firefox WebDriver
        System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        try {
            // Maximize browser window and configure timeouts
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

            // Navigate to the jQuery UI page
            driver.get("https://www.jqueryui.com");

            // Click on the "Datepicker" link
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Datepicker"))).click();

            // Switch to the iframe containing the date picker
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));

            // Click the date picker input field
            wait.until(ExpectedConditions.elementToBeClickable(By.id("datepicker"))).click();

            // Find all date elements inside the date picker
            List<WebElement> dates = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td"));

            // Loop through the dates and select the expected date
            for (WebElement dateElement : dates) {
                if (dateElement.getText().equals(expectedDateString.trim())) {
                    dateElement.click();
                    System.out.println("Date selected: " + dateElement.getText());
                    break;
                }
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
*/