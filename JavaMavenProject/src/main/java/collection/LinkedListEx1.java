package collection;

import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("hello");
		obj.add("world");
		obj.add("welcome");
		obj.add("java");
		obj.add("tutorial");
		System.out.println(obj);   //[hello, world, welcome, java, tutorial]
		System.out.println(obj.getFirst());  //hello
		System.out.println(obj.getLast());   //tutorial
		obj.addFirst("hii");
		obj.addLast("session");
		System.out.println(obj); //[hii, hello, world, welcome, java, tutorial, session]
		obj.removeFirst();
		obj.removeLast();
		System.out.println(obj); //[hello, world, welcome, java, tutorial]
		System.out.println(obj.contains("java")); //true
		System.out.println(obj.isEmpty());  //false
		obj.remove(); //-first elemet removed
		System.out.println(obj); //[world, welcome, java, tutorial] 
		obj.remove(1); //-index 1 welcome removed
		System.out.println(obj); //[world, java, tutorial]
		obj.add(0,"hello"); //Adds an element at a specific index
		System.out.println(obj); //[hello, world, java, tutorial]
		System.out.println(obj.size());  //4
		obj.clear(); //cleared all elements
		System.out.println(obj);  //[]
		
		
		
		

	}

}
