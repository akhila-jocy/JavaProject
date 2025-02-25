package collection;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<String> obj =new ArrayList<String>();
		obj.add("hello");
		obj.add("world");
		obj.add("welcome");
		obj.add("java");
		obj.add("tutorial");
		
		ArrayList<String> obj1 =new ArrayList<String>();
		obj1.add("student");
		obj1.add("class");
		System.out.println(obj.addAll(obj1));
		System.out.println(obj.contains("hello"));
		System.out.println(obj);
		System.out.println(obj.get(2));
		System.out.println(obj.isEmpty());
		obj.remove(6);
		System.out.println(obj);
		System.out.println(obj.size());
	}

} 
