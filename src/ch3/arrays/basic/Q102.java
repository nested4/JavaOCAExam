package ch3.arrays.basic;

public class Q102 {

	public static void main(String[] args) {
		String[] planets ={"Mercury", "Venus", "Earth", "Mars"};

		
		System.out.println(planets.length);
		System.out.println(planets[1].length());
	}
}

/*
/ What is the output?
A. 44
B. 35
C. 47
D. 54
E. 45	>> OK
F. 421

 */

/** NOTES
1. attention to different length
	getting length variable of an array 
	calling  length() function of a String
		!!! primitive types have no length() function

*/
