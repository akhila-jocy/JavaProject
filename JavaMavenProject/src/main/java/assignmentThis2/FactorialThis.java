//Program to find the factorial of a number
//• Two methods, one for find calculate and other for print result.
//• Pass the number as argument
//• Main method allows to invoke only one method



package assignmentThis2;

public class FactorialThis {
	
	int num;
	int factorial;
	public void factorialCalc(int num)
	{
		this.num=num;
		factorial =1;
		for(int i=1;i<=num;i++)
		{
			factorial =factorial*i;
		}
	}
	
	public void display()
	{
		this.factorialCalc(5);
		System.out.println("Factorial of " +num +" is " +factorial);
	}

	public static void main(String[] args) {
		FactorialThis obj = new FactorialThis();
		obj.display();
		
	}

}
