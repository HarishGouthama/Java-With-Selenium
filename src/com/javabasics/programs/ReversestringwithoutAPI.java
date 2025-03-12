package com.javabasics.programs;

import java.util.Scanner;

public class ReversestringwithoutAPI
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		String rev = "";
		
		System.out.println("Enter the string:");
		
		String s = scn.next();
		
		for(int i = s.length()-1 ; i >= 0 ; i--)
		{
			rev = rev + s.charAt(i);
		}
		
		System.out.println("Reverse string is: " + rev);
	}
}
