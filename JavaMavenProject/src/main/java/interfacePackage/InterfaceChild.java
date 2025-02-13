package interfacePackage;

public class InterfaceChild implements InterfaceParent  {

	public static void main(String[] args) {
		InterfaceChild obj = new InterfaceChild();
		obj.display();

	}

	@Override
	public void display() {
		System.out.println("This is a sample Interface");
		
	}

}
