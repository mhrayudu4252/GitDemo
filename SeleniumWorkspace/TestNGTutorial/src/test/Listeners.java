package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is an interface which implements TestNG listeners
public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("I Successfully executed listeners pass code");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//screenshot code
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}
	
	
}
