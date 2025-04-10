package com.rameshsoft.automation.InterfaceTypes;

interface AA{
	default void display() {
		System.out.println("A");
	}
}

interface BB{
	default void display() {
		System.out.println("B");
	}
}

public class CommonTest implements AA,BB{
public void display() {
	AA.super.display();
	BB.super.display();
}
public static void main(String[] args) {
	CommonTest commonTest = new CommonTest();
	commonTest.display();
}
}
