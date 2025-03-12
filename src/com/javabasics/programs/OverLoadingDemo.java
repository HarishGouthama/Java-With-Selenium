package com.javabasics.programs;

import java.io.InputStream;
import java.util.Scanner;

class Demo1

{
	//Scanner scn = new Scanner(System.in);
	int a ; 
	int b ; 
	
	public void add(int a , int b)
	{
		
		int c = a + b;
		System.out.println("INT Method");
		System.out.println(c);
	}
	
	

	public void add(float a , float b)
	{
		float c = a + b;
		System.out.println("Float Method");
		System.out.println(c);
	}
	
	public void add(double a , double b)
	{
		double c = a + b;
		System.out.println("Double Method");
		System.out.println(c);
	}
	
	public void add()
	{
		System.out.println("No Arguments add() Method");
	}
}

public class OverLoadingDemo 
{
	public static void main(String[] args) 
	{
		BreakDemo demo = new BreakDemo();
		demo.add();
		demo.add(554 , 5464);
		demo.add(212354.2,546132.2);
		demo.add(21352.1235f,4564.45685f);
	}
}
