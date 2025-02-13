
// Write a program to check whether the given number is Palindrome/Not by using static methods.
//Method 1-to find the reverse (pass the number in argument).
//method 2-to check palindrome/not.

package assignment1;

public class StaticpalindromAssign3 {

	
	public static int reverse(int num)
	{
		int reverse=0;
		while(num !=0)
		{
			int digit = num % 10;
			reverse = reverse *10 +digit;
			num = num/10;
		}
		System.out.println("Reverse number is " +reverse);
		return reverse;
	}
	
	public static void palindrom(int num)
	{
		int reversenumber =reverse(num);
		
		if(num ==  reversenumber)
		{
			System.out.println("Number " +num +" is palindrome");
		}
		else
		{
			System.out.println("Number " +num +" is not palindrome");
		}
	}

	public static void main(String[] args) {
		StaticpalindromAssign3.palindrom(121);
	}

}
