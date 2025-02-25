package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Red");
		obj.add("Blue");
		obj.add("Green");
		obj.add("Black");
		obj.add("White");
		System.out.println(obj);
		System.out.println(obj.get(1));
		
		Iterator<String> it = obj.iterator();
		System.out.println("**********");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		obj.remove(2);
		System.out.println(obj);
		System.out.println(obj.contains("Black"));
	}

}
