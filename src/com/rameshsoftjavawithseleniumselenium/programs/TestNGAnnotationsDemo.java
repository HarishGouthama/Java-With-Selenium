package com.rameshsoftjavawithseleniumselenium.programs;

import org.testng.annotations.*;

public class TestNGAnnotationsDemo 
{
	@Test
	public void testCase1()
	{
		System.out.println("This is the test case 1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("This is the test case 2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This will execute before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This will execute after every method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This will execute after class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This will execute after the class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This will execute before the test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This will execute after the test");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This will execute before the test suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This will execute after the test suite");
	}
}
