package com.rameshsoft.automation.Excel.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
	String excelFilePath;
	Workbook workbook;
	String sheetName;
	public ExcelReader()
	{
		System.out.println("Default Constructor");
	}
	
	public ExcelReader(String excelFilePath) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		this.excelFilePath = excelFilePath;
		workbook = WorkbookFactory.create(new FileInputStream(excelFilePath));
	}
	
	public int getRowCount(String sheetName) {
		int rowCount = 0;
		sheetName = this.sheetName;
		rowCount = workbook.getSheet(sheetName).getLastRowNum() + 1;
		return rowCount;
	}
	
	public String getCellData(String sheetName , int rowNumber , int columnNumber)
	{
		String cellValue = " ";
		if(workbook.getSheet(sheetName).getRow(rowNumber).getCell(columnNumber).getCellType() == CellType.STRING) {
			cellValue = workbook.getSheet(sheetName).getRow(rowNumber).getCell(columnNumber).getStringCellValue().trim();
		}
		else {
			cellValue = String.valueOf(workbook.getSheet(sheetName).getRow(rowNumber).getCell(columnNumber).getNumericCellValue());
			
		}
		return cellValue;
	}
}
