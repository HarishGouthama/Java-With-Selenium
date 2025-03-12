package com.rameshsoftjavawithseleniumjava.programs;

import java.util.TreeSet;

public class TreeSetDemo1 
{
	public static void main(String[] args) 
	{
		TreeSet<String> t = new TreeSet<String>();
		t.add(new String("A"));
		t.add(new String("Z"));
		t.add(new String("L"));
		t.add(new String("B"));
		
		System.out.println(t);
	}
}
