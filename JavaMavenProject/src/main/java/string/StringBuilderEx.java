package string;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("Hello");
		a.append(" World"); //for join new value 
		System.out.println(a);
		a.insert(5, ","); //can insert b/w specific index
		System.out.println(a);
		a.delete(5, 7); //can delete from,to an index
		System.out.println(a);
		a.replace(5, 10, " java"); //replace the text with another
		System.out.println(a);
	}

}
