package com.rameshsoft.automation.files;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CSVReadDemo {
public static void main(String[] args) throws IOException, CsvException {
	String csvFileName = "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\ExcelSheets\\Write.csv";
	CSVReader csvReader = new CSVReader(new FileReader(csvFileName));
	
	String[] row = null;
	
	while((row = csvReader.readNext()) != null){
		System.out.println(row[0]  + "," + row[1] + "," + row[2] + "," + row[3]);
	}
	
	List content = csvReader.readAll();
	
	for(Object object : content) {
		row = (String[])object;
		System.out.println(row[0] + "," + row[1] + "," + row[2]);
	}
	csvReader.close();
}
}
