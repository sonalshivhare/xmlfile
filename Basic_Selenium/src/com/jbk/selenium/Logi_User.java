package com.jbk.selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logi_User {
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
		        
		 System.out.println("*******Longin table print*********");
		        WebElement usertab=driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
		        usertab.click();
		        
		        System.out.println("*******Userlist  *********");
		   WebElement  userlisttext=driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]"));
		   userlisttext.getText();
		   System.out.println(userlisttext.getText());
		   
		   System.out.println("********Table **************");
		   WebElement  table=driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table"));
		  List<WebElement> row=driver.findElements(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[j]/td[i]"));
            System.out.println(row.size()); 
		    
		   
		   
		   
		   
		   
		   
		  /* System.out.println("*********Add user ***************");
		        WebElement adduserbutton =driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
		        adduserbutton.click();*/
		        
}
}
