package ch2.operators;

public class Q001_Test {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;	
		if (x++ < ++y) { 
			System.out.print("Hello ");
		}else {
			System.out.print("Welcome ");
		}
		System.out.print("Log " + x + ":" + y);  		
	}
}


/*
 * What is the result? 
 * A. Hello Log 2:2 			>> OK
 * B. Welcome Log 1:2 
 * C. Welcome Log 2:1 
 * D. Hello Log 1:2 
 * 

 */

/*** NOTES 
 Order of operator precedence:  p.52
 x++	-> x is still 1 (first use, then perform )
 ++y	-> y is 2 (first perform, then use )
 */