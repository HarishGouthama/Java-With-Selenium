package com.rameshsoft.automation.seleniumwebdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteScreenShotDemo {
    public static void main(String[] args) {
        try {
            // Configure Firefox options
            FirefoxOptions options = new FirefoxOptions();

            // Initialize RemoteWebDriver with updated options
            WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
            
            // Navigate to a webpage
            driver.get("https://rameshselenium.blogspot.in/");

            // Perform test actions
            System.out.println("Page title is: " + driver.getTitle());
            
            // Quit the driver
            driver.quit();
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}