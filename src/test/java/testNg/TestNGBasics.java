package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeSuite
	public	void setUp() {
		System.out.println("BeforeSuite ----->  Set Up property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("BeforeTest -----> Launch browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("BeforeClass -----> login to app");
	}
	
	
	
	@BeforeMethod
	public void enterUrl() {
		System.out.println("BeforeMethod -----> enter url");
	}
	
	
	@Test
	public void googleTitleTest() {
		System.out.println("Test ------> googleTitleTest");
	}
	
	@Test
	public void searchText() {
		System.out.println("Test -----> Search text");
	}
	
	
	
	@AfterMethod
	public void logout() {
		System.out.println("AfterMethod ----->  logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AfterClass ----> closeBrowser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("AfterTest-------> deleteAllCookies");
	}
	
	
	
	@AfterSuite
	public void generateReport() {
		System.out.println("AfterSuite------> Generate Report");
	}
	
	
	
	
	
	
	
}
