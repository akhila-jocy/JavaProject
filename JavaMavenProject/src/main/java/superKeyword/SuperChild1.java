package superKeyword; 

public class SuperChild1 extends SuperParent1{ //to refer the immediate parent class instance variable
	String name ="anitha";
	public void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		SuperChild1 obj =new SuperChild1();
		obj.display();
		
	}

}
