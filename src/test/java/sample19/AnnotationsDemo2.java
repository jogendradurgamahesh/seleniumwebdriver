package sample19;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

/*
 1.login:@BeforeClass
 2.search:@Test
 3.Adv search:@Test
 4.logout:@AfterClass
 */

public class AnnotationsDemo2 {
	
	@BeforeClass
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
	
	
	@AfterClass
	void logout() {
		System.out.println("logout");
	}
}
