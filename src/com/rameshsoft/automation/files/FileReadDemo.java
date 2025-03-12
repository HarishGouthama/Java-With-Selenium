package com.rameshsoft.automation.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
public static void main(String[] args) throws IOException {
	File file = new File("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\TextFiles\\Hello.txt");
	FileReader fileReader = new FileReader(file);
	
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	String line1 = bufferedReader.readLine();
	System.out.println(line1);
	
	String line2 = bufferedReader.readLine();
	System.out.println(line2);
	
	String line3 = bufferedReader.readLine();
	System.out.println(line3);
	
	while(bufferedReader.ready())
	{
		String text = bufferedReader.readLine();
		System.out.println(text);
	}
}
}
