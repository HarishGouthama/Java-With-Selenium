package com.rameshsoftautomation.Files.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ObjectRepoWriteDemo
{
	public static void main(String[] args) throws IOException 
	{
		Properties properties = new Properties();
		FileInputStream fip = new FileInputStream("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\or.properties");
		properties.load(fip);
		
		properties.setProperty("name", "RameshSoftAmeerpet");
		properties.setProperty("Course", "JavaWithSelenuim");
		
		/*FileOutputStream fop = new FileOutputStream("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\or.properties");
		properties.store(fop, "Successfully added data into properties file");*/
		
		properties.store(new FileOutputStream("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\or.properties"), null);
	}
}
