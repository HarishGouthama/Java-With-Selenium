package com.rameshsoftautomation.Files.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectRepoReadDemo
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fip = new FileInputStream("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\or.properties");
		Properties properties = new Properties();
		properties.load(fip);
		
		String gmail_username = properties.getProperty("sign_in");
		String gmail_next = properties.getProperty("next");
		
		System.out.println("Gmail username xpath is: " + gmail_username);
		System.out.println("Gmail next xpath is: " + gmail_next);
		
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath(gmail_username)).sendKeys("harish1992.it@gmail.com");
		driver.findElement(By.xpath(gmail_next)).click();
	}
}
