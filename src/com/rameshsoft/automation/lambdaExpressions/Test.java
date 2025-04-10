/*package com.rameshsoft.automation.lambdaExpressions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@FunctionalInterface
interface check{
	void click(WebElement e);
}

public class Test {
public static void main(String[] args) {
	check c = (WebElement e)->{
		if(e.isDisplayed() && e.isEnabled()) {
			e.click();
		}
		else {
			System.out.println("Element is not displayed");
		}
	};
	c.click(Driver.findElement(By.id("Rameshsoft")));
}
}*/

package com.rameshsoft.automation.lambdaExpressions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@FunctionalInterface
interface ClickAction {
    void click(WebElement e);
}

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");

        ClickAction c = (WebElement e) -> {
            if (e.isDisplayed() && e.isEnabled()) {
                e.click();
            } else {
                System.out.println("Element is not displayed or enabled");
            }
        };

        try {
            WebElement element = driver.findElement(By.id("Rameshsoft"));
            c.click(element);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}