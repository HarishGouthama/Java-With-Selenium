package com.rameshsoftautomation.TestngPrograms;

import org.testng.annotations.*;

//GroupsDemo1.java

public class GroupsDemo1
{
	@Test(groups = "rt")
	public void m1()
	{
		System.out.println("m1() rt");
	}
	
	@Test(groups = "rt")
	public void m2()
	{
		System.out.println("m2() rt");
	}
	
	@Test(groups = "st")
	public void m3()
	{
		System.out.println("m3() st");
	}
}
