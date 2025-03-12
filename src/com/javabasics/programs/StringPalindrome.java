package com.javabasics.programs;

import java.util.Scanner;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scn.next();
		
		String rev = "";
		char[] chars = str.toCharArray();
		
		for(int i = str.length()-1 ; i >= 0 ; i--)
		{
			rev = rev + chars[i];
		}
		
		System.out.println("Reversed String is: " + rev);
		if(str.equals(rev))
		{
			System.out.println("String is a palindrome.");
		}
		else
		{
			System.out.println("String is not a palindrome.");
		}
	}
}
