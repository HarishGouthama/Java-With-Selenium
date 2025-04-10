/*package com.rameshsoft.automation.lambdaExpressions;

import static org.testng.Assert.expectThrows;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@FunctionalInterface
interface data{
	void enterData(WebElement element , String data);
}

public class Test1 {
public static void main(String[] args) {
	
	data d = (WebElement e , string t) -> {
		if(e.isDisplayed() && e.isEnabled()) {
			e.clear();
			e.sendKeys(t);
		}
		else {
			System.out.println("Element is not displayed");
		}
	};
	d.enterData(driver.findElement(By.id("A")), "Rameshsoft");
}
}
*/

package com.rameshsoft.automation.lambdaExpressions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@FunctionalInterface
interface Data {
    void enterData(WebElement element, String data);
}

public class Test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        Data d = (WebElement e, String t) -> {
            if (e.isDisplayed() && e.isEnabled()) {
                e.clear();
                e.sendKeys(t);
            } else {
                System.out.println("Element is not displayed or enabled");
            }
        };

        try {
            WebElement element = driver.findElement(By.id("A"));
            d.enterData(element, "Rameshsoft");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}