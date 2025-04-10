package com.rameshsoft.automation.functionalinterface;

@FunctionalInterface
interface Test2{
	void check(int a , int b);
}

class TestImpl implements Test2{
	public void check(int a , int b) {
		if(a > b) {
			System.out.println("a is bigger : " + a);
		}
		else {
			System.out.println("b is bigger : " + b);
		}
	}
}

public class TestDemo1 {
public static void main(String[] args) {
	
	Test2 t = new TestImpl();
	t.check(89, 86);
	
}
}
