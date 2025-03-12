package com.javabasics.programs;

public class MergeStringsDemo 
{
	public static void main(String[] args) 
	{
		merge("AA" , "BBBB");
		merge("xxxx" , "yyyy");
		merge(" " , "vvv");
		merge("BBB" , " ");
		merge("GGGGG" , " ");
	}
	
	public static String merge(String s1 , String s2)
	{
		int i = 0;
		int j = 0;
		String mergeString = " ";
		
		while(i < s1.length() && j < s2.length())
		{
			mergeString = mergeString + s1.charAt(i) + s2.charAt(j);
			i++ ;
			j++ ;
		}
		
		while(i > s1.length() || j < s2.length())
		{ 
			mergeString = mergeString + s2.charAt(j);
			j++;
		}
		
		while(j > s2.length() || i < s1.length())
		{
			mergeString = mergeString + s1.charAt(i);
			i++ ;
		}
		
		System.out.println("Merging of both Strings are: " + " " + s1 + " " + " " + s2 + mergeString);
		return mergeString;
	}
}
