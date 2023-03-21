package ch3.arrays.basic;

public class Q049 {

	public static void main(String[] args) {
		
		int n [] [] = {{1, 3},{2, 4}};
		for(int i = n.length-1; i >= 0; i--) { //n.length-1 = 1
			for (int y : n[i]) {
				System.out.print(y);
			}
		}
	}
}

/*What is the result? (same 137)
A.	1324
B.	2313  >> OK, 2413
C.	3142
D.	4231
*/

/** NOTES
1. to print each element of a 2D array, need two nested for
2. reverse printing in outer loop
3. enhanced and standard loop q061 and q192
*/
