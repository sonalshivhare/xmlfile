package extra_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.read.biff.BiffException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class sheetdata_xls {
	public static void main(String[] args) throws IOException, BiffException {
		
	
	 String Testdata_sheet_path="F:/Selenium workspace/TestNGexample/src/Testdata/tasklink.xls";
	 

	

		FileInputStream file=new FileInputStream(Testdata_sheet_path);
			Workbook book = Workbook.getWorkbook(file);
		Sheet sheet=book.getSheet(0);
		int rows=sheet.getRows();
		System.out.println("Row="+rows);
		int cols =sheet.getColumns();
		System.out.println("cols="+cols);
		/*for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++) {*/
				Cell cell=sheet.getCell(0, 1);
				System.out.println(cell.getContents());
				
			} 
		
		
	

	}