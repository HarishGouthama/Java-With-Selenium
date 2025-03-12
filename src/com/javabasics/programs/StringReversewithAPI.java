package com.javabasics.programs;

import java.util.Scanner;

public class StringReversewithAPI
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1 = scn.next();
		
		String rev = "";
		
		rev = new StringBuffer(s1).reverse().toString();
		
		System.out.println("Reverse of string is : " + rev);
	}
}
