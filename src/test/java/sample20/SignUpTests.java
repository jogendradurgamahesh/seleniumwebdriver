package sample20;

import org.testng.annotations.Test;

public class SignUpTests {

	@Test(priority = 1,groups= {"regression"})
	void signByEmail() {
		System.out.println("sign by email");
	}
	
	@Test(priority = 2,groups= {"regression"})
	void signByFb() {
		System.out.println("sign by Fb");
	}
	
	@Test(priority = 3,groups= {"regression"})
	void signByTwitter() {
		System.out.println("sign by Twitter");
	}
}
