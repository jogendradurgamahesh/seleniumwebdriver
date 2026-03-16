package sample5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// 1.get()
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();

//		2.getTitle()
		System.out.println(driver.getTitle());

//		3.geturl()
		System.out.println(driver.getCurrentUrl());

//		4.getpageSource()
		 System.out.println(driver.getPageSource());

//		5.getWindowHandle()
		String window1 = driver.getWindowHandle();
		System.out.println("window1 " + window1);

//		6.getWindowHandles()
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windows2 = driver.getWindowHandles();
		System.out.println("windows2 " +windows2);

	}
}
