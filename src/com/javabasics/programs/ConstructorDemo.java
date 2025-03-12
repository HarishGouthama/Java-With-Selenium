package com.javabasics.programs;

public class ConstructorDemo 
{
	int a;
	String name;
	int b;
	
	public ConstructorDemo(int a1 , String str , int b1)
	{
		a 	= a1;
		name = str;
		b   = b1;
		
		System.out.println(a1);
		System.out.println(str);
		System.out.println(b1);
	}
	
	public ConstructorDemo()
	{
		System.out.println("Default Constructor");
	}
	
	public static void main(String[] args) 
	{
		ConstructorDemo cd 	= new ConstructorDemo();
		ConstructorDemo cd1	= new ConstructorDemo(20, "Harry", 30);
		ConstructorDemo cd2 = new ConstructorDemo(40 , "Gharima" , 60);
	}
}
