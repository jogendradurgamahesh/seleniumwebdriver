package sample20;

import org.testng.annotations.Test;

public class PaymentTests {

	@Test(priority = 1,groups= {"sanity","regression","functional"})
	void paymentInRs() {
		System.out.println("Ruppes");
	}
	
	@Test(priority = 2,groups= {"sanity","regression","functional"})
	void paymentInDollars() {
		System.out.println("Dollars");
	}
}
