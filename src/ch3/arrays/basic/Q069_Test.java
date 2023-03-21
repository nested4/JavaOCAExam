package ch3.arrays.basic;

public class Q069_Test { //public class Test

	public static void main(String[] args) {

		String[][] chs = new String[5][2];
		chs[0] = new String[2]; // {null,null}
		chs[1] = new String[5]; // {null,null,null,null,null}
		int i = 97;

		for (int a = 0; a < chs.length; a++) { // chs.length = 5 : 01234
			for (int b = 0; b < chs.length; b++) {  // chs.length = 5 01234
				chs[a][b] = " " + i; 
				i++;
				//System.out.print(chs[a][b]);

			}
		}
		for (String[] ca : chs) {
			for (String c : ca) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
/*
 69. What is the result?
A. 97 98 99 100 null null null
B. 97 9899 100 101 102 103
C. Compilation fails.
D. A NullPointerException is thrown at runtime.
E. An ArrayIndexOutOfBoundsException is thrown at runtime.  >> OK

 */
