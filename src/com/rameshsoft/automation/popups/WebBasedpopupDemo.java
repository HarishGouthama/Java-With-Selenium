package com.rameshsoft.automation.popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBasedpopupDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	driver.get("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\popup\\prompt.html");
	driver.findElement(By.xpath("//button[@onclick = 'promptFunction()']")).click();
	Alert alert =driver.switchTo().alert();
	String popUp = alert.getText();
	System.out.println("popUp Text is : " + popUp);
	alert.sendKeys("Welcome to this world");
	Thread.sleep(3000);
	alert.accept();
	Thread.sleep(3000);
	driver.quit();
}
}
