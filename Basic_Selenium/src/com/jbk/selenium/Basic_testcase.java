package com.jbk.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_testcase {
public static void main(String[] args) {
	
	System.out.println("1");
	WebDriver wd = new FirefoxDriver();
	wd.get ("file:///C:/Users/Lenovo/Desktop/Selenium%20Software/Offline%20Website/index.html");
	
	
    System.out.println("Testcase 1=== Done"+"Correct email address & correct password click button ");
	/*System.out.println("2");
	WebElement weUser = wd.findElement(By.id("email"));
	weUser.clear();
	weUser.sendKeys("kiran@gmail.com");
	
	System.out.println("4");
	WebElement wePswd = wd.findElement(By.id("password"));
	wePswd.sendKeys("123456");
	
	System.out.println("3");
		WebElement weError1 = wd.findElement(By.id("email_error"));
		String labelError1 = weError1.getText();
		System.out.println(labelError1);

		System.out.println("4");
		WebElement wePswd = wd.findElement(By.id("password"));
		wePswd.sendKeys("123456");
		
		System.out.println("6");
		WebElement weButton = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		weButton.click();
		*/
	
	System.out.println("Testcase  2"+"wrong email address & correct password click button===Done"+"but email=labelerror1 is not showing the console");
	
	/*System.out.println("3");
	WebElement weError1 = wd.findElement(By.id("email_error"));
	String labelError1 = weError1.getText();
	System.out.println(labelError1);

	System.out.println("4");
	WebElement wePswd = wd.findElement(By.id("password"));
	wePswd.sendKeys("123456");
	

	System.out.println("6");
	WebElement weButton = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
	weButton.click();*/
	
	
	System.out.println("Testcase 3"+"Correct email address & wrong password click button===Done"+"but password=weError2 is not showing the console");
	
	/*System.out.println("2");
	WebElement weUser = wd.findElement(By.id("email"));
	weUser.clear();
	weUser.sendKeys("kiran@gmail.com");
	
	
	System.out.println("5");
	WebElement weError2 = wd.findElement(By.id("password_error"));
	String labelError2 = weError2.getText();
	System.out.println(labelError2);

	System.out.println("6");
	WebElement weButton = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
	weButton.click();*/
	
	System.out.println("fix all buges"+"labelerror1 & weError2");
	
	/*System.out.println("7");   //email.id_error path
	WebElement emailerror = wd.findElement(By.id("email_error"));
	System.out.println(emailerror.getText());*/
	
	System.out.println("7");   //email.id_error path
	WebElement emailerror = wd.findElement(By.xpath(".//*[@id='email_error']"));
	System.out.println(emailerror.getText());
	
	System.out.println("8");
	WebElement weUser11 = wd.findElement(By.id("email"));
	weUser11.clear();
	weUser11.sendKeys("kiran@gmail.com");
	
	System.out.println("9");
	WebElement weButtonag = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
	weButtonag.click();
}
}
