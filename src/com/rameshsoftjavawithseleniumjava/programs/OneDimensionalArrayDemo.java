package com.rameshsoftjavawithseleniumjava.programs;

public class OneDimensionalArrayDemo
{
	public static void main(String[] args) 
	{
		int[] a = new int[20];
		
		a[0] = 12;
		a[4] = 56;
		a[8] = 45;
		a[9] = 10;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
	}
}
