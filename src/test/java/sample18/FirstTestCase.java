package sample18;

import org.testng.annotations.Test;

public class FirstTestCase {

	@Test(priority = 1)
	void openapp() {
		System.out.println("Open app.....");
	}
	
	@Test(priority = 2)
	void login() {
		System.out.println("Login to app........");
	}
	
	@Test(priority = 3)
	void logout() {
		System.out.println("Logout to app.......");
	}
}
