package com.javabasics.programs;

import java.util.HashMap;
import java.util.Set;

public class RepeativeWordCountDemo 
{
	public static void main(String[] args) 
	{
		wordCount("cat dog dog cat pen pencil pencil pen");
		wordCount("AAA BBB CCC AAA BBB DDD EEE");
	}
	
	public static void wordCount(String str)
	{
		HashMap<String, Integer> hmp =new HashMap<String , Integer>();
		String[] array = str.split("\\s+");
		
		for(String s : array)
		{
			if(hmp.containsKey(s))
			{
				hmp.put(s, hmp.get(s)+1);
			}
			else
			{
				hmp.put(s, 1);
			}
		}
		Set<String> keys = hmp.keySet();
		for(String key : keys)
		{
			if(hmp.get(key)>1)
			{
				System.out.println("Duplicate word is: " +" "+ key + "Occured" + hmp.get(key) + "times");
			}
		}
	}
}
