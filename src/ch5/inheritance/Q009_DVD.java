package ch5.inheritance;

class CD{
	int r;
	CD (int r){
		this.r = r;
	}
}
public class Q009_DVD extends CD{
	int c;
	Q009_DVD(int r, int c){
		// line n1

	}
	public static void main(String[] args) {
		Q009_DVD dvd = new Q009_DVD(10,  20);
		System.out.println(dvd.r);
		System.out.println(dvd.c);
		
		
	}
}
/*
Which code fragment should you use at line n1 to instantiate the dvd object successfully?
A. super.r = r;		// super.r is not correct way to call the correct parent class's constructor
	this.c = c;
	
B. super(r);
	this(c);				// this(); should be the first statement right after constructor
	
C. super(r);
	this.c = c;
	
D. this.c = r;
	super(c);        	// super(); should be the first statement right after constructor

*/

/** 
 super vs super()
As discussed in Chapter 4, this() and this are unrelated in Java. Likewise, super() and super are quite different 
	but may be used in the same methods on the exam. 
The first, super(), is a statement that explicitly calls a parent constructor and 
	may only be used in the first line of a constructor of a child class. 
The second, super, is a keyword used to reference a member defined in a parent class and may be used throughout the child class.

 */
