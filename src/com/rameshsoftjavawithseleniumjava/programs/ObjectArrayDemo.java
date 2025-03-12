package com.rameshsoftjavawithseleniumjava.programs;

public class ObjectArrayDemo 
{
	public static void main(String[] args) 
	{
		Object[] obj 	= new Object[20];
		obj[0]		 	= 12;
		obj[1]			= 89.58;
		obj[4]			= "RameshSoft";
		obj[8]			= 45.50f;
		obj[9]			= 10;
		
		for(int i = 0 ; i < obj.length ; i++)
		{
			System.out.println(obj[i]);
		}
	}
}
