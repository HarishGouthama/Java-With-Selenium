package com.rameshsoftjavawithseleniumjava.programs;

import java.util.HashMap;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("1", "Rameshsoft");
		map.put("10", "Selenium");
		map.put("Hi", "120");
		map.put("Hello", 130);
		map.put(null, null);
		
		System.out.println(map);
	}
}
