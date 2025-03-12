package com.rameshsoft.automation.Excel.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataExcelDemo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fip = new FileInputStream("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\ExcelSheets\\WriteExcel.xlsx");
		Workbook workbook = WorkbookFactory.create(fip);
		
		
		Sheet sheet1 = workbook.getSheet("sheet1");
		Row row0 = sheet1.createRow(0);
		Cell cell00 = row0.createCell(0);
		
		cell00.setCellValue("Welcome to Rameshsoft");
		row0.createCell(1).setCellValue("Master in java with selenium");
		
		Row row1 = sheet1.createRow(1);
		Cell cell10 = row1.createCell(0);
		
		cell10.setCellValue("RealTimeTrainingInstitute");
		
		FileOutputStream fop = new FileOutputStream("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\ExcelSheets\\WriteExcel.xlsx");
		workbook.write(fop);
	}
}
