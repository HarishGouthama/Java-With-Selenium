package com.javabasics.programs;

public class EqualsDemo 
{
	public static void main(String[] args) 
	{
		String str1 = "Hello";
		String str2 = "Hello";
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
		System.out.println(str4 == str3);
		System.out.println(str4.equals(str3));
		
		System.out.println("\n");
		
		//for string buffer and string builder
		
		StringBuffer sb1 = new StringBuffer("Java");
		StringBuffer sb2 = new StringBuffer("Java");
		StringBuffer sb3 = sb2;
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb3 == sb2);
		System.out.println(sb3.equals(sb2));
	}
}
