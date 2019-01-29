package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excellsheet {
public static void main(String[] args) throws Exception {
	File scr=new File("F:\\Selenium workspace\\Basic_Selenium\\excellsheet\testdata.xlsx");
	FileInputStream fi=new FileInputStream(scr);
	XSSFWorkbook book=new XSSFWorkbook(fi);
      XSSFSheet sheet1= book.getSheetAt(0);
String data=sheet1.getRow(1).getCell(0).getStringCellValue();
System.out.println(data);
}
}
