package com.rameshsoftjavawithseleniumjava.programs;

import java.util.ArrayList;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList arraylist = new ArrayList<>();
		arraylist.add(10);
		arraylist.add("RameshSoft");
		arraylist.add(10.50);
		arraylist.add(45.6f);
		arraylist.add('A');
		arraylist.add("RameshSoft");
		arraylist.add(20);
		System.out.println(arraylist);
		
		ArrayList arraylist1 = new ArrayList<>();
		arraylist1.addAll(arraylist);
		arraylist1.add(99);
		System.out.println(arraylist1);
		
		ArrayList arraylist2 = new ArrayList<>();
		arraylist2.addAll(arraylist1);
		arraylist2.add("Selenium");
		System.out.println(arraylist2);
	}
}
