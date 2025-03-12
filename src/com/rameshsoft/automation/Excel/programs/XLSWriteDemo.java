package com.rameshsoft.automation.Excel.programs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class XLSWriteDemo {
public static void main(String[] args) throws IOException {
	String excelFileName = "D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\ExcelSheets\\Test.xls";
	String sheetName = "Sheet1";
	
	HSSFWorkbook workbook = new HSSFWorkbook();
	HSSFSheet sheet = workbook.createSheet(sheetName);
	
	for(int r = 0 ; r < 101 ; r++)
	{
		HSSFRow row = sheet.createRow(r);
		for(int c = 0 ; c < 101 ;c++) {
			HSSFCell cell = row.createCell(c);
			cell.setCellValue("cell" + r + "" + c);
		}
	}
	
	FileOutputStream fop = new FileOutputStream(excelFileName);
	workbook.write(fop);
	fop.flush();
	fop.close();
}
}
