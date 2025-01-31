package string;

public class StringMethod {

	public static void main(String[] args) {
		String a="Hello";
		String c="hi";
		String d="hi";
		String e="Hi";
		String f="welcome";
		String b="This is a java program";
		System.out.println(a.charAt(0));
		System.out.println(a.length());
		System.out.println(a.concat(" World"));
		System.out.println(b.contains("This"));
		System.out.println(b.contains("hii"));
		System.out.println(c.equals(a));
		System.out.println(c.equals(d));
		System.out.println(d.equalsIgnoreCase(e));
		System.out.println(c.compareTo(f));
	}

}
