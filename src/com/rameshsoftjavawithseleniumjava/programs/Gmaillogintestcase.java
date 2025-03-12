package com.rameshsoftjavawithseleniumjava.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmaillogintestcase
{
	public static void main(String[] args) throws InterruptedException 
	{
		/*System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
		driver.manage().window().maximize();     //*[@id="identifierId"]
		driver.manage().deleteAllCookies();
		
		String gettitle = driver.getTitle();
		System.out.println(gettitle);
		
		String getcurrenturl = driver.getCurrentUrl();
		System.out.println(getcurrenturl);
		
		WebElement element_username = driver.findElement(By.xpath("//input[@id = 'identifierId']"));
		element_username.clear();
		element_username.sendKeys("harish1992.it@gmail.com");
		
		Thread.sleep(10000);
		
		WebElement Click = driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span"));
		Click.click();
		
		Thread.sleep(5000);
		
		WebElement ele_password = driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
		ele_password.clear();
		ele_password.sendKeys("123456798cds");
		
		Click.click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
