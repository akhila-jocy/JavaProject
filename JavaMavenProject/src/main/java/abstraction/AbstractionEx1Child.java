package abstraction;

public class AbstractionEx1Child extends  AbstarctEx1{

	public static void main(String[] args) {
		AbstractionEx1Child obj = new AbstractionEx1Child();
		obj.display();
		obj.dispaly2();

	}

	@Override
	public void dispaly2() {
		System.out.println("This is an abstract method");
	}

}
