/*package com.rameshsoft.automation.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@FunctionalInterface
interface Test33{
	int min(List<Integer> list);
}

public class TestDemo {
public static void main(String[] args) {
	
	Set<Integer> s = new TreeSet<Integer>();
	s.add(1000);
	s.add(10);
	s.add(100);
	
	List<Integer> list = new ArrayList<>(s);
	
	Test t = (List<Integer> set) ->{
		return list.get(0);
	};
	
}
}
*/

package com.rameshsoft.automation.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@FunctionalInterface
interface Test33 {
    int min(List<Integer> list);
}

public class TestDemo {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(1000);
        s.add(10);
        s.add(100);

        List<Integer> list = new ArrayList<>(s);

        Test33 t = (List<Integer> l) -> l.get(0);

        // Invoking the lambda expression
        int minValue = t.min(list);
        System.out.println("The minimum value is: " + minValue);
    }
}