package ch4.E_staticNonstatic;

public class Q189_Test {

	public static int stVar = 100;
	public int var =200;

	public String toString () {
		return stVar + ":" + var;
		
	}
	public static void main(String[] args) {
		Q189_Test t1 = new Q189_Test();
		t1.var =300;
		System.out.println(t1); 
		Q189_Test t2 = new Q189_Test();
		t2.stVar =300;
		System.out.println(t2);
		
	}
}
/*
What is the result?
A. 300:300
	200:300
B. 300:100
	200:300
C. 300:0
	0:300
D. 100:300					>>OK
	300:200

 */

/** !! Attention to
 *  static field has one value for all objects
 	override toString()
 * Version 2, change the place of print
 * 

public static void main(String[] args) {
	Test2 t1 = new Test2();
	t1.var =300;
	Test2 t2 = new Test2();
	t2.stVar =300;
	System.out.println(t1);  
	System.out.println(t2);
}
}

What is the result?
A. 300:300200:300
B. 300:100200:300
C. 300:00:300
D. 100:300300:200   >> OK, Why

*/