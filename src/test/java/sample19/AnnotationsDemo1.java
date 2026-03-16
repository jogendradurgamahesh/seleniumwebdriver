package sample19;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 1.login:@BeforeMethod
 2.search:@Test
 3.logout:@AfterMethod
 4.login
 5.Adv search:@Test
 6.logout
 */

public class AnnotationsDemo1 {
	
	@BeforeMethod
	void login() {
		System.out.println("Login");
	}
	
	@Test(priority = 1)
	void search() {
		System.out.println("search");
	}

	@Test(priority = 2)
	void advSearch() {
		System.out.println("adv-Search");
	}
	
	
	@AfterMethod
	void logout() {
		System.out.println("logout");
	}
}
