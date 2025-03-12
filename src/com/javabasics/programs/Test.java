package com.javabasics.programs;

abstract class Test1
{
	int a = 10 , b = 30;
	public void hello()
	{
		System.out.println(a);
		System.out.println(b);
	}
}

public class Test extends Test1
{
	public static void main(String[] args) 
	{
		Test test = new Test();
		System.out.println(test.a);
		System.out.println(test.b);
		
		System.out.println("Welcome to rameshsoft");
		test.hello();
	}
}
