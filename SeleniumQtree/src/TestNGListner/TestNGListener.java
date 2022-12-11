package TestNGListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{


	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test is sucess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		System.out.println("Test is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test is SKIPPED");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test is started");
	}
	
	
	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Test is finished");
	}
	
	
	
	

}
