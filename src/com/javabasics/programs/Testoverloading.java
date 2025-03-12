package com.javabasics.programs;

public class Testoverloading
{
	int 		a;
	String 		str;
	float		b ;
	
	public Testoverloading(int a1 , String str1)
	{
		a = a1;
		str =str1;
		System.out.println(a1);
		System.out.println(str);
	}
	
	public Testoverloading()
	{
		System.out.println("Default COnstructor");
	}
	
	public Testoverloading(float b1)
	{
		b = b1;
		System.out.println(b);
	}
	
	public static void main(String[] args)
	{
		Testoverloading test1 = new Testoverloading(10, "Hello");
		Testoverloading test2 = new Testoverloading();
		Testoverloading test3 = new Testoverloading(10.3f);
		
		
	}
}
