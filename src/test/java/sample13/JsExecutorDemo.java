package sample13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver(); //need typecasting as Chromedriver is not directly intreacting because of web driver
		//   ChromeDriver driver=new ChromeDriver(); //no need of typecasting JavascriptExecutor because child obj can parent class

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//1.using sendKeys
		WebElement name=  driver.findElement(By.xpath("//input[@id='name']"));
		//  name.sendKeys("Prince");

		//instead of sendKeys i am using jsExecutor
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//  JavascriptExecutor js=driver;

		//passing the text into inputbox-alternate of sendKeys()
//		js.executeScript("arguments[0].setAttribute('value','prince')", name);
		js.executeScript("arguments[0].value='Prince'", name);
		
		
		
//		2.using click
		WebElement clickButton=  driver.findElement(By.xpath("//input[@id='female']"));
//		clickButton.click();
		
//		using jsEx instead of  click()
		js.executeScript("arguments[0].click()", clickButton);
		
		
//		3.scroll down
		 //scroll down by pixel number
		js.executeScript("window.scrollBy(0, 1000)","");
//		System.out.println(js.executeScript("return window.pageYOffset"));
		
		//scroll down to end of the doc
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));
		
		Thread.sleep(5000);
		
		//scroll to start of doc
		js.executeScript("window.scrollBy( 0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));



	}

}
