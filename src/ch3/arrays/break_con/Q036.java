package ch3.arrays.break_con;

public class Q036 {

	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D"};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " " ); 
			if (arr[i].equals("C")) {  
				continue; 				// goes back start of  the loop
			}				
			System.out.println("Work Done"); 
			break;				// in case 'continue;'   goes back start of the loop
		}
	}
}
/*
 36.What is the result?
A.	A B C Work done
B.	A B C D Work done
C.	A Work done					>>OK
D.	Compilation fails
*/

