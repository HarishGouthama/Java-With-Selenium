package com.rameshsoft.automation.InterfaceTypes;

interface A1{
	public static String greetings() {
		return "Rameshsoft";
	}
}

public class CommonTest1 {
public static void main(String[] args) {
	CommonTest1 commonTest1 = new CommonTest1();
	//commonTest1.greetings;
	System.out.println(A1.greetings());
	
}
}
