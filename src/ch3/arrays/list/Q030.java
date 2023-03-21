package ch3.arrays.list;

import java.util.ArrayList;
import java.util.List;

public class Q030 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		
		if (names.remove("Bran")) {
			names.remove("Jon");
		}
		
		System.out.println(names);
	}
}
/*What is the result?
A.	[Robb, Rick, Bran]   		>> OK
B.	[Robb, Rick]
C.	[Robb, Bran, Rick, Bran]	
D.	An exception is thrown at runtime.
 */

/** NOTES
-add, remove return boolean. remove (int index) returns value as string 

1.Removes the first occurrence of the specified element from this list, 
	if it is present (optional operation). If this list does not contain the element, it is unchanged
2. Returns: true if this list contained the specified element
 
?? if (names.remove("Jon")) {
			names.remove("Bran");
		}
 */
