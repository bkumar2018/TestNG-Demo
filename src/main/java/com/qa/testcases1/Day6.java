package com.qa.testcases1;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Day6 {


	
	@Test
	public void webLoginHomeLoan(){
		System.out.println("Login weblogin HomeLoan : test methods !!!");
	}
	
	@Test(groups="smoke")
	public void mobileLoginHL(){
		System.out.println("mobileLoginHL");
	}
	
	
	//@Test(dependsOnMethods={"testmethod name","method1"})
	//@Test(enabled=false)
	//@Test(timeOut=4000)  Thats method will wait for 40 sec before get errors
	
	//API token access key is required to run API's hence its global or common attribute, hence can be parameterized
	//Suite level parameterization access to all and Test level parameterization access to only those classes which are in <test></test> tag
	
	
	@Parameters({"url"})
	@Test(groups="smoke")
	public void testParamterized(String url){
		System.out.println("URL : "+ url);
	}
	
	@Test(dataProvider="getData")
	public void testgDataProvider(String data1, String value1){
		System.out.println("Data1:" + data1);
		System.out.println("Value1:" + value1);
	}
	
	@DataProvider
	public  Object[][] getData(){
		//How many value to be passed 
		//1. username n passwd
		//2. username n passwd
		//3. credit history fraud
		
		//define multi dimensional array
		Object[][] data = new Object[3][2];  //3 row and 2 column		
		//1 Set
		data[0][0] = "birender";
		data[0][1] = "1234";
		//2 set
		data[1][0] = "biru";
		data[1][1] = "5678";
		//3 set
		data[2][0] = "thirddata";
		data[2][1] = "thirdvalue";
		
		return data;
	}
	
	@Test
	public void testFailure(){
		System.out.println("Inside testFailure: of class Day6 !!!");
		Assert.assertTrue(false);
	}
}


//Parameterization in TestNG can be done 2 ways:
//1. Using DataProvider, parameterization to method.
//2. Parameter in testng.xml file: You can drive the data from testng.xml file


//Listener:
//1. Listen the test cases
