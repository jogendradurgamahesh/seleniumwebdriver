package sample13;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInAndOut {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 

		
	
		driver.get("https://testautomationpractice.blogspot.com/");
//		Thread.sleep(5000);
//		driver.manage().window().minimize();
//		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'"); //set zoomlevel-50%
		Thread.sleep(5000);
		
		js.executeScript("document.body.style.zoom='80%'"); //set zoomlevel-80%
		Thread.sleep(5000);

	}

}
