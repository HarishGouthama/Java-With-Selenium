package com.rameshsoft.automation.Excel.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fip = new FileInputStream("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\ExcelSheets\\WriteExcel.xlsx");
		Workbook workbook = WorkbookFactory.create(fip);
		
		Sheet sheet1 = workbook.getSheet("Sheet1");
		
		Row row0 = sheet1.getRow(0);
		Cell cell00 = row0.getCell(0);
		
		String cellValue00 = cell00.getStringCellValue();
		System.out.println("cell00 value is : " + cellValue00);
		
		Cell cell01 = row0.getCell(1);
		String CellValue01 = cell01.getStringCellValue();
		System.out.println("Cell value 01 is : " + CellValue01);
		
		Row row1 = sheet1.getRow(1);
		String cellValue10 = row1.getCell(0).getStringCellValue();
		System.out.println("Cell value10 is : " + cellValue10);
		
		/*Row row2 = sheet1.getRow(2);
		String cellValue21 = row2.getCell(0).getStringCellValue();
		System.out.println("Cell value21 is : " + cellValue21);*/
	}
}
