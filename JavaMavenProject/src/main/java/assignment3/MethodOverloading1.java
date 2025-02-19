//Write a program to find the
//• Average of three integer numbers, three float numbers(should have same method name)

package assignment3;

public class MethodOverloading1 {
	
	public void calculateaverage(int num1 ,int num2,int num3) 
	{
		int average =(num1+num2+num3)/3;
		System.out.println("Avg of 3 Integer Number: " +average);
	}
	public void calculateaverage(float num1,float num2,float num3) 
	{
		double average=(num1+num2+num3)/3;
		System.out.println("Avg of 3 Float Number: " +average);
	}

	public static void main(String[] args) {
		 MethodOverloading1 obj = new  MethodOverloading1();
		 obj.calculateaverage(10, 20, 30);
		 obj.calculateaverage(10.5f, 20.5f, 30.5f);

	}

}
