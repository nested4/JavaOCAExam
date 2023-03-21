package ch2.while_loop;
public class Q055 {
	public static void main(String[] args) {
		int x = 5;
		while (isAvaillable(x)) {
			System.out.print(x);	
			
		}
	}
	
	public static boolean isAvaillable(int x) {
		return (x-- > 0) ? true : false;
	}
}

/* 55. Which modification enables the code to print 54321?

A.	Replace line 6 with System.out.print (--x) ;		>> first decrease then print
B.	At line 7, insert x --;								>> OK   >> first print, then increase 
C.	Replace line 6 with --x; and, at line 7, insert System.out.print (x); 		>> first decrease then print
D.	Replace line 12 with return (x > 0) ? false: true; 	>> ineffective, need a code to end the loop

*/

/*** NOTES

!! Attention
Infinite loop if the value is not changed
Output is in descending order, need decrement operator
*/