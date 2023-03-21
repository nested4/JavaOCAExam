package ch6;

public class Q074_Test {
	void readCard(int cardNo) throws Exception{ 
		System.out.println("Reading Card");	
	}

	void checkCard(int cardNo) throws RuntimeException {  // line n1
		System.out.println("Checking Card");
	}
	public static void main(String[] args)  {
		Q074_Test ex = new Q074_Test();
		int cardNo = 12344;
		ex.readCard(cardNo);   // line n2
		ex.checkCard(cardNo);  // line n3
	}
}

/* What is the result?
 
 A.
    Reading Card
  	Checking Card
B.
	Compilation fails only at line n1

C.	>> OK, checked Exception, needs to controlling/checking in also compile time
	Compilation fails only at line n2				//Unhandled exception type Exception

D.	>> Runtime, unchecked, no need throws
	Compilation fails only at line n3
E.
	Compilation fails at both line n2 and line n3
	
A. Option A
B. Option B
C. Option C
D. Option D
E. Option E
 */

/**
How can it be handled?


!! if a method throws an Exception not RuntimeException,  it should be handled wherever it is called
To Handle two options:
1- Surround the calling statement with try/catch
2- Add throws declaration  into  method signature that calls another method which throws an Exception
*/
