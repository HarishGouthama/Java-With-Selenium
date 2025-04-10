package com.rameshsoft.automation.ExceptionHandling;

import java.io.FileInputStream;

public class ExceptionPrintDemo {
	public static void main(String[] args) {
		System.out.println("Login");
	
	try {
		FileInputStream fip = new FileInputStream("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\ExcelSheets\\Sample1.csv");
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e.toString());
		System.out.println(e);
	}
}
}