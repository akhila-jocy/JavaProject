
//Write a program to check whether the candidate is eligible for Voting
//(Use static method and boolean return type).

package assignment1;

public class StaticEligibilityAssign4 {
	
	public static boolean eligibility(int age)
	{
		boolean eligible = age>=18;
		
		if(eligible) 
		{
			System.out.println(age +" is eligible for voting");
		}
		else
		{
			System.out.println(age +" is not eligible for voting");
		}
		return eligible;
	}
	public static void main(String[] args) {
		boolean eligible1=StaticEligibilityAssign4.eligibility(17);
		System.out.println("Eligibility status: " +eligible1);
		boolean eligible2=StaticEligibilityAssign4.eligibility(18);
		System.out.println("Eligibility status: " +eligible2);
	}

}
