package sample21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;

	@BeforeMethod
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

	}

	@Test(dataProvider = "dp")
	void login(String email,String password) throws InterruptedException {
//		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		boolean status=	driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();

		}
	}

	@AfterMethod
	void tearDown() {
		driver.close();
	}
	
	
	
	
//	@DataProvider(name="dp",indices= {0})
	@DataProvider(name="dp")
	Object[][] loginData() {
		Object data[][]= {
				{"ugginamahesh98@gmail.com","mahesh"},
				{"xyz@gmail.com","xyz"},
				{"jogendramahesh123@gmail.com","prince"},
				{"abc@gmail.com","abc"},
				
				};
		return data;
	}
	
	
	
	
	
	
	
	
}
