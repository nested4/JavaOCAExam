package ch2.for_loop;

public class Q061 {
	int []array= {1, 2, 3, 4, 5,};
}
/*61. Given the code fragment: (same Q192)
 And given the requirements:
1. Process all the elements of the array in the reverse order of entry.
2. Process all the elements of the array in the order of entry.
3. Process alternating elements of the array in the order of entry. 

Which two statements are true? (Choose two.)

A. Requirements 1, 2, and 3 can be implemented by using the enhanced for loop.
B. Requirements 1, 2, and 3 can be implemented by using the standard for loop.		>> OK
C. Requirements 2 and 3 CANNOT be implemented by using the standard for loop.
D. Requirement 2 can be implemented by using the enhanced for loop.					>> OK
E. Requirement 3 CANNOT be implemented by using either the enhanced for loop or the standard for loop.

*/

/** NOTES
 1. !! enhanced for loop (for-each), no reverse order, only order of entry
 2. alternating elements: elements with odd or even index numbers, or incrementing by 3
 	only by using standard loop
 */

