package sample23;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest1 {

	WebDriver driver;
	
	@BeforeClass
	void setUp() throws InterruptedException {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    Thread.sleep(3000);  
	}
	
	@Test
	void testLogin() throws InterruptedException {
		LoginPage1 lp=new LoginPage1(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void tearDown() {
		driver.quit(); 
	}
}
