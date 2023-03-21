package ch3.A1_StringBuilder;

public class Q015 {
	
	public static void main(String[] args) {
	StringBuilder sb1 = new StringBuilder("Duke");
	String str1 = sb1.toString();
	
	/* insert code here*/  
	System.out.println(str1 == str2);
}
}
/*15. Which code fragment, when inserted at line 9, enables the code to print true?
A.	String str2 = str1;					>> OK
B.	String str2 = new String(str1);
C.	String str2 = sb1.toString();
D.	String str2 = "Duke";
 */ 

/**NOTES
 
 '==' checks if the objects are equal, not their values
 
 StringBuilder like String 
 But it is mutable, so methods affect its own object
 !! SB is a mutable class,only substring() is not MUTABLE
 
There are three ways to construct a StringBuilder:
StringBuilder sb1 = new StringBuilder(); 
StringBuilder sb2 = new StringBuilder("animal"); 
StringBuilder sb3 = new StringBuilder(10);
 */
