package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com");
        
        WebElement ele = driver.findElement(By.linkText("Create new account"));  //*[@id="u_0_0_1a"]
        ele.click();

        // Locate the radio button using CSS Selector
        WebElement radio = driver.findElement(By.cssSelector("#u_0_d_e8"));

        if (radio.isDisplayed() && radio.isEnabled()) {
            radio.click();
            System.out.println("Radio button is clicked");
        } else {
            System.out.println("Unable to click on radio button");
        }

        if (radio.isSelected()) {
            System.out.println("Radio button is selected");
        } else {
            radio.click();
            System.out.println("Second time performing click operation");
        }

        driver.quit();
    }
}





/*package com.rameshsoftSelenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonDemo
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @name='sex' and @value='1']"));
		
		if(radio.isDisplayed() && radio.isEnabled())
		{
			radio.click();
		}
		else
		{
			System.out.println("unable to click on radio button");
		}
		
		if(radio.isSelected())
		{
			System.out.println("Radio button is selected");
		}
		else
		{
			radio.click();
			System.out.println("Second time performaing click operation");
			driver.quit();
		}
	}
}
*/