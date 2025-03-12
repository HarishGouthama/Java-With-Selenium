package com.rameshsoft.automation.Excel.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class XLSRead {
public static void main(String[] args) throws IOException {
	
	InputStream excelFileToRead = new FileInputStream("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\ExcelSheets\\Test.xls");
	HSSFWorkbook workbook = new HSSFWorkbook(excelFileToRead);
	HSSFSheet sheet = workbook.getSheetAt(0);
	
	HSSFRow row;
	HSSFCell cell;
	
	Iterator rows = sheet.rowIterator();
	
	while(rows.hasNext())
	{
	row = (HSSFRow) rows.next();
	Iterator cells = row.cellIterator();
	while(cells.hasNext()) {
	cell = (HSSFCell) cells.next();
	if(cell.getCellType() == CellType.STRING) {
		System.out.println(cell.getStringCellValue() + " ");
	}
	else if(cell.getCellType() == CellType.NUMERIC)
	{
		System.out.println(cell.getNumericCellValue() + " ");
	}
	}
	}
}
}

