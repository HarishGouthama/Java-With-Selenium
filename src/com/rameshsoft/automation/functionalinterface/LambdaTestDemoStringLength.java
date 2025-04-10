package com.rameshsoft.automation.functionalinterface;

@FunctionalInterface
interface lengthString{
	int length(String s);
}

public class LambdaTestDemoStringLength {
public static void main(String[] args) {
	lengthString stringLength = (string)->{
		return string.length();
	};
	
	System.out.println(stringLength.length("Rameshsoft"));
	System.out.println(stringLength.length("Java With Selenium in Real Time"));
	System.out.println(stringLength.length("9177791456"));
	System.out.println(stringLength.length("Hyderabad"));	
	
}
}
