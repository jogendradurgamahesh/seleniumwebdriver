package sample19.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

	@Test 
	void pqr() {
		System.out.println("pqr from c3");
	
	}
	
	@BeforeSuite
	void bs() {
		System.out.println("Before suite");
	}
	
	@AfterSuite
	void as() {
		System.out.println("After suite");
	}
	
}

