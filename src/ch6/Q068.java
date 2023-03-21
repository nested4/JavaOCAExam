package ch6;

import java.io.IOException;
class MyException extends RuntimeException {}

public class Q068{

	public static void main (String[] args) {
		try {
			method1();
		}
		catch(MyException ne){
			System.out.print("A");
		}
	}

	public static void method1(){ // line n1
	
		try {
			throw 3 > 10 ? new MyException() : new IOException();
		} catch (IOException ie) {
			System.out.println("I");
		} catch (Exception re) {
			System.out.print("B");
		}
		

	}
}

/*What is the result? (Same 85)
A. A
B. AB
C. A compile time error occurs at line n1.
D. B
E. I											>> OK
*/

/**
 What happens if the method1 and main has no own try/catch?
 !! if a method throws an Exception,  it should be handled wherever it is called
 To Handle two options:
 1- Surround the calling statement with try/catch
 2- Add throws declaration  into  method signature that calls another method which throws an Exception
 */






