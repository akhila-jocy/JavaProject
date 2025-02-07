package superKeyword;

public class SuperChildConstructor extends SuperConstructor{
	
	public SuperChildConstructor(String name) {
		super();
		System.out.println(name);
	}
	public static void main(String[] args) {
    SuperChildConstructor obj = new SuperChildConstructor("akhila");

	}

}
