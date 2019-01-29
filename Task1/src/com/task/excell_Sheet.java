package com.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excell_Sheet {
	XSSFWorkbook book;
 XSSFSheet sheet1;
public 	 excell_Sheet(String excellpath){
	try {
		File scr=new File(excellpath);
		FileInputStream fis=new  FileInputStream(scr);
	     book=new XSSFWorkbook(fis);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	 }
public String getData(int sheetnum,int row,int cols){
	
 sheet1=book.getSheetAt(sheetnum);
	String data=sheet1.getRow(row).getCell(cols).getStringCellValue();
	//System.out.println(data);
	return data;
}/*
public static void main(String[] args) {
	excell_library readdata=new  excell_library("F:\\Selenium workspace\\Task1\\Excell\\data.xlsx");

	String	 expected=readdata.getData(0, 1, 0); 

	 System.out.println( expected);
}*/
}