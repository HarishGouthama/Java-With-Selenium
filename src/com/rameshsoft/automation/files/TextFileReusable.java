package com.rameshsoft.automation.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileReusable {
	static String filePath;
	static File file;
	static FileWriter fwriter;
	static BufferedWriter bwriter;
	static FileReader freader;
	static BufferedReader bufferedReader;
	
	public TextFileReusable(String filePath)
	{
		this.filePath = filePath;
	}
	
	public static void fileWriting() throws IOException
	{
		file = new File(filePath);
		file.createNewFile();
		
		fwriter = new FileWriter(file);
		bwriter = new BufferedWriter(fwriter);
	}
	
	public static void fileReading() throws FileNotFoundException
	{
		file = new File(filePath);
		freader = new FileReader(file);
		bufferedReader = new BufferedReader(freader);
	}
	
	public static void writeDataStr(String data) throws IOException
	{
		bwriter.write(data);
		bwriter.flush();
	}
	
	public static void writeDataint(int data) throws IOException
	{
		bwriter.write(data);
		bwriter.flush();
	}
	
	public static String readData() throws IOException
	{
		String data = bufferedReader.readLine();
		return data;
	}
}
