package ch3.arrays.basic;

public class Q025 {

	public static void main(String[] args) {
		int nums1[] = {1, 2, 3};
		int nums2[] = {1, 2, 3, 4, 5};
		
		nums2 = nums1;
		
		for (int x : nums2) {
			System.out.print(x + ": ");
		}
	}
}

/*
25. What is the result? 
A.  1:2:3:4:5:
B.	1:2:3:							>> OK
C.	Compilation fails.
D.	An ArrayOutOfBoundsException is thrown at runtime.

*/

/** NOTES
FIGURE 3.2 The basic structure of an array, p.119
	a. create with default values then assign  values
	b. create and initialize
1. for-each to access  each element of an array
2. object equality, in debug mode, same object id, p.121
	nums2 = nums1;
*/