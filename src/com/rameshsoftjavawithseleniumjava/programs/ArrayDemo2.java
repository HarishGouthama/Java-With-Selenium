package com.rameshsoftjavawithseleniumjava.programs;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayDemo2 
{
	public static void main(String[] args) 
	{
		ArrayList arraylist = new ArrayList();
		arraylist.add(10);
		arraylist.add("Rameshsoft");
		arraylist.add("Rameshsoft");
		arraylist.add(10);
		arraylist.add(10);
		
		System.out.println(arraylist);
		
		HashSet hashset = new HashSet(arraylist);
		System.out.println(hashset);
		
	}	
}
