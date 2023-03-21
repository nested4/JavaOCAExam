package ch3.A_string;

public class Q056 {

	public static void main(String[] args) {
		String string = " "; 
		string.trim(); 
		System.out.println(string.contentEquals("") + " " + string.isEmpty());
	}
}
/* What is the result?
A.	true true
B.	true false
C.	false false		 >> OK
D.	false true
*/

/** NOTES
 ?? what should change for this result: true true
 		string=string.trim();
 !! attention immutability
 */

