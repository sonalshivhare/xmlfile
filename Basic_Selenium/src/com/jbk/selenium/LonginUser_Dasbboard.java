package com.jbk.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LonginUser_Dasbboard {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/Selenium%20Software/Offline%20Website/index.html");
		
		System.out.println("*********Email id only********");
		          WebElement	userid=driver.findElement(By.id("email"));
	                  userid.sendKeys("kiran@gmail.com");
	    
	    System.out.println("*******Password*******");
	              WebElement pw=driver.findElement(By.id("password"));
		              pw.sendKeys("123456");
		       
		  System.out.println("********locate button********");
			    WebElement button=driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
			        button.click();
			        
		 System.out.println("*********Dashboard tab************");
			    WebElement tab=driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[2]/a/span"));
			        tab.click();
	}
		        
}
