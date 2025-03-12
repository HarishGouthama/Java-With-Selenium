package com.rameshsoft.automation.Excel.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginDemo {
public static void main(String[] args) throws IOException {
	
	//Reading url from config.properties
	
	File file1 = new File("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\config.properties");
	FileInputStream fip = new FileInputStream(file1);
	
	Properties p1 = new Properties();
	p1.load(fip);
	
	String url = p1.getProperty("gmail_url");
	System.out.println("Gmail url is : " + url);
	
	//Taking webelements from gmail_or.properties
	
	File file2 = new File("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\gmail_or.properties");
	FileInputStream fip2 = new FileInputStream(file2);
	Properties p2 = new Properties();
	p2.load(fip2);
	
	String username = p2.getProperty("gmail_username");
	String nextButton = p2.getProperty("gmail_xpath");
	String clickNext = p2.getProperty("gmail_next");
	
	//Taking or reading data from excel sheet
	
	File file3 = new File("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\ExcelSheets\\TestData.xls");
	FileInputStream fip3 = new FileInputStream(file3);
	Workbook workbook = WorkbookFactory.create(fip3);
	
	String userdata = workbook.getSheet("Gmail_Data").getRow(0).getCell(0).getStringCellValue();
	
	System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	driver.get(url);
	
	driver.findElement(By.xpath(nextButton)).sendKeys(username);
	driver.findElement(By.id(clickNext)).click();
}
}
