package com.javabasics.programs;

public class ContinueDemo
{
	public static void main(String[] args) 
	{
		for(int i = 0 ; i <= 100 ; i++)
		{
			if(i == 50)
			{
				continue;
			}
		System.out.println(i);
		}
	}
}