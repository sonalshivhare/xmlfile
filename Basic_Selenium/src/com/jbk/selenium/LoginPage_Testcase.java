package com.jbk.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage_Testcase {
public static void main(String[] args) {
	System.out.println("*********Open the browser******");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Lenovo/Desktop/Selenium%20Software/Offline%20Website/index.html");
	
	System.out.println("********check text heading********");
    WebElement   webheading=driver.findElement(By.xpath("html/body/div[1]/div[1]/a"));
          webheading.getText();
		System.out.println(webheading.getText());
		 WebElement   websize=driver.findElement(By.xpath("html/body/div[1]/div[1]"));
		 websize.getSize();
		 System.out.println(websize.getSize());
		 
		 
		System.out.println("*******loginpage body*****");
      WebElement  loginbody=driver.findElement(By.xpath("html/body"));
        loginbody.getSize();
        System.out.println(loginbody.getSize());
        loginbody.getLocation();
        System.out.println(loginbody.getLocation());
        loginbody.isDisplayed();
        System.out.println(loginbody.isDisplayed());
		
		 System.out.println("********Login box*******");
	      WebElement  loginbox =driver.findElement(By.xpath("html/body/div[1]/div[2]"));
	        loginbox.getSize();
	        System.out.println(loginbox.getSize());
	        loginbox.getLocation();
	        System.out.println(loginbox.getLocation());
	        loginbox.isDisplayed();
	        System.out.println(loginbox.isDisplayed());
		
		
		
		System.out.println("*******sign in text*****");
		WebElement signintext=driver.findElement(By.xpath("html/body/div[1]/div[2]/p"));
		signintext.getText();
		System.out.println(signintext.getText());
		
		System.out.println("********New registeration text*******");
        WebElement	regtext=driver.findElement(By.xpath("html/body/div[1]/div[2]/a"));
        regtext.getText();
        System.out.println( regtext.getText());
      
            
	System.out.println("*********Email id only********");
       WebElement	userid=driver.findElement(By.id("email"));
         userid.sendKeys("   ");
         
  
   System.out.println("*******Password*******");
       WebElement pw=driver.findElement(By.id("password"));
	       pw.sendKeys("    ");
	
	System.out.println("********locate button********");
	    WebElement button=driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
	        button.click();
	
	        
	System.out.println("******New membership for login page********");
   WebElement	newmember=driver.findElement(By.xpath("html/body/div[1]/div[2]/a"));
   newmember.click();
	}
}
