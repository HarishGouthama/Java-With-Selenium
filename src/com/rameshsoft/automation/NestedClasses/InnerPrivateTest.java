package com.rameshsoft.automation.NestedClasses;

class OuterDemoOne{
	String name = "RameshSoft";
	//Inner Class
	private class InnerDemo{
		public void display() {
			System.out.println("This is a inner class");
		}
	}
	//Accessing the inner class from the method within
	void displayInner(){
		InnerDemo innerDemo = new InnerDemo();
		innerDemo.display();
	}
	
}

public class InnerPrivateTest {
public static void main(String[] args) {
	OuterDemoOne outerDemoOne = new OuterDemoOne();
	
	outerDemoOne.displayInner();
	System.out.println(outerDemoOne.name);
}
}
