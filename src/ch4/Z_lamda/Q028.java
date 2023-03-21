package ch4.Z_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q028 {

	public static void main(String[] args) {
		String[] arr = {"Hi", "How", "Are", "You"};
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		if(arrList.removeIf(s -> {System.out.print(s); return s.length() <= 2;} )){ 
			System.out.println(" removed"); 
		}
		System.out.println(arrList);  // not in original question, just to see the result
	}
}
/*What is the result?   (same 43)
A.	Compilation fails.
B.	The program compiles, but it prints nothing.
C.	HiHowAreYou removed								>> OK
D.	An UnsupportedOperationException is thrown at runtime.

*/

/**NOTES
 * Lambda, p.209
 Functional programming uses lambda expressions to write code. 
 A lambda expression is a block of code that gets passed around. 
 You can think of a lambda expression as an anonymous method. 
 It has parameters and a body just like full-fledged methods do, but it doesn’t have a name like a real method
 
Table 4.5, 4.6 ,p.212
Lambda expressions, or lambdas, allow passing around blocks of code. 
The full syntax looks like (String a, String b) -> { return a.equals(b); }. 
1-Specify a single parameter 
2-The arrow operator to separate the parameter and body
3-A body that calls a single method and returns the result of that method


 replaceAll(), forEach(),removeIf() ch4, p.215
 some methods on ArrayList take a Predicate.
 
 Predicates,p.214
 Lambdas work with interfaces that have only one method (the name is test()). 
 These are called functional interfaces—interfaces that can be used with functional programming. 
 (It’s actually more complicated than this, but for the OCA exam this definition is fine.)
 */
