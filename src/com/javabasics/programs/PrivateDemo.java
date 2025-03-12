package com.javabasics.programs;
class Test
{
	private int a = 10;
	
	private void greetings()
	{
		System.out.println("Welcome to RameshSoft.");
	}
}

public class PrivateDemo 
{
	public static void main(String[] args) 
	{
		Test test = new Test();
		System.out.println(test.a);
		test.greetings();
	}
}
