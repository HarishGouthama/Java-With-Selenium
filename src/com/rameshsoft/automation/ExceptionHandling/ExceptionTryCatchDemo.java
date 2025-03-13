package com.rameshsoft.automation.ExceptionHandling;

import java.io.FileInputStream;

public class ExceptionTryCatchDemo {
public static void main(String[] args) {
	System.out.println("Login");
	try {
		FileInputStream fip = new FileInputStream("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\ExcelSheets\\Sample1.csv");
	}catch(Exception e)
	{
		System.out.println("Provide alternate for handling the exception");
	}
	
	System.out.println("Logout");
}
}
