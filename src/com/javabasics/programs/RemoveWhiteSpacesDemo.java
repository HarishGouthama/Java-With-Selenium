package com.javabasics.programs;

import java.util.Scanner;

public class RemoveWhiteSpacesDemo 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string: ");
		
		String str = scn.nextLine();
		
		//First way using replaceAll()
		
		str.replaceAll("\\S" , "");
		System.out.println(str);
		
		//Second way using replace
		str = str.replace(" ", "");
		System.out.println(str);
		
		//third way of replacing without API
		char[] ch 		= str.toCharArray();
		StringBuffer sb	= new StringBuffer();
		for(int i = 0 ; i < ch.length ; i++)
		{
			if((ch[i]!=' ') && (ch[i]!= '\t'))
			{
				sb.append(ch[i]);
			}
		}
		
		System.out.println(sb);
	}
}
