package accessModifier;

public class AcccessModifierEx { //within the class
	public void display1() {
		System.out.println("This is public method");
	}
	private void display2() {
		System.out.println("This is private method");
	}
	protected void display3() {
		System.out.println("This is protected method");
	}
	void display4() {
		System.out.println("This is default method");
	}
	public static void main(String[] args) {
		AcccessModifierEx obj = new AcccessModifierEx();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();

	}

}
