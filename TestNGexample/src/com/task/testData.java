package com.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class testData {
public 	 WebDriver driver;
ExtentReports extent;
ExtentTest logger;

@BeforeSuite
public void openBrowser(){
	  driver=new FirefoxDriver();
	  WebDriverWait wait=new WebDriverWait(driver, 20);
			driver.get("file:///C:/Users/Lenovo/Desktop/JBK%20Offline/index.html");
			driver.manage().window().maximize(); 
}


@BeforeMethod
public void setupReport(){
ExtentHtmlReporter reporter=new  ExtentHtmlReporter("./Reports/TestReport3.html");
	     extent=new ExtentReports();
	     extent.attachReporter(reporter);
	     logger=extent.createTest("setupReport");	     
	  
}

@Test()
public void verify_Home() throws Exception{
	 String actual_home =driver.findElement(By.xpath(".//a[@ href='index.html']")).getText();
	 //System.out.println( "Actual value ="+actual_home);
	 
	 readExcellsheet  readdata=new readExcellsheet("F://Selenium workspace//TestNGexample//src//Testdata/testdata.xlsx");
	String execpted_home	=readdata.getData(0, 1, 0);
  //System.out.println("Execpted value ="+execpted_home);
	Assert.assertEquals(actual_home, execpted_home);
   
  }
	   
   


@Test//2
public void verify_AboutSir() throws Exception{
	WebElement sir  =driver.findElement(By.xpath("//a[@ href='about-us.html']"));
     String	actualsir=	sir.getText();//Thread.sleep(4000);
	 //System.out.println( "Actual value ="+actualsir);
	 
	 readExcellsheet  readdata=new readExcellsheet("F://Selenium workspace//TestNGexample//src//Testdata/testdata.xlsx");
	String execptedsir=readdata.getData(0, 2, 0);
 // System.out.println("Execpted value ="+execptedsir);
  Assert.assertEquals(actualsir,execptedsir);
}

@Test//3
public void verify_javasyllabus() throws Exception{
	 String actualjs =driver.findElement(By.xpath(".//a[@ href='core-java-j2eee-syllabus.html']")).getText();
	// System.out.println( "Actual value ="+actualjs);
	 
	 readExcellsheet  readdata=new readExcellsheet("F://Selenium workspace//TestNGexample//src//Testdata/testdata.xlsx");
	String execptedjs=readdata.getData(0, 3, 0);
 // System.out.println("Execpted value ="+execptedjs);
   
  Assert.assertEquals(actualjs,execptedjs);
}

@Test
public void verify_Seleniumtesting() throws Exception{
	 String actualst =driver.findElement(By.xpath(".//a[@ href='selenium-testing-in-pune.html']")).getText();
	 //System.out.println( "Actual value ="+actualst);
	 
	 readExcellsheet  readdata=new readExcellsheet("F://Selenium workspace//TestNGexample//src//Testdata/testdata.xlsx");
	String execptedst=readdata.getData(0, 4, 0);
      //System.out.println("Execpted value ="+execptedst);
   
  Assert.assertEquals(actualst,execptedst);
}

@Test
public void verify_AngularSyllbus() throws Exception{
	 String actualas =driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[5]/a")).getText();
	 System.out.println( "Actual value ="+actualas);
	 
	 readExcellsheet  readdata=new readExcellsheet("F://Selenium workspace//TestNGexample//src//Testdata/testdata.xlsx");
	String execptedas=readdata.getData(0, 4, 0);
      System.out.println("Execpted value ="+execptedas);
   
  Assert.assertEquals(actualas,execptedas);
}

@AfterMethod
public void tearDown(ITestResult result) throws Exception{//
	//Screenshot screen=new Screenshot();
	if(ITestResult.FAILURE==result.getStatus()){
	String	temp=screen.getscreenshot(driver,(result.getName()));
	logger.fail("detials", MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
	}
	// screensort ss=new screensort();
	 if(ITestResult.FAILURE==result.getStatus()){
	 ss.capturescreenshot(driver,result.getName());
	extent.flush();
	
}

@AfterSuite
public  void closeBrowser(){
	driver.close();
}

}
