package ch4.E_staticNonstatic;

class CheckingAccount {
	public int amount;
	// line n1
	
	
}

public class Q027{
	
	public static void main(String[] args) {
		CheckingAccount acc = new CheckingAccount();
		// line n2	
	
		System.out.println(acc.amount);
	}
}
/* Which three pieces of code, when inserted independently, set the value of amount to 100?

 	A. At line n1 insert:
 		public CheckingAccount(){
 		amount = 100;					
 		}

 	 B. At line n2 insert:				>> Cannot use this in a static  context
 		this.amount = 100;   			

 	 C. At line n2 insert:				>> amount cannot be resolved to a variable
 		amount = 100;					>> to access the non-static field amount needs object

 	 D. At line n1 insert:
 		public CheckingAccount(){
 		this.amount = 100;
 		}

 	 E. At line n2 insert:
 		acc.amount = 100;

 	 F. At line n1 insert:
 		public CheckingAccount(){
 		acc.amount = 100;				>> acc cannot be resolved to a variable
 		}

 */

/** NOTES
 !!Attention to accession to static, non-static

 */


