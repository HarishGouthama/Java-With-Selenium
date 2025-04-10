package com.rameshsoft.automation.cookiesmanagement;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	
	//add Cookie
	
	 Cookie cookie = new Cookie("abc", "123");
	 driver.manage().addCookie(cookie);
	 
	 //get all cookies
	 
	 Set<Cookie> cookies = driver.manage().getCookies();
	 for(Object object : cookies)
	 {
		 System.out.println("Cookie name is : " + object);
	 }
	 
	 //get named cookie
	 Cookie name = driver.manage().getCookieNamed("abc");
	 System.out.println("Cookie name is : " + name);
	 
	 //Delete all cookies
	 driver.manage().deleteAllCookies();
	 
	 //delete cookie
	 driver.manage().deleteCookie(cookie);

	 //delete cookie Named
	 driver.manage().deleteCookieNamed("abc");
}
}
