package sample6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		//		1.normal alert with ok window

		/*		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);


	//	driver.switchTo().alert().accept();
		Alert myalert= driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();                    */


		//		2.conformatation alert:ok/cancel
				driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
				Thread.sleep(5000);

		//driver.switchTo().alert().accept();  //close alert using ok command
		//	driver.switchTo().alert().dismiss();  //close alert using cancel command

			Alert myalert=driver.switchTo().alert(); 
		System.out.println(myalert.getText());
		myalert.accept(); 

		/*	Alert myalert=driver.switchTo().alert(); 
		System.out.println(myalert.getText());
		myalert.dismiss();     */ 



		//		3.prompt alert-input box
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//		Thread.sleep(5000);
//
//
//		Alert my_alert=driver.switchTo().alert();
//		my_alert.sendKeys("Mahesh");
//		my_alert.accept();


	}

}
