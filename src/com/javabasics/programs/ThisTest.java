package com.javabasics.programs;

import org.testng.reporters.jq.Main;

public class ThisTest 
{
	int a;
	public ThisTest(int a)
	{
		this.a = a;
	}
}

class ThisTest1 extends ThisTest
{
	int a;
	String str;
	
	ThisTest1(int a)
	{
		super(a);
		this.a = a;
	}
	
	ThisTest1(int a , String str)
	{
		this(a);
		this.str = str;
	}	
		ThisTest1()
		{
			super(10);
			System.out.println("Default constructor");
		}
	
		public static void main(String[] args)
		{
			ThisTest1 test1 = new ThisTest1(10, "java");
			System.out.println(test1);
		}
	}
