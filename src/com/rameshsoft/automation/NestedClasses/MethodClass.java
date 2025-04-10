package com.rameshsoft.automation.NestedClasses;

public class MethodClass {
//Instance method of the outer class
	
	void hello() {
		int first = 56;
		
		//Method-local inner class
		class MethodInner_Demo{
			public void print() {
			System.out.println("This is method inner class: " + first);				
			}
		}
		
		MethodInner_Demo inner = new MethodInner_Demo();
		inner.print();
	}
	
	public static void main(String[] args) {
		MethodClass outer = new MethodClass();
		outer.hello();
	}
}
