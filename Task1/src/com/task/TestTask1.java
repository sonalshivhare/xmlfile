package com.task;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestTask1 {
	WebDriver driver;
	
	  @BeforeSuite
	  public void Launch_Browser() {
		   driver=new FirefoxDriver();
			driver.get("file:///C:/Users/Lenovo/Desktop/JBK%20Offline/index.html");
			driver.manage().window().maximize();
	  }
  @Test
  public void Verify_home() {
String actual_home	=driver.findElement(By.xpath(".//a[@ href='index.html']")).getText();
	System.out.println(actual_home);
			
	excell_Sheet readdata=new  excell_Sheet("F:\\Selenium workspace\\Task1\\Excell\\data.xlsx");
	String	 expected_home=readdata.getData(0, 1, 0); 
	 System.out.println( expected_home);
	 
Assert.assertEquals(actual_home, expected_home);

  }
  
  @Test
  public void Verifyaboutsir() {
String actual_as=driver.findElement(By.xpath(".//a[@ href='about-us.html']")).getText();
	System.out.println(actual_as);
			
	excell_Sheet readdata=new  excell_Sheet("F:\\Selenium workspace\\Task1\\Excell\\data.xlsx");
	String	 expected_as=readdata.getData(0, 2, 0); 
	 System.out.println( expected_as);
	 
Assert.assertEquals(actual_as, expected_as);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }



  @AfterSuite
  public void Close_Browser() {
	  driver.close();
	  
  }

}
