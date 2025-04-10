package com.rameshsoft.automation.InterfaceTypes;

interface A2{
	public static String greetings() {
		return "Rammeshoft";
	}
}

interface B2{
	public static String greetings() {
		return "Rameshsoft";
	}
}

public class CommonTest2 implements A2,B2{
	
	public static String greetings() {
		return "RameshSoft";
	}
	
public static void main(String[] args) {
	
	String a2 = A2.greetings();
	String b2 = B2.greetings();
	System.out.println(a2);
	System.out.println(b2);
	CommonTest2 commonTest2 = new CommonTest2();
	System.out.println(commonTest2.greetings());
	
}
}
