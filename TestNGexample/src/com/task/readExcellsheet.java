package com.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcellsheet {
	XSSFWorkbook book;
	XSSFSheet	sheet1;
	public readExcellsheet(String excellpath){
		try {
			File scr=new File(excellpath);//load file
			FileInputStream fis = new FileInputStream(scr);//file in the from byte
			 book=new XSSFWorkbook(fis);//load full workbook
			   
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		} 
		
		
	}
	public String getData(int sheetnumber,int row,int column){
		sheet1=book.getSheetAt(sheetnumber);//reading
	 String data=sheet1.getRow(row).getCell(column).getStringCellValue();
	 
		     return data;
		     
	}
	/*public static void main(String[] args) {
		readExcellsheet  execpted_home=new readExcellsheet("F://Selenium workspace//TestNGexample//src//Testdata/testdata.xlsx");
		System.out.println( execpted_home.getData(0, 1, 0));	
	}*/
	

}
