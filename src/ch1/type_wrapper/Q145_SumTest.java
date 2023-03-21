package ch1.type_wrapper;

public class Q145_SumTest { //public class  SumTest


	public static void doSum(Integer x, Integer y) {
		System.out.println("Integer sum is " + (x + y));
	}

	public static void doSum(double x, double y) {
		System.out.println("double sum is " + (x + y));
	}

	public static void doSum(float x, float y) {
		System.out.println("float sum is " + (x + y));
	}
	

	
	public static void main(String[] args) {  
		doSum(10, 20);
		doSum(10.0, 20.0);

	}
}

/*
What is the result?  (exactly the same 219)
A. double sum is 30.0 float sum is 30.0 
B. float sum is 30.0 double sum is 30.0 
C. Integer sum is 30 double sum is 30.0 
D. Integer sum is 30 float sum is 30.0 

*/

/** NOTES
 1. call first primitive and nearest big type
 2. last option is wrapper- reference type
 byte> short> int > long (l-L)>  float (f-F)> double (d-D)
 
 ?? what would be the result if this method would also be? 
 public static void doSum(int x, int y) {
		System.out.println("int sum is " + (x + y));
	}
	
--??
public static void doSum(short x, short y) {
			System.out.println("short sum is " + (x + y));
		}
 */

