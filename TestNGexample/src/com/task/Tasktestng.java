package com.task;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Tasktestng{
	
	public static WebDriver driver;
	public static Sheet sheet;
	
	
	 @BeforeTest
	 public void Excel_sheet() throws IOException, BiffException{
	
	String Testdata_sheet_path="F:/Selenium workspace/TestNGexample/src/Testdata/tasklink.xls";
	 

	FileInputStream file=new FileInputStream(Testdata_sheet_path);
		Workbook book = Workbook.getWorkbook(file);
	Sheet sheet=book.getSheet(0);
	Cell cell=sheet.getCell(0, 1);
	//System.out.println(cell.getContents());
	
	}
	
  @Test//1test cases
 public static void verify_link1() throws InterruptedException {
	  
	//  WebElement home=driver.findElement(By.xpath(".//a[@ href='index.html']"));
	  
	  //  Thread.sleep(2000);
	    String excepected =sheet.getCell(0,1).getContents();
	    System.out.println("page litle is="+excepected);
	    WebElement actual =driver.findElement(By.xpath(".//a[@ href='index.html']"));
	   Assert.assertEquals(excepected, actual );
	    
  }
  @Test//testcases 2
 public void verify_link2() throws InterruptedException {
	  
	 WebElement aboutsir=driver.findElement(By.xpath("//a[@ href='about-us.html']"));
		aboutsir.click();
	    Thread.sleep(2000);
	    String aboutsir_link =driver.getTitle();
	    System.out.println("page litle is="+aboutsir_link);
	    String excepted_link ="file:///C:/Users/Lenovo/Desktop/JBK%20Offline/about-us.html";
	    Assert.assertEquals(aboutsir_link, excepted_link );
	    
  }
  
 /* @Test
  public void Verify_Home_Link()
  {
	  String expected=sheet.getCell(0,1).getContents();
	  
	  String act=driver.findElement(By.xpath(".//a[@ href='index.html']")).getText();
	  Assert.assertEquals(act, expected);
		
  }*/
  @BeforeMethod
  public void beforeMethod() {
	   
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public static void setup_Browser() {
	  driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/JBK%20Offline/index.html");
		driver.manage().window().maximize(); 
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
  }

}
