package com.rameshsoft.automation.Excel.programs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXWrite {
public static void main(String[] args) throws IOException {
	String excelFileName = "D:\\\\RameshSoft2directory\\\\Rameshsoft Revision\\\\JavaWithSeleniumPrograms\\\\ExcelSheets\\\\Test1.xls";
	String sheetName = "Sheet1";
	
	XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet = workbook.createSheet(sheetName);
	
	for(int r = 0 ; r < 101 ; r++) {
		XSSFRow row = sheet.createRow(r);
		for(int c = 0 ; c < 101 ; c++) {
		XSSFCell cell = row.createCell(c);
		cell.setCellValue("CELL" + r + "" + c);
		}
	}
	
	FileOutputStream fop = new FileOutputStream(excelFileName);
	workbook.write(fop);
	fop.flush();
	fop.close();
	
}
}
