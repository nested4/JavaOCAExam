package ch3.arrays.basic;

public class Q052_Test {

	public static void main(String[] args) {
		String [] [] chs = new String [2] []; 
		chs[0] = new String [2];
		chs[1] = new String[5];
		

		int i =97;		
		for (int a = 0; a < chs.length; a++) {  // chs.length =2
			for (int b = 0; b < chs.length; b++) { 
				chs [a][b]= "" + i;				
				i++;								
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

/*What is the result?
A. 97 98 					>>OK
   99 100 null null null 
B. 97 98
   99 100 101 102 103
C.	Compilation fails.
D.	A NullPointerException is thrown at runtime.
E.	An ArraylndexOutOfBoundsException is thrown at runtime.

*/

/** NOTES
1. FIGURE 3.7 An asymmetric multidimensional array, p.128
2. initial value of a String array is null
// ch[0][0]="97",ch[0][1]="98" 

*/