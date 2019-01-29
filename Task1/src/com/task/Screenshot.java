package com.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	
	public static	String getscreenshot(WebDriver driver,String screenshotname){
TakesScreenshot	ts=(TakesScreenshot)driver;
File surces=ts.getScreenshotAs(OutputType.FILE);
    String path=System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png";
    File destination=new File(path);
    try{
    	FileUtils.copyFile(surces, destination);
    }catch(IOException e){
    	System.out.println("capture failed"+e.getMessage());
    }
	
	return path;
		
	}
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/JBK%20Offline/index.html");
		driver.manage().window().maximize();
		Screenshot.getscreenshot(driver, "abc");
		
	}	

}
		
	

