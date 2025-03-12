package com.rameshsoft.automation.Excel.programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXRead {
public static void main(String[] args) throws IOException {
	
	FileInputStream excelFileToRead = new FileInputStream("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\ExcelSheets\\Test1.xls");
	XSSFWorkbook workbook = new XSSFWorkbook(excelFileToRead);
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	XSSFRow row;
	XSSFCell cell;
	
	Iterator rows = sheet.rowIterator();
	while(rows.hasNext())
	{
	row = (XSSFRow) rows.next();
	Iterator cells = row.cellIterator();
	while(cells.hasNext())
	{
		cell = (XSSFCell) cells.next();
		if(cell.getCellType() == CellType.STRING) {
			System.out.println(cell.getStringCellValue() + " ");
		}
		else if(cell.getCellType() == CellType.NUMERIC) {
			System.out.println(cell.getNumericCellValue() + " ");
		}
	}
	}
}
}
