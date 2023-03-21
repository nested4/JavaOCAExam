package ch2.switch_case;

public class Q023 {

	public static void main(String[] args) {
		char colorCode = 'y';
		switch (colorCode) {
		case 'r':
			int color = 100;
			break;
		case 'b':
			color = 10; 
			break;
		case 'y':
			color = 1;  
			break;
		}
//		 System.out.println(color); 				//  !!!!! REMOVE COMMENT
	}
}
/* 23. What is the result?
A.	It results in a compile time error at line 18. 		>> color cannot be resolved to a variable, declared in the switch block
B.	It results in a compile time error at line 9.
C.	It prints : 1
D.	It results in a compile time error at lines at lines 12 and 15. 
*/

/*** NOTES
 at line 12-15 doesn't result error because color is initialized in the switch block
 */