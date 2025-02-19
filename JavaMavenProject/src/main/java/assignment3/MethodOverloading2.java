
// Write a program to find the Area of figures(circle, rectangle, square) by using three
//methods(should have same method name)

package assignment3;

public class MethodOverloading2 {
	
	public void areaOfFigures(double radius) 
	{
		double area = 3.14*radius*radius;
		System.out.println("Area of circle is: " +area);
	}
	public void areaOfFigures(int length ,int breadth) 
	{
		int area =  length*breadth;
		System.out.println("Area of rectangle is: " +area);
	}
	public void areaOfFigures(int side) 
	{
		int area =side*side;
		System.out.println("Area of square is: " +area);
	}
	
	public static void main(String[] args) {
		MethodOverloading2 obj =new MethodOverloading2();
		obj.areaOfFigures(6.0);
		obj.areaOfFigures(5, 10);
		obj.areaOfFigures(5);
		
	}

}
