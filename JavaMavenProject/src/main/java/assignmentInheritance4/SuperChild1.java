//Program to check the addition result is divisible by 10
//• Class1
//Return addition result of two numbers
//• Class 2
//Check the addition result is divisible by 10(use super keyword)


package assignmentInheritance4;

public class SuperChild1 extends SuperParent1{
	
	public int addition(int a,int b)
	{
		int sum=super.addition(a,b);
		if(sum % 10==0) {
			System.out.println(sum +" is " +"Divisible by 10");
		}else {
			System.out.println(sum +" is not " +"Divisible by 10");
		}
		return sum;
	}

	public static void main(String[] args) {
		SuperChild1 obj =new SuperChild1();
		obj.addition(20,30);
		obj.addition(20,35);
	}

} 
 