package com.qa.testcases1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@BeforeClass
	public void beforeClass(){
		System.out.println("Inside Before Class!!");
	}
	
	@BeforeMethod
	public void setUp(){
		System.out.println("inside setup: Before method");
	}
	
	@Test
	public void webLoginHomeLoan(){
		System.out.println("Login weblogin HomeLoan : test methods !!!");
	}
	
	@Test
	public void mobileLoginHomeLoan(){
		System.out.println("Login mobilelogin HomeLoan : test methods !!!");
	}
	
	@Test(groups="smoke")
	public void loginApiHomeLoan(){
		System.out.println("Login loginAPI HomeLoan: test methods !!!");
	}

	@Parameters({"url"})
	@Test
	public void testParameterization(String url){
		System.out.println("URL "+ url );
	}
	
	
	@AfterMethod
	public void tearDown(){
		System.out.println("inside tearDown: After method");
	}

	@AfterClass
	public void afterClass(){
		System.out.println("Inside After class!!");
	}
}
