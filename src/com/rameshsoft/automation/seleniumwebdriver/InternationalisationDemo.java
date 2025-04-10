package com.rameshsoft.automation.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InternationalisationDemo {
public static void main(String[] args) {
	
	FirefoxProfile profile = new FirefoxProfile();
	profile.setPreference("intl.accept_languages", "en-US");
	
	FirefoxOptions options = new FirefoxOptions();
	options.setProfile(profile);
	
	System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver(options);
	
	driver.get("https://www.google.com");
	
	driver.findElement(By.name("q")).sendKeys("Selenium");
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();
	
}
}
