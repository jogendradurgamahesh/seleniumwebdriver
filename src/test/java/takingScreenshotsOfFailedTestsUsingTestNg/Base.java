package takingScreenshotsOfFailedTestsUsingTestNg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static void initialization() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.google.com");
		
	}
	
	
	public String failed( String testMethodName) {
   
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
//		TakesScreenshot sc=(TakesScreenshot)driver;
//		File src= sc.getScreenshotAs(OutputType.FILE);
		
		
//	try {
//
//	
//		FileUtils.copyFile(src,new File(System.getProperty("user.dir")+"\\\\s1\\\\"+testMethodName+"_"+".jpg"));
//		
//	} catch (IOException e) {
//		
//		e.printStackTrace();
//	}
	

	    String path = System.getProperty("user.dir")+ "/s1/" + testMethodName + ".png";

	    File dest = new File(path);

	    try {
	        FileUtils.copyFile(src, dest);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return path;
	}

}
