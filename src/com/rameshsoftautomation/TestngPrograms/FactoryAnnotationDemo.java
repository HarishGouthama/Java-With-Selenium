package com.rameshsoftautomation.TestngPrograms;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryAnnotationDemo
{
	@Factory
	public Object[] factoryMethod()
	{
		return new Object[]
				{
						new Factory1("1"), new Factory1("2"),
						new Factory1() , new Factory1("Hai" , 10)
				};
	}
	
	public class Factory1
	{
		private String S = " ";
		private int a;
		
		Factory1()
		{
			System.out.println("Default Constructor");
		}
		
		Factory1(String S)
		{
			this.S = S;
			System.out.println("Parameterized (Single) constructor " + this.S);
		}
		
		Factory1(String S , int a)
		{
			this.S = S;
			this.a = 10;
			System.out.println("Parameterized (double) constructor " + this.S + " and a is : " + this.a);
		}
		
		@BeforeClass
		void m1()
		{
			System.out.println("Before Class Executing");
		}
		
		@Test
		public void method()
		{
			System.out.println("Running Test....." + this.S + " and " + this.a);
		}
	}
}
