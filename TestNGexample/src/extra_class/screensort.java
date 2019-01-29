package extra_class;

import java.io.File;
import java.io.IOException;

import org.apache.bcel.classfile.Utility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;

public class screensort {
	//static WebDriver driver;
public void   capturescreenshot(WebDriver driver,String screenshotname) throws Exception{


		try {
			TakesScreenshot	ts=(TakesScreenshot)driver;//take screen shot
			File source=ts.getScreenshotAs(OutputType.FILE);//capture screenshot 
			FileUtils.copyFile(source, new File("./screenshot/"+screenshotname+".png"));
		} catch (Exception e) {
			
			System.out.println("Exception while taking Screenshot "+e.getMessage()); 

	
		}
	
		
	

}

/*@testNg executed the code in testNg 
 screensort ss=new screensort();
if(ITestResult.FAILURE==result.getStatus()){
ss.capturescreenshot(driver,result.getName());
	 System.out.println(" ScreenShot Take");*/


/*public static void main(String[] args) {
	 screensort ss=new  screensort();
	screensort.capturescreenshot(driver,"Typeusername" );
}*/
}
