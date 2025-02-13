//Program to find the reverse of a number
//two constructors, one for calculation reverse and other for display "Finding reverse..."
//• Argument variable and instance variable should be same
//• Main method allows to invoke only one constructor

package assignmentThis2;

public class ReverseThis {
	int reverse;
	int num;
	public ReverseThis(int num)
	{
		this.num =num;
		reverse=0;
		while(num !=0)
		{
			int digit = num % 10;
			reverse = reverse *10 +digit;
			num = num/10;
		}
	}
	
	public ReverseThis()
	{
		this(1234);
		System.out.println("reverse of " +num +" is " +reverse);
	}

	public static void main(String[] args) {
		ReverseThis obj = new ReverseThis();
	}

}
