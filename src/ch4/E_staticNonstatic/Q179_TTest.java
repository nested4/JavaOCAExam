package ch4.E_staticNonstatic;

public class Q179_TTest { //public class TTest

	static int count = 0;  
	int i= 0;    

	public void changeCount () {
		while (i<5) {
			i++;    
			count++;
		}
	}
	public static void main(String[] args) {
		Q179_TTest check1 = new Q179_TTest ();
		Q179_TTest check2 = new Q179_TTest (); 
		check1.changeCount();   
		check2.changeCount();	
		System.out.println(check1.count + " : "+ check2.count);

	}
}

/* 179.What is the result? 
A. 5 : 5
B. 10 : 10				>> OK
C. 5 : 10
D. Compilation fails. 

*/

/** NOTES 
 1: static variable belongs the class, not object
 	The static field Q179_TTest.count should be accessed in a static way
 2: What is the result 
 	System.out.println(check1.i + " : "+ check2.i);
 */
