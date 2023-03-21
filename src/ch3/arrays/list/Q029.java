package ch3.arrays.list;

import java.util.ArrayList;

public class Q029 {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<>();
		points.add(1); 				// adds int value to the index number 0 and so on
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		points.remove(1); 			// removes index!!!
		points.remove(null); 		//removes object and returns boolean
		System.out.println(points);
	}
}
/* What is the result?
A. A NullPointerException is thrown at runtime. 
B. [1, 2, 4]
C. [1, 2, 4, null]
D. [1, 3, 4, null]
E. [1, 3, 4]		>>OK
F. Compilation fails.
*/


/** NOTES
Understanding an ArrayList, p.129

import java.util.* // import whole package including ArrayList 
import java.util.ArrayList; // import just ArrayList

Creating:
ArrayList list1 = new ArrayList(); 
ArrayList list2 = new ArrayList(10); 
ArrayList list3 = new ArrayList(list2);

type -> specifying it between < and >.
This is called the diamond operator because <> looks like a diamond
ArrayList<String> list4 = new ArrayList<String>(); 
ArrayList<String> list5 = new ArrayList<>();

List and ArrayList
you can store an ArrayList in a List reference variable but not vice versa. 
The reason is that List is an interface and interfaces (ch5) can’t be instantiated.

List<String> list6 = new ArrayList<>();
ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE

!! read available methods
*/