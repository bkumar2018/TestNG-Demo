package com.qa.testcases1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day5 {

	@BeforeSuite
	public void firstSuite(){
		System.out.println("Inside before suite!!");
	}
	
	@BeforeTest
	public void setUp(){
		System.out.println("Call BeforeTest every method!!!");
	}
	
	@Test(groups="smoke")
	public void webLoginHomeLoan(){
		System.out.println("Login weblogin HomeLoan : test methods !!!");
	}
	
	@Parameters({"url","apiKey"})
	@Test
	public void testParameters(String url, String api){
		System.out.println("url testLevel "+ url);
		System.out.println("apikey testLevel "+ api);
	}
	
	@AfterTest
	public void tearDown(){
		System.out.println("Call AfterTest every after method!!");
	}
	
	@AfterSuite
	public void tearfirstSuite(){
		System.out.println("Inside After suite !!!");
	}
}
