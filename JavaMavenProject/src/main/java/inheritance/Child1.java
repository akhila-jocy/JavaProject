package inheritance;

public class Child1 extends SingleInheritance{
	public void sub() {
		int a=30;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.add();
		obj.sub();
	}

}
