package ch1.scope;

public class Q010_TestScope {

	public static void main(String[] args) {
		int var1 = 200;
		System.out.print(doCalc(var1)); 
		System.out.print(" " + var1);  
	}
	
	static int doCalc(int var1) {
		var1 = var1 * 2;
		return var1;
	}
}
/* 10. What is the result?
A.	400 200				>> OK		
B.	200 200 
C.	400 400
D. Compilation fails.
*/









/** NOTES
System.out.print(doCalc(var1)); // prints the returned value of doCalc()
System.out.print(" " + var1);  // prints the local var
*/