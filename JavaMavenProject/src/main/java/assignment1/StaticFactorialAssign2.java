
//write a program to find the factorial of a number(static method)
//Output - "Factorial of <given number> is <result.

package assignment1;

public class StaticFactorialAssign2 {
	public static void factorial()
	{
		int number =5;
		int factorial =1;
		for(int i=1;i<=number;i++)
		{
			factorial =factorial*i;
		}
		System.out.println("Factorial of " +number +" is " +factorial);
	}

	public static void main(String[] args) {
		StaticFactorialAssign2.factorial();
	}

}
