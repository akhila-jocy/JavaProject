package interfacePackage;

public class InterfaceChild2 implements InterfaceParent1 ,InterfaceParent2 {

	public static void main(String[] args) {
		InterfaceChild2 obj =new InterfaceChild2();
		obj.student1Details();
		obj.student2Details();

	}

	@Override
	public void student2Details() {
		String name="Akhila";
		int age=25;
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		
	}

	@Override
	public void student1Details() {
		String name="Anitha";
		int age=20;
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		
	}

}
