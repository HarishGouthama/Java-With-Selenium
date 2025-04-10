package com.rameshsoft.automation.NestedClasses;

abstract class Test1{
	public abstract void hello();
}

public class AnonymousTest1 {
public static void main(String[] args) {
	
	Test1 innerTest = new Test1() {
		
		@Override
		public void hello() {
			System.out.println("Example of anonymous");
		}
	};
	innerTest.hello();
}
}
