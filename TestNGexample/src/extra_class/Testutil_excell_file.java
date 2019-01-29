package extra_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Testutil_excell_file {

		
	
	static Workbook book;
	static Sheet  sheet;
	 
	public static String Testdata_sheet_path="F://Selenium workspace/TestNGexample/src/Testdata/tasklink.xlsx";
	
public static  void getDataFromSheet(String sheetName){
	FileInputStream file=null;
	try {
		file=new FileInputStream(Testdata_sheet_path);
		} catch (Exception e) {
			e.printStackTrace();
	}
	try {
		book=(Workbook) WorkbookFactory.create(file);
	} catch (Exception e) {
		e.printStackTrace();
	}
	sheet=book.getSheet(sheetName);
//Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	
	//data=new object[sheet.get]
	
	
	

}}
