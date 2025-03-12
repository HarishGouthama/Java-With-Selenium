package com.javabasics.programs;

public class TestDemo3
{
	int a = 10;
	static int b = 20;
	
	public void hello()
	{
		System.out.println("Hello");
	}
	
	public static void display()
	{
		System.out.println("Display");
	}
	
	public static void main(String[] args) 
	{
		Object b = TestDemo3.b;
		System.out.println(b);
		TestDemo3.display();
		
		TestDemo3 demo = new TestDemo3();
		Object a = demo.a;
		System.out.println(a);
		
		demo.hello();
	}
}
