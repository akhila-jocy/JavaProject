package inheritance;

public class HierarchialChild2 extends  HierarchialParent1 {

	public void address()
	{
		String place ="kuttipuzha";
		int pincode = 683578;
		System.out.println("place:" +place);
		System.out.println("pincode:" +pincode);}
	
	public static void main(String[] args) {
		HierarchialChild2 obj1 =new HierarchialChild2();
		obj1.detail();
		obj1.address();
	}

}
