package testNg;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

//	@Test
//	public void infiniteloopTest() {
//		int i=1;
//		while(i==1) {
//			System.out.println(i);
//		}
//	}
	
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
		String s="100a";
		System.out.println(Integer.parseInt(s));
		
	}
}
