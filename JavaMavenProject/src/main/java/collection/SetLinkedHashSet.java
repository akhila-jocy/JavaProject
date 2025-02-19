package collection;

import java.util.LinkedHashSet;

public class SetLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> obj = new LinkedHashSet<String>();
		 obj.add("Apple");
		 obj.add("Banana");
		 obj.add("Orange");
		 obj.add("Pappaya");
		 obj.add("Pineapple");
		 obj.add("Apple"); //-Apple already exist no duplicates allowed in set
		 System.out.println(obj); // ordered-[Apple, Banana, Orange, Pappaya, Pineapple]

	}

}


// to maintain the insertion order, use LinkedHashSet instead of HashSet