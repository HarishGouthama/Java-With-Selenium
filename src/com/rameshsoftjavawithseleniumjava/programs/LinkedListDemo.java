package com.rameshsoftjavawithseleniumjava.programs;

import java.util.LinkedList;

public class LinkedListDemo
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList<>();
		l.add("RameshSoft");
		l.add(30);
		l.add(null);
		l.add("Rameshsoft");
		l.set(0 ,  "Java");
		
		System.out.println(l);
		
		l.removeLast();
		
		System.out.println(l);
		
		l.addFirst("RealTimeTraining");
		System.out.println(l);
	}
}
