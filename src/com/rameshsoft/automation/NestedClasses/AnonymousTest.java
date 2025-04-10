package com.rameshsoft.automation.NestedClasses;

interface Test{
	void hello();
}

public class AnonymousTest {
public static void main(String[] args) {
	
	Test test = new Test() {
		
		@Override
		public void hello() {
		System.out.println("Example of anonymous");
			
		}
	};
	
	test.hello();
}
}
