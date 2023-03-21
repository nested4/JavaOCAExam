package ch2.for_loop;

public class A_Q75 {
	public static void main(String[] args) {
		int ii=0;
		int jj=7;
		for( ii=0; ii<jj; ii+=2) { 
			System.out.print(ii+" ");
		}
		System.out.println(ii);
		}
}

/*
75. What is the result? (same Q111)
A. 2 4
B. 0 2 4 6     >> ii<7
C. 0 2 4
D. Compilation fails. 

 */

/****NOTES 
FIGURE 2.7 The structure of a basic for statement, p.80
FIGURE 2.8 The structure of an enhancement for statement, p.83
Comparing for and for-each Loops, p.85
****/


