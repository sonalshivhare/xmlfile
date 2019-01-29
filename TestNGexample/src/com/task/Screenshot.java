package com.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	static WebDriver driver;
	
public  String getscreenshot(WebDriver driver,String screenshotname)throws Exception{
TakesScreenshot	ts=(TakesScreenshot)driver;
File source=ts.getScreenshotAs(OutputType.FILE);//

String path=System.getProperty("./screenshot/"+screenshotname+".png")+System.currentTimeMillis();
File destination=new File(path);
try {
	FileUtils.copyFile(source, destination);
	
} catch (IOException e) {
System.out.println("Capture failed TestCases"+e.getMessage());
}

	
	
	return path;
	
}
public static void main(String[] args) throws Exception {
	Screenshot ss=new Screenshot ();
	ss.getscreenshot(driver,"Typeusername" );//
	
}
}


