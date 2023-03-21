package ch2.operators;

public class Q158 {
	public static void main (String[]args) {
		int aVar=9;
		
		
		if (aVar++ <10) {
			System.out.println(aVar +" Hello Universe!");
		}else {
			System.out.println(aVar +" Hello World!");
				
			}	
		}
	}


/*
 * 
 * 
 * 
 * 
 * 
 * 
 158. What is the result if the integer aVar is 9? 

A. Compilation fails.
B. 10 Hello Universe!			>> First check the condition then increase aVar 
C. 10 Hello World!
D. 9 Hello World! 

 */

/** NOTES
!! pay attention to the operator (prefix or postfix)
What is the result under these conditions:
1: if (++aVar <10)
****/
