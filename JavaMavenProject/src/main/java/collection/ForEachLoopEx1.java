package collection;

import java.util.ArrayList;

public class ForEachLoopEx1 {

	public static void main(String[] args) {
		ArrayList<String> obj =new ArrayList<String>();
		obj.add("hello");
		obj.add("world");
		obj.add("welcome");
		obj.add("java");
		obj.add("tutorial");
		for(String var : obj)
		{
			System.out.println(var);
		}

	}

}
