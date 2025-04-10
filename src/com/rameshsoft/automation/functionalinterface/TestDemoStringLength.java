package com.rameshsoft.automation.functionalinterface;

//Without using lambda expressions.

@FunctionalInterface
interface TestStringLength{
	int length(String s);
}

class TestImplStringlength implements TestStringLength{
	
	@Override
	public int length(String s) {
		return s.length();
	}
	
}

public class TestDemoStringLength {
public static void main(String[] args) {
	
	TestStringLength t = new TestImplStringlength();
	System.out.println(t.length("Rameshsoft"));
	System.out.println(t.length("Java With Selenium in Real Time"));
	System.out.println(t.length("9177791456"));
	System.out.println(t.length("Hyderabad"));	
}
}
