package com.rameshsoftautomation.Files.programs;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileCreateDemo
{
	public static void main(String[] args) throws IOException 
	{
		Properties property = new Properties();
		property.setProperty("username", "harish1992.it@gmail.com");
		
		FileWriter fwriter = new FileWriter("or.properties");
		property.store(fwriter, "File Created");
		
		fwriter.close();
	}
}
