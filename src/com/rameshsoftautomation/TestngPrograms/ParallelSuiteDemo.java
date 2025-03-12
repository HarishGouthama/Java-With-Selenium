package com.rameshsoftautomation.TestngPrograms;

import org.testng.annotations.*;

public class ParallelSuiteDemo
{
	String testName = " ";
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Initializing Suite");
	}
	
	@BeforeTest
	@Parameters({"testName"})
	public void beforeTest(@Optional("Default Test") String testName)
	{
		this.testName = testName;
		long id = Thread.currentThread().getId();
		System.out.println("Before Test " + testName + ".Thread id is : " + id);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Before Test-class " + testName + ".Thread id is : " + id);
	}
	
	@Test
	public void testMethodOne()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test Method1 " + testName + ".Thread id is : " + id);
	}
	
	@AfterClass
	public void afterClass()
	{
		long id = Thread.currentThread().getId();
		System.out.println("After Class " + testName + ".Thread id is : " + id);
	}
	
	@AfterTest
	public void afterTest()
	{
		long id = Thread.currentThread().getId();
		System.out.println("After Test " + testName + ".Thread id is : " + id);
	}
}
