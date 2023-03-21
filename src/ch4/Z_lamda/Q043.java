package ch4.Z_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q043 {

		public static void main(String[] args) {
			String[] arr = {"Hi", "How", "Are", "You"};
			List<String> arrList = new ArrayList<>(Arrays.asList(arr));
			
			if(arrList.removeIf((String s) -> {return s.length() <= 2;} )){ 
				System.out.println(s +" removed"); 
			}
			
		
	}
}
/*What is the result?   (same 28)
A.	Compilation fails.					>> scope error
B.	Hi removed
C.	An UnsupportedOperationException is thrown at runtime.
D.	The program compiles, but it prints nothing.
*/


/**NOTES
 * removeif : Removes all of the elements of this collection that satisfy the given predicate.
 * if(arrList.removeIf((String s) -> (return s.length() <= 2;) )){  >> structural error in original question
 * 	if (arrayRemoveIf(arrList))
				System.out.println(s +" removed"); 
		}
		
		public static boolean lamda(String s)
		{
			return s.length() <= 2;
		}
		
		public static boolean arrayRemoveIf(List<String> arrList) {
			boolean iscontains=false;
			for (String s : arrList) {
				if (lamda(s)==true)
					iscontains=true;
			}
			return iscontains;
		}
 * 	
 */
