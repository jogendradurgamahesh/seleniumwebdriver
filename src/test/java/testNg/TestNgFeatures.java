package testNg;

import org.testng.annotations.Test;



public class TestNgFeatures {

	@Test
	public void loginPageTest() {
		System.out.println("Login page");
		//int i=10/0;
	}
	
	@Test(dependsOnMethods = {"loginPageTest"})
	public void homePageTest() {
		System.out.println("Home page");
	}
	
	@Test(dependsOnMethods = {"loginPageTest"})
	public void searchPageTest() {
		System.out.println("searchPageTest page");
	}
	
	
	@Test(dependsOnMethods = {"loginPageTest"})
	public void regPageTest() {
		System.out.println("regPageTest page");
	}
	
	
	
	
}
