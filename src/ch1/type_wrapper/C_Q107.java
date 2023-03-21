package ch1.type_wrapper;

public class C_Q107 {

	public static void main(String[] args) {
		boolean a= new Boolean(Boolean.valueOf(args[0])); 
		boolean b= new Boolean(args[1]);
		System.out.print(a +" "  + b);
	}
}

/*
		And given the commands:

		javac Test.java
		java Test 1 null  

		What is the result?
		A. 1 null
		B. true false
		C. false false  >>OK
		D. true true
		E. A ClassCastException is thrown at runtime.


Second options: 

		What is the result?
		A. True null
		B. true false
		C. false false >>OK
		D. true true
		E. A ClassCastException is thrown at runtime.

 */

/******* Notes
 1: new Boolen():  Allocates a Boolean object representing the value
 Boolean.valueOf() : Returns a Boolean with a value represented by the specified string, returns true or false
 	true: if the string argument is (cond.1) not null and (cond.2) is equal, ignoring case, to the string "true".
 		true or TRUE or trUE or TrUe (ignoring case)
 	false: numbers, strings etc 
 		!! 1 and 0 are also false
 *******/
  
