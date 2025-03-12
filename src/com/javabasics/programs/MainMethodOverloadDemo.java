package com.javabasics.programs;

public class MainMethodOverloadDemo
{
	
	public static void main(String[] args) 
	{
		System.out.println("Standard main method");
	}
	
	public static void main(int[] args)
	{
		System.out.println("int[] array main");
	}
	
	public static void main()
	{
		System.out.println("No Parameterized main()");
	}
	
}
