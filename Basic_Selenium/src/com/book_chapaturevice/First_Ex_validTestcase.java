package com.book_chapaturevice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First_Ex_validTestcase {
public static void main(String[] args) throws Exception {
	System.out.println("  =====valid testcase====== ");
	
	System.out.println("open Firefox browser");
	WebDriver   driver=new FirefoxDriver();
	System.out.println("opening the url ");
	driver.get("file:///C:/Users/Lenovo/Desktop/Selenium%20Software/Offline%20Website/index.html");
	 
	System.out.println("maximize window");
	driver.manage().window().maximize();
	
	System.out.println("locate the email element");//testcase 1
	WebElement username=driver.findElement(By.id("email"));
	username.clear();
	username.sendKeys("kiran@gmail.com");
	
	System.out.println("locate the password element");//testcase 1
	WebElement passwd=driver.findElement(By.id("password"));
	passwd.clear();
	passwd.sendKeys("123456");
	
	
	System.out.println("locate click button");//testcase 1
	WebElement button=driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
     button.click();
	
     System.out.println("locate logout button");
     WebElement logoutbutton=driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[5]/a/span"));
     logoutbutton.click();
     
     driver.close();
     
     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
