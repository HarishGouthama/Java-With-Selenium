package com.javabasics.programs;

import java.util.Arrays;

public class AnagramsDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 = "elloh";
		
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		boolean status;
		
		Arrays.sort(ch1);
		System.out.println(ch1);
		
		Arrays.sort(ch2);
		System.out.println(ch2);
		
		status = Arrays.equals(ch1, ch2);
		
		if(status = true)
		{
			System.out.println("Both strings are anagrams");
		}
		
		else
		{
			System.out.println("Both Strings are not anagrams");
		}
	}
}
