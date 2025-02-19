//• Program to calculate discount If customer purchase clothes on
//Offseason, set discount 15% and on Onseason 40%
//• Should use two classes, Onseason and Offseason 
//• Use two methods -discount(method name should be same)


package assignmentInheritance4;

public class PolymorphismClass1 {
	
	public double discount(double price)
	{
		double discountprice =price-(price*0.40);
		return discountprice;
	}

}
