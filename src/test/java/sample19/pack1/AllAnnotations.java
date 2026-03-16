package sample19.pack1;

import org.testng.annotations.*;

public class AllAnnotations {

	@BeforeSuite
	void bs() {
		System.out.println("Before suite");
	}
	
	@AfterSuite
	void as() {
		System.out.println("After suite");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("Before test");
	}
	
	@AfterTest
	void at() {
		System.out.println("After test");
	}
	
	@BeforeClass
	void bc() {
		System.out.println("Before class");
	}
	
	@AfterClass
	void ac() {
		System.out.println("After class");
	}
	
	
	@BeforeMethod
	void bm() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	void am() {
		System.out.println("After method");
	}
	
	@Test(priority = 1)
	void main1() {
		System.out.println("Success1");
	}
	
	@Test(priority = 2)
	void main2() {
		System.out.println("Success2");
	}
	
	
	
	
	
	
}
