
	
	package com.book_chapaturevice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase1 {
	public static void main(String[] args) throws Exception {
		System.out.println("open Firefox browser");
		WebDriver   driver=new FirefoxDriver();
		
		System.out.println("opening the url ");
		driver.get("file:///C:/Users/Lenovo/Desktop/Selenium%20Software/Offline%20Website/index.html");
		 
		System.out.println("maximize window");
		driver.manage().window().maximize();
		
		System.out.println("locate the email element");//testcase 1
		WebElement username=driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys("       ");
		Thread.sleep(500);
		
		System.out.println("locate the password 1 element");//testcase 1
		WebElement psw=driver.findElement(By.id("password"));
		psw.clear();
		psw.sendKeys("       ");
		Thread.sleep(500);
		
	
	System.out.println("locate the email element");//testcase 2
	WebElement username1=driver.findElement(By.id("email"));
	username1.clear();
	username1.sendKeys("krian1@gmail.com");
	Thread.sleep(500);
	
	System.out.println("locate the email element");//testcase 3
	WebElement username2=driver.findElement(By.id("email"));
	username2.clear();
	username2.sendKeys("@##$$%%^^^^&*@gmail.com");
	Thread.sleep(500);
	
	System.out.println("locate the email element");//testcase 4
	WebElement username3=driver.findElement(By.id("email"));
	username3.clear();
	username3.sendKeys("12345667789@gmail.com");
	Thread.sleep(500);
	
	System.out.println("locate the email element");//testcase 5
	WebElement username4=driver.findElement(By.id("email"));
	username4.clear();
	username4.sendKeys("kiran@gmail.com");
	Thread.sleep(500);
	
	System.out.println("locate the email_error element");//testcase 6
	WebElement username5=driver.findElement(By.id("email_error"));
	username5.getText();
 System.out.println(username5);
	
	
	
	
	
	System.out.println("locate the password 2 element");//testcase 2
	WebElement psw1=driver.findElement(By.id("password"));
	psw1.clear();
	psw1.sendKeys("1223333333333");
	Thread.sleep(500);
	
	
	System.out.println("locate the password 3 element");//testcase 3
	WebElement psw2=driver.findElement(By.id("password"));
	psw2.clear();
	psw2.sendKeys("asddffgghj");
	Thread.sleep(500);
	
	System.out.println("locate the password 4 element");//testcase 4
	WebElement psw3=driver.findElement(By.id("password"));
	psw3.clear();
	psw3.sendKeys("asdf12345!@##");
	Thread.sleep(500);
	
	System.out.println("locate the password 4 element");//testcase 5
	WebElement psw4=driver.findElement(By.id("password"));
	psw4.clear();
	psw4.sendKeys("123456");
	
	System.out.println("locate the password_error 4 element");//testcase 6
	WebElement psw5=driver.findElement(By.id("password_error"));
	psw5.getText();
	System.out.println(psw5);
	
	System.out.println("locate click button");//testcase 
	WebElement button=driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
     button.click();
	
	System.out.println("locate the email_error element");//testcase 4
	WebElement username7=driver.findElement(By.id("email_error"));
	username7.getText();
 System.out.println(username7);
 
 System.out.println("locate the email_error element");//testcase 4
	WebElement psw7=driver.findElement(By.id("password_error"));
	psw7.getText();
System.out.println(psw7);

 
}
}