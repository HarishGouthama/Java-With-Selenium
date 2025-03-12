package com.javabasics.programs;

class DemoOne
{
	int a = 10;
	
	public void hello()
	{
		System.out.println("Hello Method");
	}
	
	public void display()
	{
		System.out.println("Display Method");
	}
}

	class DemoTwo extends DemoOne
	{
		public void childmethod()
		{
			System.out.println("Child method");
		}
	}


public class InheritDemo 
{
	public static void main(String[] args) 
	{
		//DemoOne demoOne = new DemoOne();
		DemoTwo demoTwo = new DemoTwo();
		System.out.println(demoTwo.a);
		demoTwo.hello();
		demoTwo.display();
		demoTwo.childmethod();
	}

}


