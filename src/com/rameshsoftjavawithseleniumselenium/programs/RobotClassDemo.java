package com.rameshsoftjavawithseleniumselenium.programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RobotClassDemo 
{
	@Test
	public void uploadFile() throws AWTException 
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\msedgedriver.exe");
				
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.sendspace.com");
		driver.findElement(By.id("upload_file")).click();
		
		StringSelection stringselection = new StringSelection("D:\\RameshSoft Automation Testing\\Collections Framework.JPG");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		
		
		Robot robot = new Robot();
		
		//Press control V (ctrl + v)
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//release control v (ctrl+v)
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}
}
