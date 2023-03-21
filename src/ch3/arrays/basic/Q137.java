package ch3.arrays.basic;

public class Q137 {

	public static void main(String[] args) {
		int n[][] = {{1,3}, {2,4}};
		for (int i = n.length - 1; i >= 0; i--) {
			for (int j = n[i].length - 1; j >= 0; j--) {
				System.out.print(n[i][j]);
			}
		}
	
	}
}


/*
137.What is the result?  (Same Q049)
A.-3142
B.2413
C.1324
D.4231			>> OK
 */
/** NOTES
1. to print each element of 2D array, need two nested for
2. reverse printing in both of outer and inner loop
3. enhanced and standard loop q061 and q192
*/