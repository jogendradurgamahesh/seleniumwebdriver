package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.google.com");
		
	}
	
	@Test(priority = 1,groups="Title")
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println("Title: "+title);
	}
	
	@Test(priority = 2,groups="logo")
	public void googleLogoTest() {
		boolean logoTest= driver.findElement(By.xpath("//div[@class='k1zIA rSk4se']//*[name()='svg']")).isDisplayed();
		System.out.println("LogoTest: "+logoTest);
	}
	
	@Test(priority = 3,groups="linktext")
	public void mailLinkTest() {
//	boolean mail=	driver.findElement(By.xpath("//*[@class='gb_Z' and normalize-space()='Gmail' ]")).isDisplayed();
//	System.out.println("MAil: "+mail);
		
	boolean mail=	driver.findElement(By.linkText("Gmail")).isDisplayed();
	System.out.println(mail);
	}
	
	
	@Test(priority = 4,groups="Test")
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test(priority = 5,groups="Test")
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test(priority = 6,groups="Test")
	public void test3() {
		System.out.println("Test3");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
