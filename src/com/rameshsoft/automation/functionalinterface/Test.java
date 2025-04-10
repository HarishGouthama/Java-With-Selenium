package com.rameshsoft.automation.functionalinterface;

public interface Test {
	boolean test(String S);
	
	default void course() {
		System.out.println("Java with selenium in realtime");
	}
	
	public static void display() {
		System.out.println("Welcome to rameshsoft");
	}
	
	public static void main(String[] args) {
		Test t = new Test() {
			
			@Override
			public boolean test(String S) {
				// TODO Auto-generated method stub
				return false;
			}
		};		
		t.course();
	}
}
