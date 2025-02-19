
//Polymorphism is achieved by having a parent class reference (PolymorphismClass1) 
//point to a child class object (PolymorphismClass2). 
//This allows you to call the overridden method in the child class (PolymorphismClass2)

package assignmentInheritance4;

public class PolymorphismClass2 extends PolymorphismClass1{
	public double discount(double price)
	{
		double discountprice =price-(price*0.15);
		return discountprice;
	}

	public static void main(String[] args) {
		double price =1000;
		// Using parent class reference to point to child class objects
		PolymorphismClass1 obj1 =new PolymorphismClass1();
		PolymorphismClass1 obj2 = new PolymorphismClass2();
		
		double onSeasonDiscount=obj1.discount(price);
		double offSeasonDiscount=obj2.discount(price);
		
		System.out.println("Original price: " +price);
		System.out.println("OnSeason Discount 40% price: " +onSeasonDiscount);
		System.out.println("OnSeason Discount 15% price: " +offSeasonDiscount);
		

	}

} 
