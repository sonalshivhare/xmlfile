package com.jbk.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New_Membership {
public static void main(String[] args) {
	System.out.println("*********Open the browser******");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Lenovo/Desktop/Selenium%20Software/Offline%20Website/index.html");
	
	System.out.println("******New membership for login page********");
	   WebElement	newmember=driver.findElement(By.xpath("html/body/div[1]/div[2]/a"));
	   newmember.click();
	   
	   System.out.println("********locate title text******");
	   WebElement	 titletext= driver.findElement(By.xpath("html/body/div[1]/div[1]/a"));
	   titletext.getText();
       System.out.println(titletext.getText());
	   
	   System.out.println("********login box massage*****");
       WebElement	 loginmsg= driver.findElement(By.xpath("html/body/div[1]/div[2]/p"));
       loginmsg.getText();
       System.out.println(loginmsg.getText());
       
       System.out.println("*********user name **************");
     WebElement username= driver.findElement(By.id("name"));
     username.sendKeys("kiran");
	   
}
}
