package ch1.scope;

public class Q017_Test { // public class Test
	 int x, y;
	
	public Q017_Test(int x, int y) {
		initialize(x, y);
	}
	
	public void initialize(int x, int y) {
		this.x = x * x;
		this.y = y * y;
	}
	
	public static void main(String[] args) {
		int x = 3, y =5;
		Q017_Test objTest = new Q017_Test(x, y);
		System.out.println(x + " " +y); 
	}
}
/*What is the result?  (same 209)
A.	Compilation fails.
B.	3 5					>> OK, if there is local variable, access it first
C.	0 0
D.	9 25
*/

/****
 * Static vs non-static, in a static method you can not access a non-static variable/method
 * 
 * Case 1: try to access global x,y variables and initialize method in static main method
 * Case 2: what happens if we change the initialize method to static?
 */
