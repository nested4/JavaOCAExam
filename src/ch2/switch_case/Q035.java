package ch2.switch_case;

public class Q035 {                           
	public static void main(String[] args) {
		String opt = "true";
		switch (opt) { 
		case "true":
			System.out.println("True");
//			break;
		default:
			System.out.println("***");
		}
		System.out.println("Done");
		
	}
}

/* 35. Which modification enables the code fragment to print TrueDone?
A.	Replace line 5 With String opt = "true"; Replace line 7 with case "true":		>>OK
B.	Replace line 5 with boolean opt = 1;Replace line 7 with case 1:
C.	At line 9, remove the break statement.
D.	Remove the default section.

		String opt = "true";
		switch (opt) { 
		case "true":
 */
 
/*** NOTES
Cannot switch on a value of type boolean. And long, double, float 

Only convertible int values, strings or enum variables are permitted

p.73, Data types supported by switch statements include the following: 
char and Character 
int and Integer
byte and Byte
short and Short
String
enum values
cibsse=== char int byte short string enum
*/
