package ch3.A_string;

public class Q014 {
	public static void main(String[] args) {
		String str = "Sweet Sweat";
		String str2 = str.trim().charAt(6) + " " + str.indexOf("Sw", 1); 
		System.out.println(str2);
	}
}

/*What is the result?
A.	S 6
B.	S 5
C.	s-1
D.	w 7

*/

/** NOTES
1. no white space before and after "Sweat Sweat", so trim() dosen't affect
2. 6th character in str is still S.        --     charAt(6) gives S  
3. str.indexOf("Sw", 1); means return the index number of characters "Sw" but start to search from 1

*/