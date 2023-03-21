package ch6;

public class Q022 {
	public static void main(String[] args) {
		int ans; 
		try {
			int num = 10;
			int div = 0;
			ans = num / div;
		} catch (ArithmeticException ae) {
			ans = 0;												// line n1
			System.out.println("ArithmeticException");
		}catch (Exception e) {
			System.out.println("Invalid calculation");
		}		
		System.out.println("Answer = " + ans);	// line n2 
		
	}
}
/*What is the result?  (same 129)
A.	Answer = 0
B.	Invalid calculation
C.	Compilation fails only at line n1.
D.	Compilation fails only at line n2.				>>OK
E.	Compilation fails at line n1 and line2.
*/







/**
 Attention to variable scope, where is initialized?
 The local variable ans may not have been initialized
 */
