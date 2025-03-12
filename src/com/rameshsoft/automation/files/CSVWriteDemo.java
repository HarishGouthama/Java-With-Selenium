package com.rameshsoft.automation.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class CSVWriteDemo {
public static void main(String[] args) throws IOException {
	String csv = "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\ExcelSheets\\Write.csv";
	CSVWriter writer = new CSVWriter(new FileWriter(csv));
	
	String[] country = "Harish,India,Hyderabad,Attapur".split(",");
	
	writer.writeNext(country);
	
	List<String[]> data = new ArrayList<String[]>();
	data.add(new String[] {"Harish" , "Attapur" , "Hyderabad"});
	data.add(new String[] {"India" , "America" , "Europe"});
	
	writer.writeAll(data);
	writer.close();
}
}
