package com.rameshsoft.automation.functionalinterface;

interface Test1{
	void check(int a , int b);
}

public class TestDemo {
public static void main(String[] args) {
	
	Test1 t1 = (a,b) -> {
				if(a > b)
					System.out.println("a is bigger : " + a);
				else 
					System.out.println("b is bigger : " + b);
	};
	t1.check(11,2);
}
}


/*package com.rameshsoft.automation.functionalinterface;

interface Test1 {
    // Method signature matches the lambda expression's parameter structure
    void check(int a, int b);
}

public class TestDemo {
    public static void main(String[] args) {
        // Lambda expression that matches the functional interface method
        Test1 t1 = (a, b) -> {
            if (a > b)
                System.out.println("a is bigger: " + a);
            else
                System.out.println("b is bigger: " + b);
        };

        // Call the check method
        t1.check(10, 25);
    }
}*/