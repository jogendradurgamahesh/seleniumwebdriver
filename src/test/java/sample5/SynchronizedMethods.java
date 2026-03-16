package sample5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizedMethods {

	public static void main(String[] args) throws InterruptedException {

		         //sleep()
		//		WebDriver driver=new ChromeDriver();
		//
		//	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//		driver.manage().window().maximize();
		//
		//		Thread.sleep(5000);
		//
		//
		//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Mahi");



		//      1.implicit wait
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//
//
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Mahi");
//		driver.close();

		

		//		2.explicit wait
		
	WebDriver driver=new ChromeDriver();
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		
		
		WebElement a=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		a.sendKeys("Admin");
		
		WebElement b=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		b.sendKeys("admin123");
		
		WebElement loginbtn= w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        loginbtn.click();

		
		
		//driver.close();
		
		
		
		
	}

}
