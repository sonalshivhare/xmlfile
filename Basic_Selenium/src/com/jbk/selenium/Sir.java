package com.jbk.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sir {
public static void main(String[] args) throws Exception {
	System.out.println("1");
	WebDriver wd = new FirefoxDriver();
	wd.get ("file:///C:/Users/Lenovo/Desktop/Selenium%20Software/Offline%20Website/index.html");
	
	System.out.println("2");
	WebElement weUser = wd.findElement(By.id("email"));
	weUser.clear();
	weUser.sendKeys("kiran@gmaill.com");
	
	System.out.println("3");
	WebElement weError1 = wd.findElement(By.id("email_error"));
	String labelError1 = weError1.getText();
	System.out.println(labelError1);
	
	System.out.println("4");
	WebElement wePswd = wd.findElement(By.id("password"));
	wePswd.sendKeys("123456");
	
	System.out.println("5");
	WebElement weError2 = wd.findElement(By.id("password_error"));
	String labelError2 = weError2.getText();
	System.out.println(labelError2);
	
	System.out.println("6");
	WebElement weButton = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
	weButton.click();
	
	System.out.println("7");   //email.id_error path
	WebElement emailerror = wd.findElement(By.xpath(".//*[@id='email_error']"));
	System.out.println(emailerror.getText());//correct email massage provide here and display
	
	System.out.println("8");
	WebElement weUser11 = wd.findElement(By.id("email"));
	weUser11.clear();
	weUser11.sendKeys("kiran@gmail.com");
	
	System.out.println("9"); //sign in button
	WebElement weButtonag = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
	weButtonag.click();
	
	System.out.println("10");//user menu
	WebElement weUser1 = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
	weUser1.click();
	
	System.out.println("11");//adduser button 
	WebElement weAddUser = wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
	weAddUser.click();
	Thread.sleep(500);
	
/*System.out.println("12"); //new user add name
	WebElement weUname = wd.findElement(By.xpath(".//*[@id='username']"));
	weUname.sendKeys("darshit");
	
	System.out.println("13"); //add mobile number
	 WebElement weMob = wd.findElement(By.xpath(".//*[@id='mobile']"));
	weMob.sendKeys("111112");
	
	System.out.println("15");
	WebElement weEmail = wd.findElement(By.xpath(".//*[@id='email']"));
	weEmail.sendKeys("darshit@gmail.com");
	
	System.out.println("16");
	WebElement weGender = wd.findElement(By.xpath(".//*[@id='Female']"));
	weGender.click();
	
	System.out.println("17");
	Select s=new Select(wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select")));
	Thread.sleep(2000);
	s.selectByVisibleText("Punjab");
	
	System.out.println("18");
	WebElement wePwd = wd.findElement(By.xpath(".//*[@id='password']"));
	wePwd.sendKeys("123789");
	
	System.out.println("19");
	WebElement weSubmit = wd.findElement(By.xpath(".//*[@id='submit']"));
	weSubmit.click();
	*/
	
	
	
	
	
	
	
}
}
