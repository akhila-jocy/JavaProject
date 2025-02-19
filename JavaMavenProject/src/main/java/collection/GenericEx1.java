package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericEx1 {

	public static void main(String[] args) {
		List <String> obj1 =new ArrayList<String>();
		obj1.add("Hello");
		obj1.add("world");
		obj1.add("welcome");
		obj1.add("java");
		obj1.add("Hello");
		System.out.println(obj1);
		obj1.set(3, "tutorial");
		System.out.println(obj1);
		System.out.println(obj1.indexOf("Hello"));
		System.out.println(obj1.lastIndexOf("Hello"));
		obj1.remove(4);
		obj1.remove("tutorial");
		System.out.println(obj1);
		System.out.println(obj1.get(1));
		System.out.println(obj1.contains("world"));
		System.out.println(obj1.contains("java"));
	}

} 
