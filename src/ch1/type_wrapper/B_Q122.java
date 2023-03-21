package  ch1.type_wrapper;

public class B_Q122 {
	public static void main(String[] args) {

		Short s1 = 200; 
		Integer s2 = 400;
		String s3 = (String)(s1+s2);		//line n1 
		Long s4 = (long) s1+s2; 			//line n2
		System.out.println("Sum is " + s4);
	}

}

/*
What is the result?
A. Sum is 600
B. Compilation fails at line n1.			>> Cannot cast from int to String
C. Compilation fails at line n2.
D. A ClassCastException is thrown at line n1.
E. A ClassCastException is thrown at line n2.
 */

/*** NOTES
lıne n2: wrapper oldugu icin casting sart. primitive olsaydi casting e gerek yoktu
	long s4 =  s1+s2; 
*****/