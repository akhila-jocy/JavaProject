package collection;

import java.util.HashSet;

public class SetHashSet {

	public static void main(String[] args) {
	 HashSet<String> obj = new HashSet<String>(); //set 
	 obj.add("Apple");
	 obj.add("Banana");
	 obj.add("Orange");
	 obj.add("Pappaya");
	 obj.add("Pineapple");
	 obj.add("Apple"); //-Apple already exist no duplicates allowed in set
	 System.out.println(obj); //[Apple, Pineapple, Orange, Banana, Pappaya]
	 System.out.println(obj.contains("fig")); //false
	 obj.remove("Pineapple"); //true
	 System.out.println(obj); //[Apple, Orange, Banana, Pappaya]
	}

}



//output:[Apple, Pineapple, Orange, Banana, Pappaya] the order is different bcz,
// Internally, HashSet uses hashing 
//(i.e., it places elements in different memory locations based on their hash values).