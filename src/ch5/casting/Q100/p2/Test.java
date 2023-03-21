package ch5.casting.Q100.p2;
import  ch5.casting.Q100.p1.Acc;

/**
package  p1;
public class Acc {

	int p;          //not visible outside of the package
	private int q;  //only visible within the class
	protected int r; //visible from different package via only inheritance!
	public int s;   // visible in universe
}
**/

//package  p1;
//import p1.Acc
public class Test extends Acc{

	public static void main(String[] args) {
		Acc obj =new Test();		// reference type is Acc, it means limited accessing
		Test t =(Test) obj; 		//What is the difference between obj and t and a
		Acc a=new Acc();

		
	}

}

/*100 Which statement is true?
A. Both p and s are accessible via obj. 
B. Only s is accessible via obj.   			>>OK
C. Both r and s are accessible via obj. 
D. p, r, and s are accessible via obj.
 */

/** NOTES
 * TABLE 4.2 Access modifiers, p.180
 private (in class) < default (in package) < protected (in package or subclasses)< public  (any)
 
 Attention to casting, What are the reference type and object type?
 Accessing is determined via reference type
 
 Object vs. Reference, p.282
 We can summarize this principle with the following two rules:
1. The type of the object determines which properties exist within the object in memory.
2. The type of the reference to the object determines which methods and variables are accessible to the Java program.
 */
