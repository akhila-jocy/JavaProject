//Write a program to find the grade of 2 students based on total marks(3 subjects) |
//• Get the student"s marks by constructor
//• Return total mark to in main method
//• Find the grade of each student.

package assignment3;

public class StudentGrade {
	int m1,m2,m3;
	public StudentGrade(int m1,int m2,int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public int total()
	{
		int total= m1+m2+m3;
		return total;
	}
	public char grade()
	{
		int total=total();
		int avg=total/3;
		if(avg >=90) {
			return 'A';
		}else if(avg >=80) {
			return 'B';
		}else if(avg >=70) {
			return 'C';
		}else if(avg >=60) {
			return 'D';
		}else {
			return 'F';
		}
	} 
	public static void main(String[] args) {
		StudentGrade obj = new StudentGrade(90,90,90);
		System.out.println("Student 1:");
		System.out.println("Total Mark: " + obj.total());
		System.out.println("Grade: " + obj.grade());
		
		StudentGrade obj2 = new StudentGrade(80,60,70);
		System.out.println("Student 2:");
		System.out.println("Total Mark: " + obj2.total());
		System.out.println("Grade: " + obj2.grade());
	} 

}
