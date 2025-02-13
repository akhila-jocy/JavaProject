package polymorphism;

public class ChildEx1 extends ParentEx1 {
	public void display(int a,int b) //green symbol refers overriding
	{
		int c=a-b;
		System.out.println("substraction: " +c);
	}
	public static void main(String[] args) {
		
		ChildEx1 obj =new ChildEx1();
		obj.display(50, 30);
		obj.display(40);
				
	}
	
	

}
