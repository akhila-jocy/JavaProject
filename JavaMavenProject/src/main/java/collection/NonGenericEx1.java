package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericEx1 {
	
	public static void main(String[] args) {
		List obj1 = new ArrayList(); //list is created without type is non generic(not commonly used)
		obj1.add("akhila"); //adding elements
		obj1.add(100);
		obj1.add(10.2);
		System.out.println(obj1);
	}
 
}
