/*package com.rameshsoft.automation.NestedClasses;

import java.util.Scanner;

class OuterDemo{
	private int first;
	public void initialize() {
		@SuppressWarnings("resource")
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		first = scanner.nextInt();
	}
	
	public class InnerDemo{
		public String getName(String name) {
			System.out.println("Inner class Method");
			return name;
		}
		
	public int getOuterNum() {
		initialize();
		return first;
	}
	}
}

public class MyClassDemo {
public static void main(String[] args) {
	//OuterDemo.InnerDemo innerDemo = OuterDemo.new InnerDemo();
	OuterDemo.InnerDemo innerDemo = OuterDemo.new InnerDemo();
	System.out.println("Rameshsoft");
	System.out.println(innerDemo.getOuterNum());
}
}
*/

package com.rameshsoft.automation.NestedClasses;

import java.util.Scanner;

class OuterDemo {
    private int first;

    public void initialize() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        first = scanner.nextInt();
    }

    public class InnerDemo {
        public String getName(String name) {
            System.out.println("Inner class Method");
            return name;
        }

        public int getOuterNum() {
            initialize();
            return first;
        }
    }
}

public class MyClassDemo {
    public static void main(String[] args) {
        // Create an instance of OuterDemo
        OuterDemo outerDemo = new OuterDemo();

        // Use the outer class instance to create an instance of the inner class
        OuterDemo.InnerDemo innerDemo = outerDemo.new InnerDemo();

        System.out.println("Rameshsoft");
        System.out.println("Outer number: " + innerDemo.getOuterNum());
    }
}