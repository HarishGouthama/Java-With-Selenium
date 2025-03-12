package com.javabasics.programs;

public class ImmutableStringDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		s1.concat("123");
		
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Java");
		sb.append("Selenium");
		
		System.out.println(sb);
	}
}
