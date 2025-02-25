package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {

	public static void main(String[] args) {
		ArrayList<String> obj =new ArrayList<String>();
		obj.add("hello");
		obj.add("world");
		obj.add("welcome");
		obj.add("java");
		obj.add("tutorial");
		
		Iterator<String> it = obj.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove(); //only last element is removed
		System.out.println(obj);

	}

}
