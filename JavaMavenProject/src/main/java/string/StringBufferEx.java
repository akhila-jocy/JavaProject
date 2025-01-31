package string;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java");
		sb.append(" Program");
		System.out.println(sb);
		
		sb.insert(4,",");
		System.out.println(sb);
		
		sb.replace(0, 5, "sample");
		System.out.println(sb);
		
		sb.delete(6, 14);
		System.out.println(sb);
		
	}

}
