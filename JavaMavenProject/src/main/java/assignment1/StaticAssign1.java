

//Write a program to set your name and age by a static method and 
//get them in an another static method.

package assignment1;

public class StaticAssign1 {
	
	static String name ; 
	static int age;
	
	public static void details(String name1 , int age1) 
	{
		name =name1;
		age=age1;
	}
	
	public static void display() 
	{
		System.out.println("Name:" +name);
		System.out.println("Age:" +age);
	}

	public static void main(String[] args) {
		StaticAssign1.details("Akhila",25);
		StaticAssign1.display();
	}

}  
