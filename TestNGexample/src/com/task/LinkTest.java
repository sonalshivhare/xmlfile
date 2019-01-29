package com.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Lenovo/Desktop/JBK%20Offline/index.html");
	driver.manage().window().maximize();
	
	System.out.println(1);
	WebElement home=driver.findElement(By.xpath(".//a[@ href='index.html']"));
	home.click();
    Thread.sleep(2000);
    
    System.out.println(2);
	WebElement aboutsir=driver.findElement(By.xpath("//a[@ href='about-us.html']"));
	aboutsir.click();
	Thread.sleep(2000);
	
	System.out.println(3);
		WebElement javasyllabus=driver.findElement(By.xpath(".//a[@ href='core-java-j2eee-syllabus.html']"));
		javasyllabus.click();
		Thread.sleep(2000);
		
		System.out.println(4);
		WebElement seleniumtesting=driver.findElement(By.xpath(".//a[@ href='selenium-testing-in-pune.html']"));
		seleniumtesting.click();
		Thread.sleep(2000);
		
		System.out.println(5);
		WebElement angularsyllbus=driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[5]/a"));
		angularsyllbus.click();
		Thread.sleep(2000);
		
		
		
		System.out.println(6);
		WebElement videos=driver.findElement(By.xpath(".//a[@ href='java-by-kiran-videos.html']"));
		 videos.click();
		 Thread.sleep(5000);
		Alert alert= driver.switchTo().alert();
		//System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(10000);
	     
		
		System.out.println(7);
		WebElement services=driver.findElement(By.xpath(".//a[@ href='services.html']"));
		services.click();
		Thread.sleep(2000);
		

		System.out.println(8);
		WebElement careers=driver.findElement(By.xpath(".//a[@ href='careers.html']"));
		careers.click();
		Thread.sleep(2000);
		
		System.out.println(8.1);
		WebElement recruiters=driver.findElement(By.xpath(".//a[@ href='recruitment-section.html']"));
		recruiters.click();
		Thread.sleep(2000);
		
		
	System.out.println(9);
		WebElement gallery=driver.findElement(By.xpath(".//a[@href='gallery.html']"));
		gallery.click();
		Thread.sleep(2000);
		
		System.out.println(10);
		WebElement myjavabook=driver.findElement(By.xpath(".//a [@href='java-by-kiran-book.html']"));
		myjavabook.click();
		Thread.sleep(2000);
		
		System.out.println(11);
		WebElement oldstudentfeedback=driver.findElement(By.xpath(".//a[@ href='old-student-feedback-java-by-kiran.html']"));
		oldstudentfeedback.click();
		Thread.sleep(2000);
		
		System.out.println(12);
		WebElement classroomex=driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[12]/a'] "));
		classroomex.click();
		Thread.sleep(2000);
		
		/*System.out.println(13);
		WebElement contact=driver.findElement(By.xpath(".//a[@ href='java-classes-contact-pune.html']"));
		contact.click();
		Thread.sleep(2000);
		
		System.out.println(14);
		WebElement interviewques=driver.findElement(By.xpath(".//a[@ href='corejava-j2ee-selenium-testing-interview-question-answer.html']"));
		interviewques.click();
		Thread.sleep(2000);
		
		
		
		System.out.println(15);
		WebElement tutorials=driver.findElement(By.xpath(".//a[@ href='tutorials.html']"));
		tutorials.click();
		Thread.sleep(2000);
		
		System.out.println(15.1);
		WebElement assignment=driver.findElement(By.xpath(".//a[@ href='assignments.html']"));
		assignment.click();
		Thread.sleep(2000);
		
		System.out.println(16);
		WebElement corporatetraining=driver.findElement(By.xpath(".//a[@ href='corporate-training.html']"));
		corporatetraining.click();
		Thread.sleep(2000);
		
		driver.quit();*/
		
		
}
}
