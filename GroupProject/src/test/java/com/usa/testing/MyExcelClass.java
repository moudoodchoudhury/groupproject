package com.usa.testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyExcelClass {

	public static String excelPath = "C:\\Users\\moudo\\eclipse-workspace\\GroupProject\\ExcelData\\testcase.xlsx";
	public static FileInputStream file;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;

	public static void main(String[] args) {
		MyExcelMethod();

	}

	public static void MyExcelMethod() {

		try {
			file = new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book = new XSSFWorkbook(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = book.getSheet("Mysheet");

		int getrow = sheet.getLastRowNum();
		int getcol = sheet.getRow(0).getLastCellNum();
		System.out.println("my total row numbers are:" + "" + getrow);
		System.out.println("my total col number are:" + "" + getcol);

		for (int i = 0; i < getrow; i++) {
			XSSFRow CurrentRow = sheet.getRow(i);

			for (int j = 0; j < getcol; j++) {
				String value = CurrentRow.getCell(j).toString();
				System.out.print(" " + " " + value);
			}
			System.out.println();
		}

	}

}
