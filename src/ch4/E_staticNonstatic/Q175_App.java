package ch4.E_staticNonstatic;

public class Q175_App {

	 int foo;
	static int bar;
	
	static void process() { 
		foo += 10;  
		bar += 10;
	}
	public static void main(String[] args) {
		Q175_App firstObj = new Q175_App();
		Q175_App.process();
		System.out.println(firstObj.bar);

		
		Q175_App secondObj = new Q175_App();
		Q175_App.process();
		
		System.out.println(secondObj.bar);
		
	}

}

/* 175. What is the result?
A. 10
	20
B. A compile time error occurs 
C. 20
	20
D. 10
	10
 */


/** !! static field, non-static method
1-if it can be compiled, what is the result
 
2- move the first print below second time calling the process()
! at the and, static field has the same value for all object
 */
