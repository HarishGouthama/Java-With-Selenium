package com.rameshsoftautomation.TestngPrograms;

import org.testng.annotations.*;

public class DependsOnGroupsDemo 
{
	@Test(groups = {"group1"})
	public void testPrintWelcomeMessage()
	{
		System.out.println("Welcome to rameshsoft");
	}
	
	@Test(dependsOnGroups = {"group1.*"})
	public void testMessage()
	{
		System.out.println("Masters in java with Selenium");
	}
	
	@Test(groups = {"group1"})
	public void testLocation()
	{
		System.out.println("At Hyderabad");
	}
}
