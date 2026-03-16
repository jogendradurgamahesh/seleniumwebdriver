package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	WebDriver driver;
	
	@BeforeMethod()
	public void setUp() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.google.com");
	}
	
	
	@Test()
	public void googleTitleTest() {
	String title=driver.getTitle();
	System.out.println(title);
	
	Assert.assertEquals(title, "Google","Title is not matched ");
	}
	
	@Test()
	public void googleLogoTest() {
		boolean logoTest= driver.findElement(By.xpath("//div[@class='k1zIA rSk4se']//*[name()='svg']")).isDisplayed();
		System.out.println("LogoTest: "+logoTest);
		
		Assert.assertTrue(logoTest);
	}
	
	
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
	
	
}
