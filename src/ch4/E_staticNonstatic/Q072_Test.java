package ch4.E_staticNonstatic;


public class Q072_Test { // public class Test
	 public static void main(String[] args) {
		 Q072_Test ts = new Q072_Test();
	        System.out.print(isAvailable+"");
	        isAvailable=doStuff();
	        System.out.println(isAvailable);

	    }
	    public static boolean doStuff(){
	        return !isAvailable;
	    }
	    static boolean isAvailable = false; 
	}
	/*
	What is the result?		(same 83)
	A.	Compilation fails.
	B.	false true						>> OK
	C.	true false
	D.	true true
	E.	false false

	 */

/** NOTES
 Attention to:
 access limit: static to static
 	ts.doStuff() >> OK, with and without object a static can access other static
 for static variable memory is allocated at the time of loading of class
 */

