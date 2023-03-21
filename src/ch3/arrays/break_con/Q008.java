package ch3.arrays.break_con;

public class Q008 {

	public static void main(String[] args) {	
		String [] [] arr = {{"A", "B", "C"}, {"D", "E"}};	
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]+ " " );
				
				if (arr[i][j].equals("B")) {
					continue; 			// in case 'break;', what is the result?  (after then B, break the loop)
				}	
				
			}
		continue;						// in case 'break;', what is the result? (after then first iteration break the loop)
		}	
	}
}
/*
8. What is the result? 
A.  A B C
B.	A B C D E			>> OK
C.	A B D E
D.	Compilation fails.
*/

/****NOTES 
break & continue statement, p.88-90

FIGURE 2.9 The structure of a break statement
break; cannot be used outside of a loop
	terminate the nearest inner loop

FIGURE 2.10 The structure of a continue statement
continue; cannot be used outside of a loop
	 go back start of the loop, skip the rest 

	
****/
