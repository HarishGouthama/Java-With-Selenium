package com.rameshsoftjavawithseleniumselenium.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
{
	public static void main(String[] args) 
	{
		ArrayList arraylist =new ArrayList<>();
		arraylist.add("10");
		arraylist.add("Rameshsoft");
	//	arraylist.add(30);
		arraylist.add("Selenium");
		arraylist.add("80");
		arraylist.add("A");
		arraylist.add("50.5f");
		
		System.out.println(arraylist);
		
		Iterator iterator = arraylist.iterator();
		while(iterator.hasNext())
		{
			String string = (String) iterator.next();
			
			if(string.equalsIgnoreCase("RameshSoft"))
			{
				System.out.println("Welcome to rameshsoft software solutions");
			}
			
			if(string.equalsIgnoreCase("Selenium"))
			{
				System.out.println("java with selenium in realtime");
			}
		}		
	}
}
