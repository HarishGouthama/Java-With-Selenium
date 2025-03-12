package com.javabasics.programs;

abstract class Testtwo
{
	abstract public void m1();
	abstract public void m2();
	
	public void m3()
	{
		System.out.println("m3");
	}
	
	public void m4()
	{
		System.out.println("m4");
	}
}
	class TestThree extends Testtwo
	{
		public void m1()
		{
			System.out.println("m1");
		}
		
		public void m2()
		{
			System.out.println("m2");
		}
	}

public class AbstractDemo
{
	public static void main(String[] args) 
	{
		TestThree test = new TestThree();
		test.m1();
		test.m2();
		test.m3();
		test.m4();
	}
}

