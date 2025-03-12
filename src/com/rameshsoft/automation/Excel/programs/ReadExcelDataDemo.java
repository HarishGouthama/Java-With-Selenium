package com.rameshsoft.automation.Excel.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelDataDemo {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fip = new FileInputStream("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\ExcelSheets\\WriteExcel.xlsx");
	Workbook workbook = WorkbookFactory.create(fip);
	
	Sheet sheet1 = workbook.getSheet("Sheet1");
	
	for(int i = 0 ; i < sheet1.getLastRowNum() ; i++)
	{
		Row row = sheet1.getRow(i);
		
		for(int j = 0 ; j < row.getLastCellNum() ; j++)
		{
			Cell cell = row.getCell(j);
			if(cell.getCellType() == CellType.NUMERIC)
			{
				double d = cell.getNumericCellValue();
				System.out.println(d);
			}
			else if(cell.getCellType() == CellType.STRING)
			{
				String s = cell.getStringCellValue();
				System.out.println(s);
			}
			else
			{
				boolean b = cell.getBooleanCellValue();
				System.out.println(b);
			}
		}			
	}
}
}
