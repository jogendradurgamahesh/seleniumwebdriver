package sample6;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// HandleAlert Without Using switchTo().alert()
public class HandleAlertWithoutUsingSwitch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(5000));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		//		1.normal alert with ok window

		/*		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);


	//	we need to do without using driver.switchTo().alert().accept();
		//Alert myalert= driver.switchTo().alert();

		Alert myalert= webDriverWait.until(ExpectedConditions.alertIsPresent()); //it captures wait
		System.out.println(myalert.getText());
		myalert.accept();         */



		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);

		//driver.switchTo().alert().accept();  //close alert using ok command
		//	driver.switchTo().alert().dismiss();  //close alert using cancel command

		Alert myalert=webDriverWait.until(ExpectedConditions.alertIsPresent()); 
		System.out.println(myalert.getText());
		myalert.accept(); 

	}

}
