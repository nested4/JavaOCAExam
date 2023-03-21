package ch4.E_staticNonstatic;

public class Q007 { // public class X
	static int i;  
	int j;
	public static void main(String[] args) {
		Q007 x1 = new Q007();
		Q007 x2 = new Q007();
		x1.i= 3;
		x1.j = 4;
		x2.i= 5;
		x2.j=6;
		System.out.println(
				x1.i + " " + 
				x1.j + " " + 
				x2.i + " " + 
				x2.j);
	}
}
/*What is the result? (same 32)
A.-3 4 5 6
B.3 4 3 6
C.5 4 5 6			>>OK
D.3 6 4 6
*/

/**NOTES
 * 
Designing Static Methods and Fields, p.181
 
Attention to: 
static,non-static variable
!! Static variables are shared among all instances of a class. So value of a static variable is the same for each object. 
	Memory is allocated at the time of loading of class so that these are also known as class variable.
	last value is the actual value of an static variable
! Non-static variables can be different for each object
 	Non-static variable also known as instance variable while because memory is allocated whenever instance is created.
variable scope
 	global and local
default values of instance variables
 */
