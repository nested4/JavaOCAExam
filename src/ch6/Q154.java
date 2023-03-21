package ch6;
import java.util.ArrayList;


public class Q154 {
	    public static void main(String[] args) {
	        ArrayList myList = new ArrayList();
	        String[] myArray;
	        try{
	            while(true){                  
	                myList.add("My String");
//	                System.out.println("While loop");   // to see the what happened in runtime
	            }
	        }catch (RuntimeException re){
	            System.out.println("Cought a RuntimeException");
	        }catch (Exception e){
	            System.out.println("Cought an Exception");
	        }
	        System.out.println("Ready to use");
	    }
	   

	}
	/*
	What is the result?
	A.	Execution terminates in the first catch statement, and Caught a RuntimeException is printed to the console.
	B.	Execution terminates in the second catch statement, and Caught an Exception is printed to the console.
	C.	A runtime error is thrown in the thread "main".																>>OK
	D.	Execution completes normally, and Ready to use is printed to the console.
	E.	The code fails to compile because a throws keyword is required.												>> no any checked exception
	Answer: C

	 */

/**
 * while(true) --> infinite loop
 Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 */
