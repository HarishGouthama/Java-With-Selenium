package com.rameshsoftjavawithseleniumjava.programs;

import java.util.HashSet;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet hashset = new HashSet();
		hashset.add(10);
		hashset.add("RameshSoft");
		hashset.add("Selenium");
		hashset.add(null);
		hashset.add("Selenium");
		hashset.add(10);
		hashset.add('A');
		
		System.out.println(hashset);
	}
}
