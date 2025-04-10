package com.rameshsoft.automation.InterfaceTypes;



interface A{
	default void Display() {
		System.out.println("A");
	}
}

interface B{
	default void Display() {
		System.out.println("B");
	}
}

public class C implements A,B{
public void Display() {
	System.out.println("Welcome to Rameshsoft");
}

public static void main(String[] args) {
	C c = new C();
	c.Display();
}
}
