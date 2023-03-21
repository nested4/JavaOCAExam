package ch1.type_wrapper;

public class A_Q90 {

	public static void main(String[] args) {

		Short s1 =200;
		Integer s2 = 400;
		Long s3 = (long) (s1+s2);   // line 1 	
		String s4 = (String)(s3 * s2);   //line 2                
		System.out.println("Sum is "+ s4); 	
	
		

	}
}

/*
90. What is the result?  (same Q122)

A. Sum is 600
B. Compilation fails at line n1.
C. Compilation fails at line n2.		>> OK, Cannot cast from long to String
D. A ClassCastException is thrown at line n1.
E. A ClassCastException is thrown at line n2.

*/	


/*** NOTES
Key Differences between primitive and wrapper (reference), p.25
1. reference types can be assigned null, which means they do not currently refer to an object. 
Primitive types will give you a compiler error if you attempt to assign them null
	int a=null;

2. reference types can be used to call methods when they do not point to null. 
Primitives do not have methods 
 
3. all the primitive types have lowercase type names. 
All classes that come with Java begin with uppercase
 

Table 3.3 Converting from a String
!! number to String, casting is not enough
	String.valueOf() or Long.toString()
	String s4= Long.toString(s3*s2);
	String.valueOf(s3*s2)

 
!!Attention to object converting, wrapper type is an object
	Long s3 = (long) s1+s2;
?? if it would be primitive, need casting or no?
 	long s3 =  s1+s2; 
 *****/

