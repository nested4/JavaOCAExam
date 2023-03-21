package ch5.interfc.q091;

import java.util.ArrayList;

public class Q91 {

	public static void main(String[] args) {
	
		ArrayList<Tiger> myList=new ArrayList<>();
		myList.add((Tiger) new Cat());
	}
}
/**
public abstract class Animal

public interface Hunter

public class Cat extends Animal implements Hunter

public class Tiger extends Cat

 */

/* Which answer fails to compile?

A) 		>> sub to super, no need explicit casting
		ArrayList<Animal> myList=new ArrayList<>();
		myList.add(new Tiger());

B) 		>> sub to super, no need explicit casting
		ArrayList<Hunter>   myList=new ArrayList<>();
		myList.add(new Cat());

C)		>> sub to super, no need explicit casting
		ArrayList<Hunter>myList=new ArrayList<>();
		myList.add(new Tiger());

D)		>> super to sub, need explicit casting to avoid compilation fail
		ArrayList<Tiger> myList=new ArrayList<>();
		myList.add(new Cat());

E)		>> sub to super, no need explicit casting
		ArrayList<Animal>myList=new ArrayList<>();
		myList.add(new Cat());

		A.Option A
		B.Option B
		C.Option C
		D.Option D			>>OK
		E.Option E
*/

/** What is the result if it is compiled?
 ArrayList<Tiger> myList=new ArrayList<>();
		myList.add((Tiger) new Cat());
 */
 



