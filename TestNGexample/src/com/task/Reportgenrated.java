package com.task;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reportgenrated {
@Test
	public void logintest() throws IOException{
		ExtentHtmlReporter reporter=new  ExtentHtmlReporter("./Reports/c1234.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("logintest");
		logger.log(Status.INFO, "login to amazan");
	

		logger.log(Status.PASS, "Title verificatio");
		//logger.log(Status.FAIL, "Title verification");
		
		logger.addScreenCaptureFromPath("\\TestNGexample\\screenshot\\verify_Home.png");//manual put here image path
		extent.flush();
		
		ExtentTest logger2=extent.createTest("logoff test");
		logger2.log(Status.FAIL, "Title verification");
		//logger2.fail("detials", MediaEntityBuilder.createScreenCaptureFromPath("screensho.png").build());//take screenshot
		extent.flush();
}
}
