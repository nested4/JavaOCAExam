package ch2.while_loop;
public class Q088 {
	public static void main(String[] args) {
		int x = 6;									
		while (isAvailable (x)) {
			System.out.print(x);

		}
	}
	public static boolean isAvailable (int x) {
		return --x > 0? true:false;						

	}
}


/* 88.which modification enables the code to print 54321?

A. Replace line 6 with System.out.print (--x);			>> OK, first decrease then print
B. At line 7, insert x --;								>> first print, then decrease 
C. Replace line 5 with while (isAvailable(--x)) {		>> unsatisfactory result
D. Replace line 12 with return (x > 0) ? false : true;	>> ineffective, need a code to end the loop

 */
