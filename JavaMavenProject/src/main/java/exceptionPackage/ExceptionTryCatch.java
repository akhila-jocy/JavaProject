package exceptionPackage;

public class ExceptionTryCatch {
	public static void main(String[] args) {
		int a=5;
		int b=0;
		try
		{
		int c=a/b; //arithmetic exception
		System.out.println(c);
		}
		catch(ArithmeticException var)
		{
			int x=10;
			int y=2;
			int z=x/y;
			System.out.println(z);
			System.out.println(var); //To know the Exception type
		}
		finally
		{
			System.out.println("Excecution completed");
		}
	}

}
