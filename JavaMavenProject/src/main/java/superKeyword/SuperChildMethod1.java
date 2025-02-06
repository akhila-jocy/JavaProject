package superKeyword;

public class SuperChildMethod1 extends SuperParentMethod1 {
	public void childdetails() {
		String name ="anitha";
		int age = 20;
		System.out.println("Name:" +name +" "+"age:" +age);
		super.parentdetails();
	}
	public static void main(String[] args) {
		 SuperChildMethod1 obj = new  SuperChildMethod1();
		 obj.childdetails();

	}

}
