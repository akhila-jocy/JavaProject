
//Write a program to check whether the customer have discount 
//(get 20% discount if total amount is greater than 5000) or not and get the final amount in main method. 
//(static methods)
//• Get prices of items using parameterized method
//• Method 1 - Calculate total amount
//• Method 2 - Check discount

package assignment1;

public class StaticDiscountAssign5 {
	public static int totalAmt(int priceItem[])
	{
		int total=0;
		for(int i=0;i< priceItem.length;i++)
		{
			total = total+priceItem[i];
		}
		return total;
	}
	public static void discount(int totalamount)
	{
		if(totalamount >=5000)
		{
			double discount = totalamount *0.20;
			double finalamount = totalamount-discount;
			System.out.println("Total Amount: " +totalamount);
			System.out.println("Discount Amount: " +discount);
			System.out.println("Final Amount: " +finalamount);
		}
		else
		{
			System.out.println("final Amount: " +totalamount);
		}	
	}
	public static void main(String[] args) {
		int itemprices[] = {2000,1000,3000};
		int totalamount = StaticDiscountAssign5.totalAmt(itemprices);
		StaticDiscountAssign5.discount(totalamount);

	}

}
