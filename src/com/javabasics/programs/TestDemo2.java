package com.javabasics.programs;

public class TestDemo2
{
	int a = 10;
	static int b = 20;
	
	public void hello()
	{
		System.out.println("Hello");
	}
	
	public static void display()
	{
		System.out.println("Welcome to Rameshsoft");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("The value of b is : " + b);
		display();
		
		TestDemo2 demo = new TestDemo2();
		System.out.println("The value of a is : " + demo.a);
		demo.hello();		
	}
}
