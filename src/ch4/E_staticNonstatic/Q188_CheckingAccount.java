package ch4.E_staticNonstatic;

public class Q188_CheckingAccount {				//	acct.amount=88
    public int amount;                            

    public Q188_CheckingAccount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void changeAmount(int x) {
    	amount += x;					
    }
    public static void main(String[] args) {
    	Q188_CheckingAccount acct = new Q188_CheckingAccount((int)(Math.random()*1000)); 
        // line n1
    	
         System.out.println(acct.getAmount());
     }
 
}
/*Which three lines, when inserted independently at line n1, cause the program to print a 0 balance?
A.	acct.setAmount(-acct.getAmount());			>> negative random numbers
B.	acct.amount = 0; 							>> OK
C.	acct.setAmount(0);							>> OK
D.	acct.getAmount() = 0; 						>> The left-hand side of an assignment must be a variable
E.	this.amount = 0; 							>> Cannot use this in a static context
F.	acct.changeAmount(0); 						>> no changing
G.	acct.changeAmount(-acct.amount); 			>> OK

*/

/** !!!
 * amount is instance variable, non-static, to access instance needs an object
 * Not a good example for encapsulation, public variable but getter-setter
 */
