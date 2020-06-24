package com.qa.testcases1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//Interface ITestListener implements testng listener
//When test failed this class listen to it
//e.g onTestFailure method is called on test failure

public class Listeners implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("I failed executed Listener onTestFailure code"+ arg0.getName());  //getName will print name of testMethod failed
		//get screenshot code here if failure occurs
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	//Execute the below mehtod when test is success.
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("I successfully executed Listener Passed code");
	}

}


//Note: We need to tell testNg.xml where is this class located
