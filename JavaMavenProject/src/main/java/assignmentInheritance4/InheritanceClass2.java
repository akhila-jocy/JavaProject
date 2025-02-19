
//• Class 2
//• Calculate hra (5% of basic pay) and pf (20% of basic pay).
//note: here InheritanceClass2() is constructor so that when an obj is created in child class 
//its invoked becuase its extenede in the child class.

package assignmentInheritance4;

public class InheritanceClass2 extends InheritanceClass1{
	double hra;
	double pf;
	public  InheritanceClass2() {
		 hra =0.05 * basicpay ;
		 pf =0.20 *basicpay;
	}
}
