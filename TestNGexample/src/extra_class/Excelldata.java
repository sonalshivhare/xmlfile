package extra_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Cell;
import jxl.Range;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.PasswordException;

public class Excelldata {
	public  String Excellsheet() throws Exception{
	File scr=new File("F://Selenium workspace//TestNGexample//src//Testdata/testdata.xlsx");//load file
	FileInputStream fi=new FileInputStream(scr);//file in the from byte
	XSSFWorkbook book=new XSSFWorkbook(fi);//load full workbook
     XSSFSheet	sheet1=book.getSheetAt(0);//reading 
   String data=sheet1.getRow(1).getCell(0).getStringCellValue();//row and colm
    System.out.println("Data from excell="+data);
    book.close();
    return data;
	}	
	
}

