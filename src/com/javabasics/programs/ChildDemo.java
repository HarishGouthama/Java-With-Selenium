package com.javabasics.programs;

class Demo
{
	public static void m1()
	{
		System.out.println("Parent static method");
	}


public class static childDemo extends Demo
{
	@Override
	public void m1()
	{
		System.out.println("child static method");
	}
	
	public static void main(String[] args) 
	{
		
	}
}
}

