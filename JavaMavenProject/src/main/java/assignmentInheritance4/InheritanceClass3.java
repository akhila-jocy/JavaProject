// Class 3
//• Find the total salary (basicpay +hra-pf-deduction+bonus) and get the salary slip
//• Salary slip should contains :- basic pay, deduction, hra, pf, bonus and total salary by hand.
//note: here InheritanceClass3() is constructor so that its invoked automatically when object of the class is created

package assignmentInheritance4;

public class InheritanceClass3 extends InheritanceClass2{
	 	double totalsalary;
	public  InheritanceClass3() {
		totalsalary = basicpay+hra-pf-deduction+bonus;
		
	}
	public void salarySlip() {
		System.out.println("********** SALARY SLIP **********");
        System.out.println("Basic Pay    : " + basicpay);
        System.out.println("Deduction    : " + deduction);
        System.out.println("HRA (5%)     : " + hra);
        System.out.println("PF (20%)     : " + pf);
        System.out.println("Bonus        : " + bonus);
        System.out.println("Total Salary : " + totalsalary);
        System.out.println("*********************************");
	}
	public static void main(String[] args) {
		InheritanceClass3 obj = new InheritanceClass3();
		obj.salarySlip();

	}

}
