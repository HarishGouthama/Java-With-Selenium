package com.rameshsoft.automation.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextData {
public static void main(String[] args) throws IOException {
	File file = new File("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\TextFiles\\Hello.txt");
	boolean b = file.createNewFile();
	
	System.out.println(b);
	
	FileWriter fwriter = new FileWriter(file,true);
	BufferedWriter bwriter = new BufferedWriter(fwriter);
	
	bwriter.write("Welcome to rameshsoft");
	bwriter.newLine();
	
	bwriter.write("Masters of selenium");
	bwriter.flush();
}
}
