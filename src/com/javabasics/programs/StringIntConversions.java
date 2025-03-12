package com.javabasics.programs;

public class StringIntConversions 
{
	public static void main(String[] args) 
	{
		String s = "10";
		int x	 = 20;
		
		int x1 = Integer.valueOf(s);
		int x2 = Integer.parseInt(s);
		
		String s1 = String.valueOf(x);
		String s2 = Integer.toString(x);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(x1);
		System.out.println(x2);		
	}
}
