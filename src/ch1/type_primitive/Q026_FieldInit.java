package ch1.type_primitive;

public class Q026_FieldInit { //public class FieldInit
	Character c;
	boolean b;
	float f;
	void printAll() {
		System.out.println("c = " + c);
		System.out.println("b = " + b);
		System.out.println("f = " + f);
	}
	public static void main(String[] args) {
		Q026_FieldInit f = new Q026_FieldInit();
		f.printAll();
	}
}
/* What is the result?  (exactly the same 153 and same 143)
A. c=null b=true f=0.0 
B. c= b=false f=0.0 
C. c=null b=false f=0.0				>> OK
D. c=0 b=false f=0.0F
*/

/** NOTES
Table 1.1: Java primitive types, p.21
1: All the primitive types have lowercase type names
2: All classes that come with Java begin with uppercase

Table 1.2 Default initialization values by type, p.31
 ?? char vs Character;
 */ 
