package com.rameshsoft.automation.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RealTimeDemo {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	driver.get("https://www.flipkart.com");
	
	WebElement electronics = driver.findElement(By.xpath("//*[text() = 'Electronics']"));
	
	Actions actions = new Actions(driver);
	
	actions.moveToElement(electronics).build().perform();
	
	String electronicsText = electronics.getText();
	
	File file = new File("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\TextFiles\\Flipkart.txt");
	boolean b = file.createNewFile();
	
	if(b) {
		System.out.println("File is created");
	}
	else {
		System.out.println("File already exists");
	}
	
	FileWriter filewriter = new FileWriter(file);
	BufferedWriter bwriter = new BufferedWriter(filewriter);
	
	bwriter.write(electronicsText);
	bwriter.flush();
}
}
