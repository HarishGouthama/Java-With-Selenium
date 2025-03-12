package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWaitDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium by ramesh anupati");
        driver.findElement(By.name("btnK")).click();  // corrected button name
        Thread.sleep(4000);
        
        // corrected link text
        driver.findElement(By.linkText("selenium:selenium WebDriver by Ramesh Anupati")).click();
        
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
            .withTimeout(30, TimeUnit.SECONDS)
            .pollingEvery(1, TimeUnit.SECONDS)
            .ignoring(NoSuchElementException.class);
        
        WebElement profileLink = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//*[@id='profile1']/div/dl/dt/a"));
            }
        });
        
        System.out.println("Profile link is displayed: " + profileLink.isDisplayed());
    }
}
