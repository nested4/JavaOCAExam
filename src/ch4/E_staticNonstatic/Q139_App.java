package ch4.E_staticNonstatic;

public class Q139_App {
	int count;

	public static void displayMsg() {

	System.out.println("Welcome visit count"+ count++); // line1
		
	}
	public static void main(String[] args) {
		Q139_App.displayMsg(); 
		displayMsg();   //line 2
	}

}
/* What is the result? (same 112)
A. Welcome Visit Count:0Welcome Visit Count: 1 
B. Compilation fails at line n2.
C. Compilation fails at line n1.					>>OK
D. Welcome Visit Count:0Welcome Visit Count: 0
*/

/** NOTES
 Attention to optional specifier "static" 
 Static methods/fields don’t require an instance of the class 
 */
 

