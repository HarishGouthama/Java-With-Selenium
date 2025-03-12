package com.javabasics.programs;

import java.util.Scanner;

class Demo1

{
	Scanner scn = new Scanner(System.in);
	
	
	public void addintegers()
	{
		System.out.println("Enter 'a' number");
		int a = scn.nextInt(); 
		System.out.println("Enter 'b' number");
		int b = scn.nextInt(); 
		int c = a + b;
		System.out.println("INT Method");
		System.out.println(c);
	}
	
	

	public void addfloating()
	{
		System.out.println("Enter 'a' number");
		float a = scn.nextFloat(); 
		System.out.println("Enter 'b' number");
		float b = scn.nextFloat(); 
		float c = a + b;
		System.out.println("Float Method");
		System.out.println(c);
	}
	
	public void addDoubles()
	{
		System.out.println("Enter 'a' number");
		float a = scn.nextFloat(); 
		System.out.println("Enter 'b' number");
		float b = scn.nextFloat(); 
		double c = a + b;
		System.out.println("Double Method");
		System.out.println(c);
	}
	
	
}

public class ScannerClass
{
	public static void main(String[] args) 
	{
		
		Demo1 i = new Demo1();
		i.addintegers();
		
		Demo1 f = new Demo1();
		f.addfloating();
		
		Demo1 d = new Demo1();
		d.addDoubles();
	
	}
}


