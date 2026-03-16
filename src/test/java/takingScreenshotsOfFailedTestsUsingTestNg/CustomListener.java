package takingScreenshotsOfFailedTestsUsingTestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
    public void onTestSuccess(ITestResult result) {
		  System.out.println("Test Passed: " + result.getName());
	}
    
	@Override
   public void onTestFailure(ITestResult result) {
		System.out.println("Failed Test");
		failed(result.getMethod().getMethodName());
	}
   
	@Override
   public void onTestSkipped(ITestResult result) {
		
	}
   

   public void onStart(ITestContext context) {
		
	}
   
	@Override
   public void onFinish(ITestContext context) {
		
	}



}
