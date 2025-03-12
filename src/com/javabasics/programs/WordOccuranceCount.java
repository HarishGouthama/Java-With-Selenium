package com.javabasics.programs;

import java.awt.List;
import java.util.Arrays;

public class WordOccuranceCount 
{
	public static void main(String[] args) 
	{
		String str = "Hai Hello Hello Hai Java Selenium";
		
		String[] array = str.split(" ");
		System.out.println(Arrays.toString(array));
		System.out.println("Number of words in an array are: " + array.length);
		
		String search = "Hai";
		
		System.out.println("Length of actual String is: " + str.length());
		System.out.println("length of search string is: " + search.length());
		
		String strar = str.replaceAll("Hai", "");
		int lengthafterreplace = strar.length();
		
		int wordCount = (str.length() - lengthafterreplace) / search.length();
		
		System.out.println("Hello word occurance count is: " + wordCount);
		
	}
}
